package 자바DB연결;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.JOptionPane;

public class MemberDAO {
	
//	public void insert() {
//		try {
//			Class.forName("oracle.jdbc.driver.OracleDriver");
//			System.out.println("1.오라클 자바 연결 부품 설정 성공");
//
//			String url = "jdbc:oracle:thin:@localhost:1521:xe";
//			String user = "system";
//			String pw = "oracle";
//			Connection con = DriverManager.getConnection(url, user, pw);
//			System.out.println("오라클 연결 성공");
//
//			String sql = "insert into hr.Member values('win1','win1','win1','win1')";
//			PreparedStatement ps = con.prepareStatement(sql);
//
//			int result = ps.executeUpdate();
//			System.out.println(result);
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}

	//매개변수 받아와서 db연결, insert
	public int insert(String a, String b, String c, String d) {
		int result = 0;
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
			String sql = "insert into hr.Member values(?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			
			ps.setString(1,a);
			ps.setString(2,b);
			ps.setString(3,c);
			ps.setString(4,d);

			//db에 sql문 사용해서 값 넣기 
			result = ps.executeUpdate();
			System.out.println(result);
			if(result == 1) {		//return 값 1=성공 / 0=실패
				System.out.println("성공");
			}
			System.out.println(result);

		} catch (Exception e) {
			//insert 실패 시, 위험한 상황이라고 판단, catch가 실행됨.
			result = 0;
//			e.printStackTrace();
		}
		System.out.println(result);
		return result;
	}
	
	public int delete(String id_) {
		int result = 0;
		
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
			String sql = "delete from hr.MEMBER where id= ?";
			PreparedStatement ps = con.prepareStatement(sql);
			
			ps.setString(1, id_);
			
			//4. sql문 전송
			result = ps.executeUpdate();
			System.out.println(result);
			System.out.println("update 완료");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public int update(String tel_, String id_) {
		int result = 0;
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
			String sql = "update hr.MEMBER set tel=? where id=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, tel_);
			ps.setString(2, id_);
			
			//4. sql문 전송
			result = ps.executeUpdate();
			System.out.println(result);
			System.out.println("update 완료");

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}
}
