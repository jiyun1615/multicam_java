package web03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Mock2DAO { // CRUD
	
	public int insert(Mock2VO bag) {
		int result = 0;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1.mySQL과 자바 연결할 부품 설정 성공.");
			
			String url = "jdbc:mysql://localhost:3306/multi?serverTimezone=UTC";
			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password); // Connection
			System.out.println("2. mySQL 연결 성공.");
			
			String sql = "insert into Mock2 values (?, ?, ?, ?, ?)";
			PreparedStatement ps = con.prepareStatement(sql); // PreparedStatement
			ps.setString(1, bag.getId()); // ps.setInt(1, no);
			ps.setString(2, bag.getName());
			ps.setString(3, bag.getAddress());
			ps.setString(4, bag.getMoney());
			ps.setString(5, bag.getImg());
			
			System.out.println("3. SQL문 부품(객체)으로 만들어주기 성공.");
			result = ps.executeUpdate(); // 1
			
			System.out.println("4. SQL문 오라클로 보내기 성공.");
			if (result == 1) {
				System.out.println("회원가입 성공!");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(result);
		return result;
	}
}