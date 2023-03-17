package multi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Locale;

import javax.swing.JOptionPane;

public class BBSDAO3 {
	
	public ArrayList<BbsVO> list() {
		ResultSet rs = null; // 항목명 + 결과 데이터를 담고 있는 테이블

		ArrayList<BbsVO> list = new ArrayList<>();

		BbsVO bag = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1.mySQL과 자바 연결할 부품 설정 성공.");

			String url = "jdbc:mysql://localhost:3306/multi?serverTimezone=UTC";
			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password); // Connection
			System.out.println("2. mySQL 연결 성공.");

			String sql = "select * from BBS";
			PreparedStatement ps = con.prepareStatement(sql); // PreparedStatement
			System.out.println("3. SQL문 부품(객체)으로 만들어주기 성공.");

			rs = ps.executeQuery(); // select문 전송시
			System.out.println("4. SQL문 오라클로 보내기 성공.");
			while (rs.next()) { // 검색결과가 있는지 여부는 rs.next()

				int no = rs.getInt(1);
				String title = rs.getString(2);
				String content = rs.getString(3);
				String writer = rs.getString(4);

				bag = new BbsVO();
				bag.setNo(no);
				bag.setTitle(title);
				bag.setContent(content);
				bag.setWriter(writer);
				
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
	public int insert(BbsVO bag) {
		int result = 0;
		try {
			// 오라클 자바 연결 부품 설정
			// 1.커넥터 설정
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1.mysql 자바 연결 부품 설정 성공");

			// 로컬 오라클 연결
			String url = "jdbc:mysql://localhost:3306/multi?serverTimezone=UTC";
			String user = "root";
			String pw = "1234";
			Connection con = DriverManager.getConnection(url, user, pw);
			System.out.println("mysql 연결 성공");

			// 매개변수로 받아온 값 넣고 sql문 만들기
			String sql = "insert into bbs (title, content, writer) values (?, ?, ?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(2, bag.getTitle());
			ps.setString(3, bag.getContent());
			ps.setString(4, bag.getWriter());

			// db에 sql문 사용해서 값 넣기
			result = ps.executeUpdate();
			System.out.println(result);

		} catch (Exception e) {
			e.printStackTrace();
			result = 0;
		}
		return result;
	}

	public int delete(int no_) {
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
			String sql = "delete from BBS where no= ?";
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setInt(1, no_);

			// 4. sql문 전송
			result = ps.executeUpdate();
			if (result != 0) {
				result = 1;
			} else {
				result = 0;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return result;
	}

	public void update(BbsVO bag) {
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
			String sql = "update BBS set content=? where no=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, bag.getContent());
			ps.setInt(2, bag.getNo());

			// 4. sql문 전송
			int result = ps.executeUpdate();
			System.out.println(result);
			System.out.println("update 완료");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public BbsVO one(int no) {
		ResultSet rs = null; // 항목명 + row값 담고있는 테이블 : ResultSet
		BbsVO bag = null;
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
			String sql = "select * from BBS where no = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, Integer.toString(no));

			// 4. sql문 전송
			rs = ps.executeQuery();		//executeQuery : 테이블형태 받아오기
			boolean check = rs.next();

			if (check) {
				String no_ = rs.getString(1);
				String title_ = rs.getString(2);
				String content_ = rs.getString(3);
				String writer_ = rs.getString(4);

				bag = new BbsVO();
				bag.setNo(Integer.valueOf(no_));
				bag.setTitle(title_);
				bag.setContent(content_);
				bag.setWriter(writer_);
			}
			System.out.println("check = " + check);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return bag;
	}
}
