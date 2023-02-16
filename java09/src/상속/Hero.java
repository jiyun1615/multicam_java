package 상속;

public class Hero {
	public static void main(String[] args) {
		사람 p = new 사람();
		p.name = "김영웅";
		p.age = 25;
		p.sleep();
		p.eat();
		System.out.println(p);
		System.out.println("=====================");
		Man m = new Man();
		m.run();
		System.out.println("=====================");
		SuperMan s = new SuperMan();
		s.name = "클라크";
		s.power = 1000000;
		s.age = 200;
		s.fly = true;
		s.space();
		System.out.println("=====================");
		Woman w = new Woman();
		w.name = "나영희";
		w.cook = false;
		w.eat();
		w.drives();
		System.out.println(w);
		System.out.println("=====================");
		WonderWoman ww = new WonderWoman();
		ww.name = "원더우먼";
		ww.age = 20;
		ww.psychic = 10000;
		ww.sleep();
		ww.punch();
		System.out.println(ww);
		
		
	}
	
	
	
}
