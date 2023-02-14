package 부품사용하기;

import 부품만들기.Cat;
import 부품만들기.Dog;

public class MyPet {

	public static void main(String[] args) {
		Cat moha = new Cat();
		moha.age = 8;
		moha.color = "white";
		moha.gender = "boy";
		moha.name = "Moha";
		
		
		moha.meow();
		moha.sleep();

		moha.introduce();
		
		System.out.println("===================");
		
		Dog myDog = new Dog();
		myDog.age = 5;
		myDog.color = "brown";
		myDog.gender = "girl";
		myDog.name = "댕댕이";
		
		myDog.bark();
		myDog.run();
		
	}

}
