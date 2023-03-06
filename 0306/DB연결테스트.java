package 자바DB연결;

import java.sql.DriverManager;

public class DB연결테스트 {

	public static void main(String[] args) {
		//1. 오라클 1
		try{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("1.오라클 자바 연결 부품 설정 성공");
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "system";
		String pw = "oracle";		
		DriverManager.getConnection(url, user, pw);
		System.out.println("오라클 연결 성공");
		}catch(Exception e){
			e.printStackTrace();
		}
		
		//2. 오라클 11g에 연결 (java -- oracle)
	}

}
