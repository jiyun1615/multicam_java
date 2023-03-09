package Hotel;

public class HotelVO {
	private String hotelID;
	private String name;
	private int price;
	private float score;
	private String location;
	private String tel;
	private String photo;
	
	
	public String getHotelID() {
		return hotelID;
	}
	public void setHotelID(String hotelID) {
		this.hotelID = hotelID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public float getScore() {
		return score;
	}
	public void setScore(float score) {
		this.score = score;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	@Override
	public String toString() {
		return "HotelVO [hotelID=" + hotelID + ", name=" + name + ", price=" + price + ", score=" + score
				+ ", location=" + location + ", tel=" + tel + ", photo=" + photo + "]";
	}
	
	
	
}
