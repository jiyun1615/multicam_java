package 생성자;

public class 직원 {
	String name;
	int age;
	String gender;
	
	static int cnt;
	static int ageSum;
	
	
	public 직원(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		cnt++;
		ageSum += age;
	}
	
	public static void getAvg() {
		//static 메서드에서 전역변수를 접근할 때는 같은  static변수만 접근이 가능!
		System.out.println("직원 평균 나이 : " + ageSum/cnt);
	}


	@Override
	public String toString() {
		return "직원 [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}	
}
