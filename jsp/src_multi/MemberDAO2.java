package multi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Locale;

import javax.swing.JOptionPane;

public class MemberDAO2 {

	public ArrayList<MemberVO> list() {
		ResultSet rs = null; // 항목명 + 결과 데이터를 담고 있는 테이블

		// 가방들 넣어줄 큰 컨테이너 역할을 부품이 필요!
		// ArrayList<MemberVO> ==> MemberVO만 들어간 arraylist라는 의미
		ArrayList<MemberVO> list = new ArrayList<>();

		MemberVO bag = null;
		try {
			// 1.오라클 11g와 연결한 부품 설정
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1.mySQL과 자바 연결할 부품 설정 성공.");
			Locale.setDefault(Locale.US); // 맥 locale에러나신 분들만!!!

			// 2.오라클 11g에 연결해보자.(java --- oracle)
			// String url = "jdbc:mysql://localhost:3306/multi";
			String url = "jdbc:mysql://localhost:3306/multi?serverTimezone=UTC";
			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password); // Connection
			// String data = JOptionPane.showInputDialog("이름입력"); //String, 임아무개
			System.out.println("2. mySQL 연결 성공.");

			String sql = "select * from member";
			PreparedStatement ps = con.prepareStatement(sql); // PreparedStatement
			// 삭제!!!! ps.setString(1, id);
			System.out.println("3. SQL문 부품(객체)으로 만들어주기 성공.");

			rs = ps.executeQuery(); // select문 전송시
			System.out.println("4. SQL문 오라클로 보내기 성공.");
			while (rs.next()) { // 검색결과가 있는지 여부는 rs.next()
				// true이면 있다라는 의미, false이면 없다라는 의미
				// 1. 검색겨로가가 있으면,
				// System.out.println("검색결과 있음. 성공.");
				// 2. 각 컬럼에서 값들을 꺼내오자.
				String id2 = rs.getString(1); // id
				String pw = rs.getString("pw"); // pw
				String name = rs.getString(3); // name
				String tel = rs.getString(4); // tel
				// System.out.println( id2 + " "
//									+ pw + " " 
//									+ name + " " 
//									+ tel);
				// 검색결과를 검색화면 UI부분을 주어야 함.
				// 3. 가방을 만들자.
				bag = new MemberVO();
				bag.setId(id2);
				bag.setPw(pw);
				bag.setName(name);
				bag.setTel(tel);

				// 4. list에 bag을 추가해주자.
				list.add(bag);
			}
			// System.out.println(result);
			ps.close();
			rs.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		// return id, pw, name, tel은 XXXXX!
		// return 뒤에는 반드시 여러 데이터를 묶어서 리턴해주어야 함.
		// 검색결과가 있을 때는 bag에 데이터가 들어있음.
		// 검색결과가 없을 때는 bag에 무엇이 들어있나? null
		return list;

	}

	// 매개변수 받아와서 db연결, insert
	public int insert(MemberVO bag) {
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
			String sql = "insert into Member values(?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setString(1, bag.getId());
			ps.setString(2, bag.getPw());
			ps.setString(3, bag.getName());
			ps.setString(4, bag.getTel());

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

	public int delete(MemberVO bag) {
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
			String sql = "delete from MEMBER where id= ?";
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setString(1, bag.getId());

			// 4. sql문 전송
			result = ps.executeUpdate();
			System.out.println(result);
			System.out.println("delete 완료");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	public int update(MemberVO bag) {
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
			String sql = "update MEMBER set tel=? where id=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, bag.getTel());
			ps.setString(2, bag.getId());

			// 4. sql문 전송
			result = ps.executeUpdate();
			System.out.println(result);
			System.out.println("update 완료");

		} catch (Exception e) {
			e.printStackTrace();
		}

		return result;
	}

	public MemberVO one(String id) {
		ResultSet rs = null; // 항목명 + row값 담고있는 테이블 : ResultSet
		MemberVO bag = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1.mysql 자바 연결 부품 설정 성공");

			// 로컬 오라클 연결
			String url = "jdbc:mysql://localhost:3306/multi?serverTimezone=UTC";
			String user = "root";
			String pw = "1234";
			Connection con = DriverManager.getConnection(url, user, pw);
			System.out.println("mysql 연결 성공");

			// 3. sql문 만들기
			String sql = "select * from MEMBER where id = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, id);

			// 4. sql문 전송
			rs = ps.executeQuery();
			boolean check = rs.next();

			if (check) {
				String id_ = rs.getString(1);
				String pw_ = rs.getString(2);
				String name_ = rs.getString(3);
				String tel_ = rs.getString(4);

				System.out.println(id_ + " " + pw_ + " " + name_ + " " + tel_);
				bag = new MemberVO();
				bag.setId(id_);
				bag.setPw(pw_);
				bag.setName(name_);
				bag.setTel(tel_);
			}
			System.out.println("check = " + check);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return bag;
	}

}
