package 상속포함;

public class DrawShape {

	public static void main(String[] args) {
		Point[] p = {
				new Point(100, 100),
				new Point(140, 50),
				new Point(200, 100)				
		};
		Triange t = new Triange(p);
		Circle c = new Circle(new Point(150,150), 50);

		t.draw();
		c.draw();
	}

}
