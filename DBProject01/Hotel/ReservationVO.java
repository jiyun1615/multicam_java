package Hotel;

import java.sql.Date;

public class ReservationVO {
	private int reservationID;
	private String hotelID;
	private Date startDate;
	private Date endDate;
	private int roomcnt;
	private String userID;
	private int price;
	
	public int getReservationID() {
		return reservationID;
	}
	public void setReservationID(int reservationID) {
		this.reservationID = reservationID;
	}
	public String getHotelID() {
		return hotelID;
	}
	public void setHotelID(String hotelID) {
		this.hotelID = hotelID;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public int getRoomcnt() {
		return roomcnt;
	}
	public void setRoomcnt(int roomcnt) {
		this.roomcnt = roomcnt;
	}
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "ReservationVO [reservationID=" + reservationID + ", hotelID=" + hotelID + ", startDate=" + startDate
				+ ", endDate=" + endDate + ", roomcnt=" + roomcnt + ", userID=" + userID + ", price=" + price + "]";
	}
	
	
}
