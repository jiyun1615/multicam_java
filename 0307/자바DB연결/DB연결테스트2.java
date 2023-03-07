package 자바DB연결;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DB연결테스트2 {

	public static void main(String[] args) {
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
			String sql = "insert into hr.bbs values (3, '화요일', '오늘왜이리힘드니ㅣ', '나나나나')";
			PreparedStatement ps = con.prepareStatement(sql);
			
			//4. sql문 전송
			int result = ps.executeUpdate();
			System.out.println(result);

		} catch (Exception e) {
			e.printStackTrace();
		}

		// 2. 오라클 11g에 연결 (java -- oracle)
	}

}
