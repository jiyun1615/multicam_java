package 자바DB연결;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class BBSDAO {

	//매개변수 받아와서 db연결, insert
	public void insert(int a, String b, String c, String d) {
		try {
			//오라클 자바 연결 부품 설정
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1.오라클 자바 연결 부품 설정 성공");

			//로컬 오라클 연결
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String pw = "oracle";
			Connection con = DriverManager.getConnection(url, user, pw);
			System.out.println("오라클 연결 성공");

			//매개변수로 받아온 값 넣고 sql문 만들기
			String sql = "insert into hr.BBS values(?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, a);
			ps.setString(2,b);
			ps.setString(3,c);
			ps.setString(4,d);

			//db에 sql문 사용해서 값 넣기 
			int result = ps.executeUpdate();
			System.out.println(result);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void delete(int no_) {
		try {
			// 1.커넥터 설정
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1.오라클 자바 연결 부품 설정 성공");
			
			//2.DB연결
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String pw = "oracle";
			Connection con = DriverManager.getConnection(url, user, pw);
			System.out.println("오라클 연결 성공");

			//3. sql문 만들기
			String sql = "delete from hr.BBS where no= ?";
			PreparedStatement ps = con.prepareStatement(sql);
			
			ps.setInt(1, no_);
			
			//4. sql문 전송
			int result = ps.executeUpdate();
			System.out.println(result);
			System.out.println("delete 완료");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void update(String content_, int no_) {
		try {
			// 1.커넥터 설정
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1.오라클 자바 연결 부품 설정 성공");
			
			//2.DB연결
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String pw = "oracle";
			Connection con = DriverManager.getConnection(url, user, pw);
			System.out.println("오라클 연결 성공");

			//3. sql문 만들기
			String sql = "update hr.BBS set content=? where no=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, content_);
			ps.setInt(2, no_);
			
			//4. sql문 전송
			int result = ps.executeUpdate();
			System.out.println(result);
			System.out.println("update 완료");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
