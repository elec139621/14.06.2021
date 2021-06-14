package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
	
	// private protected public default
	
	public static void main(String[] args) {

		System.out.println("good morning ...");
		
		Scanner sc = new Scanner(System.in); // ctrl + 1
		
		// short circuit
		long num = sc.nextLong(); // -5
		//   NO            
		if (num >= 0 && num <= 100) {
			//if ()
		}
		//else if ()
		//else
		
		// - 200
		//    YES
		if (num < 0 || num > 100) {
			// illegal
		}
		
		if (num > 0) 
		{
			System.out.println("positive");
		}
		else if (num == 0) {
			System.out.println("zero");
		}
		else {
			System.out.println("negative");
		}
		
		System.out.println(num > 0 ? "positive" : num == 0 ? "zero" : "negative");
		
		
		
	}

}
