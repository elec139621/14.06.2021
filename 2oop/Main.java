package proj2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		System.out.println("good morning ...");
		
		Scanner sc = new Scanner(System.in); // ctrl + 1
	
		int x = 5;
		
		int[] arr = new int[10];
		
		MobilePhone iphone = new MobilePhone();
		iphone.m_color = "white";
		iphone.m_size = 4.8f;
		iphone.m_vendor = "apple";
		System.out.println();
		
		iphone.turnOn();
		iphone.turnOff();
		iphone.ring();
		
		// create a samsung phone:
		// vendor = samsung, color = black, size = 6.7f
		
		MobilePhone samsung = new MobilePhone();
		samsung.m_color = "black";
		samsung.m_size = 6.7f;
		iphone.m_vendor = "smasung s21 utlra+";
		System.out.println();
		
		samsung.turnOn();
		samsung.turnOff();
		samsung.ring();
		
		
		// create class Car
		// attributes: 
		// int m_year
		// String brand
		// String model
		// long price
		// functionality:
		// turnOnEngine
		// turnOfEngine
		// drive
		// wash 
		Car honda = new Car(2021, "Honda", "Kamry", 150000, false);
		Car ferrari = new Car(2022, "Ferrari", "Testa roca", 507999, true);
		// what if i forget?
		// how to print the car values
		System.out.println(honda);
		System.out.println(ferrari);
		
		// targil:
		// take mobile phone class
		// add ctor with all arguments ... also populate fields
		// also implement toString
		// create phones using the new ctor
		// println the phone
	}

}
