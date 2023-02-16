package 생성자;

public class TV사용하기 {

	public static void main(String[] args) {
		TV tv1 = new TV();
		TV tv2 = new TV();
		TV tv3 = new TV(13, 5, true);
		
		System.out.println(tv3.toString());
		
		
		tv1.ch = 10;
		tv1.vol = 9;
		tv1.onOff = true;
		tv1.turnCh();
//		System.out.println(tv1.ch + " " + tv1.vol + " " + tv1.onOff);
		System.out.println(tv1.toString());
		System.out.println(tv1);
		
		
		System.out.println("-------------------------");
		tv2.ch = 20;
		tv2.vol = 11;
		tv2.onOff = false;
		tv2.youtube();
		System.out.println(tv2.ch + " " + tv2.vol + " " + tv2.onOff);
		System.out.println(tv2.toString());
		System.out.println(tv2);
	}

}
