package 부품만들기;

public class Cat {
	public int age;
	public String name;
	public String color;
	public String gender;
	
	public void meow() {
		System.out.println("냐옹 냐옹");
	}
	
	public void sleep() {
		System.out.println(name + "가 잠을 잡니다.");
	}
	
	public void introduce() {
		System.out.println("우리집 고양이를 소개합니다.");
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age + "살");
		System.out.println("성별 : " + gender);
		System.out.println("색 : " + color);
		
	}

}
