package multi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ProductDAO {

	public ArrayList<ProductVO> list() {
		ResultSet rs = null;

		ArrayList<ProductVO> list = new ArrayList<>();

		ProductVO bag = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			String url = "jdbc:mysql://localhost:3306/multi?serverTimezone=UTC";
			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password); // Connection

			String sql = "select * from product";
			PreparedStatement ps = con.prepareStatement(sql); // PreparedStatement

			rs = ps.executeQuery();
			
			while (rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2); // id
				String content = rs.getString(3); // pw
				int price = rs.getInt(4); // name
				String company = rs.getString(5); // tel
				String img = rs.getString(6);
				bag = new ProductVO();
				bag.setID(id);
				bag.setName(name);
				bag.setContent(content);
				bag.setPrice(price);
				bag.setCompany(company);
				bag.setImg(img);

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
	public int insert(ProductVO bag) {
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
			String sql = "insert into PRODUCT (name, content, price, company, img) values (?,?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setString(1, bag.getName());
			ps.setString(2, bag.getContent());
			ps.setInt(3, bag.getPrice());
			ps.setString(4, bag.getCompany());
			ps.setString(5, bag.getImg());

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
			String sql = "delete from PRODUCT where id= ?";
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

	public int update(ProductVO bag) {
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
			String sql = "update PRODUCT set content=? where id=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, bag.getContent());
			ps.setInt(2, bag.getID());

			// 4. sql문 전송
			result = ps.executeUpdate();
			System.out.println(result);
			System.out.println("update 완료");

		} catch (Exception e) {
			e.printStackTrace();
		}

		return result;
	}

	public ProductVO one(int id) {
		ResultSet rs = null; // 항목명 + row값 담고있는 테이블 : ResultSet
		ProductVO bag = null;
		try {
			// 1.커넥터 설정
			Class.forName("com.mysql.cj.jdbc.Driver");

			// 2.DB연결
			String url = "jdbc:mysql://localhost:3306/multi?serverTimezone=UTC";
			String user = "root";
			String pw = "1234";
			Connection con = DriverManager.getConnection(url, user, pw);

			// 3. sql문 만들기
			String sql = "select * from Product where id = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, id);

			// 4. sql문 전송
			rs = ps.executeQuery();
			boolean check = rs.next();

			if (check) {
				String name = rs.getString(2);
				String content = rs.getString(3);
				int price = rs.getInt(4);
				String company = rs.getString(5);
				String img = rs.getString(6);

				bag = new ProductVO();
				bag.setID(id);
				bag.setName(name);
				bag.setContent(content);
				bag.setPrice(price);
				bag.setCompany(company);
				bag.setImg(img);
			}
			System.out.println("check = " + check);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return bag;
	}

}
