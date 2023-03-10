package Hotel;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class ReservationDAO {

	public List<HotelVO> filtering(float filt, int choice) {

		List<HotelVO> list = new ArrayList<>();
		ResultSet rs = null;
		PreparedStatement ps = null;
		Connection con = null;

		try {
			// 1.커넥터 설정
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// 2.DB연결
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String pw = "oracle";
			con = DriverManager.getConnection(url, user, pw);

			// 3. sql문 만들기
			String sql = "select * from hr.HOTEL where score >= ? order by price";
			String sor = "";
			if (choice == 1) sor = "";		//가격 저렴한 순 정렬
			else if (choice == 2) sor = " desc";	//가격 비싼 순 정렬
			sql += sor;
			
			ps = con.prepareStatement(sql);
			ps.setString(1, Float.toString(filt));

			// 4. sql문 전송 및 데이터 가져와서 가방에 담기
			rs = ps.executeQuery();
			while (rs.next()) {
				HotelVO bag = new HotelVO();
				bag.setHotelID(rs.getString(1));
				bag.setName(rs.getString(2));
				bag.setPrice(rs.getInt(3));
				bag.setScore(rs.getFloat(4));
				bag.setLocation(rs.getString(5));
				bag.setTel(rs.getString(6));
				bag.setPhoto(rs.getString(7));

				//list에 가방 담기
				list.add(bag);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (ps != null) {
					ps.close();
				}
				if (con != null) {
					con.close();
				}
			} catch (SQLException e) {
			}
		}
		return list;
	}

	

}
