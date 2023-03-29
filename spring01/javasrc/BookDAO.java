package com.multi.mvc01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Locale;

import javax.swing.JOptionPane;

import org.springframework.stereotype.Component;

//싱글톤 만들기
@Component
public class BookDAO {

	// 매개변수 받아와서 db연결, insert
	public int insert(BookDTO bag) {
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
			String sql = "insert into book (name, url, img) values (?, ?, ?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, bag.getName());
			ps.setString(2, bag.getUrl());
			ps.setString(3, bag.getImg());

			// db에 sql문 사용해서 값 넣기
			result = ps.executeUpdate();
			System.out.println(result);

		} catch (Exception e) {
			e.printStackTrace();
			result = 0;
		}
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
			String sql = "delete from book where id= ?";
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setInt(1, id);

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
	
	public ArrayList<BookDTO> list() {
		ResultSet rs = null; 

		ArrayList<BookDTO> list = new ArrayList<>();

		BookDTO bag = null;
		try {
			// 1.오라클 11g와 연결한 부품 설정
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1.mySQL과 자바 연결할 부품 설정 성공.");
			Locale.setDefault(Locale.US); // 맥 locale에러나신 분들만!!!

			// 2.오라클 11g에 연결해보자.(java --- oracle)
			String url = "jdbc:mysql://localhost:3306/multi?serverTimezone=UTC";
			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password); // Connection
			// String data = JOptionPane.showInputDialog("이름입력"); //String, 임아무개
			System.out.println("2. mySQL 연결 성공.");

			String sql = "select * from book";
			PreparedStatement ps = con.prepareStatement(sql); // PreparedStatement
			// 삭제!!!! ps.setString(1, id);
			System.out.println("3. SQL문 부품(객체)으로 만들어주기 성공.");

			rs = ps.executeQuery(); // select문 전송시
			System.out.println("4. SQL문 오라클로 보내기 성공.");
			while (rs.next()) { // 검색결과가 있는지 여부는 rs.next()
				int id_ = rs.getInt(1); // id
				String name_ = rs.getString(2); 
				String url_ = rs.getString(3); 
				String img_ = rs.getString(4); 
				bag = new BookDTO();
				bag.setId(id_);
				bag.setName(name_);
				bag.setUrl(url_);
				bag.setImg(img_);
				
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
	
	public BookDTO one(int id) {
		ResultSet rs = null; 
		BookDTO bag = null;
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
			String sql = "select * from book where id = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, id);

			// 4. sql문 전송
			rs = ps.executeQuery();
			boolean check = rs.next();

			if (check) {
				int id_ = rs.getInt(1);
				String name_ = rs.getString(2);
				String url_ = rs.getString(3);
				String img_ = rs.getString(4);

				bag = new BookDTO();
				bag.setId(id_);
				bag.setName(name_);
				bag.setUrl(url_);
				bag.setImg(img_);
			}
			System.out.println("check = " + check);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return bag;
	}
}
