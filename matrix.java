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
	public static int[] initArray() { // *0
		//int[] func_arr;
		int[] func_arr = new int[10];
		return func_arr;
	}
	
	public static void changeArray(int[] func_arr) { // *0
		//int[] func_arr;
		func_arr[0] = 100;
	}
	
	public static int changeX(int x) {
		x++;
		return x;
	}
	
	public static void main(String[] args) {

		System.out.println("good morning ...");
		
		Scanner sc = new Scanner(System.in); // ctrl + 1
		
		int[] arr = new int[10]; // all zeros -- default
		//initArray(arr);
		changeArray(arr);
		System.out.println(arr[0]);
		int x = 1;
		x = changeX(x);
		System.out.println(x);
		
		//int y ;
		//System.out.println(y); // error
		
		boolean[][] jagged = new boolean[5][];
		// jagged[0] --- null!!!
		jagged[0] = new boolean[5];
		jagged[1] = new boolean[1];
		jagged[2] = new boolean[0];
		jagged[3] = new boolean[10];
		jagged[4] = new boolean[20];
		// turn all seats to occupied
		for(int row = 0; row < jagged.length; row++) {
			for(int column = 0 ; column < jagged[row].length; column++) {
				jagged[row][column] = true;
			}
		}
		
		// create function which initializie the movie rows  [hint: return value]
		// create function which sets each elemtent to true or false
		// [hint: public static void changeAll(boolean[][] seats, boolean changeTo)]
		// try to debug		
		// *etgar: create a function which print all the values of the arrays
	}

}
