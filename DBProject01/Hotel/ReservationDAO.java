package Hotel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class ReservationDAO {

	public int insert(ReservationVO bag) {
		PreparedStatement ps = null;
		Connection con = null;
		int result = 0;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// 2.DB연결
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String pw = "oracle";
			con = DriverManager.getConnection(url, user, pw);

			// 3. sql문 만들기
			String sql = "insert into hr.RESERVATION values (hr.reservation_seq.nextVal,?,?,?,?,?,?)";
			ps = con.prepareStatement(sql);
			ps.setString(1, bag.getHotelID());
			ps.setDate(2, bag.getStartDate());
			ps.setDate(3, bag.getEndDate());
			ps.setInt(4, bag.getRoomcnt());
			ps.setString(5, bag.getUserID());
			ps.setInt(6, bag.getPrice());

			// 4. sql문 전송 및 데이터 가져와서 가방에 담기
			result = ps.executeUpdate();

		} catch (Exception e) {
		}
		
		
		return result;
	}
}
