package multi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;


public class MovieDAO {

	public ArrayList<MovieVO> list() {
		ResultSet rs = null; // 항목명 + 결과 데이터를 담고 있는 테이블

		ArrayList<MovieVO> list = new ArrayList<>();

		MovieVO bag = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			String url = "jdbc:mysql://localhost:3306/multi?serverTimezone=UTC";
			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password); // Connection

			String sql = "select * from MOVIE";
			PreparedStatement ps = con.prepareStatement(sql); // PreparedStatement

			rs = ps.executeQuery(); // select문 전송시
			while (rs.next()) { // 검색결과가 있는지 여부는 rs.next()
				String ID = rs.getString("id"); 
				String title= rs.getString("title"); 
				String content = rs.getString("content"); 
				String location= rs.getString("location"); 
				String director = rs.getString("director"); 
				bag = new MovieVO();
				
				bag.setID(ID);
				bag.setTitle(title);
				bag.setContent(content);
				bag.setLocation(location);
				bag.setDirector(director);

				list.add(bag);
			}
			ps.close();
			rs.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;

	}

	// 매개변수 받아와서 db연결, insert
	public int insert(MovieVO bag) {
		int result = 0;
		try {
			// 오라클 자바 연결 부품 설정
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1.mysql 자바 연결 부품 설정 성공");

			// 로컬 오라클 연결
			String url = "jdbc:mysql://localhost:3306/multi?serverTimezone=UTC";
			String user = "root";
			String pw = "1234";
			Connection con = DriverManager.getConnection(url, user, pw);
			System.out.println("mysql 연결 성공");

			// 매개변수로 받아온 값 넣고 sql문 만들기
			String sql = "insert into MOVIE values (?,?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setString(1, bag.getID());
			ps.setString(2, bag.getTitle());
			ps.setString(3, bag.getContent());
			ps.setString(4, bag.getLocation());
			ps.setString(5, bag.getDirector());

			// db에 sql문 사용해서 값 넣기
			result = ps.executeUpdate();
			System.out.println(result);
			if (result == 1) { // return 값 1=성공 / 0=실패
				System.out.println("성공");
			}
			System.out.println(result);

		} catch (Exception e) {
			// insert 실패 시, 위험한 상황이라고 판단, catch가 실행됨.
			result = 0;
//			e.printStackTrace();
		}
		System.out.println(result);
		return result;
	}

	public int delete(int id) {
		int result = 0;

		try {
			// 1.커넥터 설정
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1.mysql 자바 연결 부품 설정 성공");

			// 로컬 오라클 연결
			String url = "jdbc:mysql://localhost:3306/multi?serverTimezone=UTC";
			String user = "root";
			String pw = "1234";
			Connection con = DriverManager.getConnection(url, user, pw);
			System.out.println("mysql 연결 성공");

			// 3. sql문 만들기
			String sql = "delete from Movie where id= ?";
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setInt(1, id);

			// 4. sql문 전송
			result = ps.executeUpdate();
			System.out.println(result);
			System.out.println("delete 완료");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	public int update(MovieVO bag) {
		int result = 0;
		try {
			// 1.커넥터 설정
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1.mysql 자바 연결 부품 설정 성공");

			// 로컬 오라클 연결
			String url = "jdbc:mysql://localhost:3306/multi?serverTimezone=UTC";
			String user = "root";
			String pw = "1234";
			Connection con = DriverManager.getConnection(url, user, pw);
			System.out.println("mysql 연결 성공");

			// 3. sql문 만들기
			String sql = "update Movie set tel=? where id=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, bag.getContent());
			ps.setString(2, bag.getID());

			// 4. sql문 전송
			result = ps.executeUpdate();
			System.out.println(result);
			System.out.println("update 완료");

		} catch (Exception e) {
			e.printStackTrace();
		}

		return result;
	}

	public MovieVO one(String id) {
		ResultSet rs = null; // 항목명 + row값 담고있는 테이블 : ResultSet
		MovieVO bag = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			String url = "jdbc:mysql://localhost:3306/multi?serverTimezone=UTC";
			String user = "root";
			String pw = "1234";
			Connection con = DriverManager.getConnection(url, user, pw);

			String sql = "select * from Movie where id = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, id);

			// 4. sql문 전송
			rs = ps.executeQuery();
			boolean check = rs.next();

			if (check) {
				String title = rs.getString(2);
				String content = rs.getString(3);
				String location = rs.getString(4);
				String director = rs.getString(5);

				bag = new MovieVO();
				bag.setID(id);
				bag.setTitle(title);
				bag.setContent(content);
				bag.setLocation(location);
				bag.setDirector(director);
			}
			System.out.println("check = " + check);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return bag;
	}

}
