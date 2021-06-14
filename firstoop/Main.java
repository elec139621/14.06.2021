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
	}

}
