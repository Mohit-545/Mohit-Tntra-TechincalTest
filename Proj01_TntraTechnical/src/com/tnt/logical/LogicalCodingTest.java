//LogicalCodingTest.java
package com.tnt.logical;

import java.util.Arrays;

public class LogicalCodingTest {

	public static void main(String[] args) {
		//Problem 1: Program to count occurrences of a given character in a string.
				System.out.println(countCharInString("geeksforgeeks", 'e'));
		
		//  Problem 2:  Determine whether a given string is Palindrome
				checkPalindrome("anna");
		
		 //Problem 3:  Biggest and smallest number in an array
				findbiggestAndSmalletNum(new int[] {1,2,4,5,3});

		// Problem 4:  Swap two Strings Without Using any Third Variable
				swapString("Hello", "World");
		
		 //Problem 5: Swap two numbers without using a temporary variable
				swapNum(10, 50);

		
	}//main

//Problem 1: Program to count occurrences of a given character in a string.
//================================================================================
	public static int countCharInString(String s, char c) {
		int count = 0;
		for(int i=0; i<s.length(); i++) {
			if(i==s.length()) {
				break;
			}//if
			else if((s.charAt(i) == c)) {
				count++;
			}//else if
		}//for1
		return count;
	}//method
	
//  Problem 2:  Determine whether a given string is Palindrome
//================================================================================
	public static void checkPalindrome(String str) {
			StringBuilder sb = new StringBuilder();
			int j = 0;
			for(int i=str.length()-1; i>=0; i--) {
				sb.append(str.charAt(i));
			}//for
			if(sb.toString().trim().equals(str)) {
				System.out.println("The given string is palindrome :: true");
			}//if
			else 
				System.out.println("The given string is not palindrome :: false");
		}//method
	
 //Problem 3:  Biggest and smallest number in an array
//================================================================================	
	public static void findbiggestAndSmalletNum(int[] arr) {
		//Arranging the given array in ascending order by using pre-defined method sort of class Arrays
		Arrays.sort(arr);
		//printing the smallest and largest array
		System.out.println("Smallest Array :: "+arr[0]);
		System.out.println("Largest Array :: "+arr[arr.length-1]);
	}//method
	
// Problem 4:  Swap two Strings Without Using any Third Variable	
//================================================================================	
	public static void swapString(String s1, String s2) {
		System.out.println("Input String s1 :: "+s1+"\n"+"Input String s2 :: "+s2+"\n");
		int i = s1.length();
		//concating both the input Strings
		s1 = s1.concat(s2);
		//extracting s1 String from s1 and storing in s2 String
		s2=s1.substring(0,i);
		//storing s2 String in s1 String
		s1=s1.substring(i);
		
		System.out.println("Output String s1 :: "+s1+"\n"+"Output String s2 :: "+s2);
	}//method
	
// Problem 5: Swap two numbers without using a temporary variable
//================================================================================
	public static void swapNum(int num1, int num2) {
		System.out.println("Input Numbers num1 :: "+num1+"\n"+"Input Numbers num2 :: "+num2+"\n");
		num1 = num1+num2;
		num2 = num1-num2;
		num1 = num1-num2;
		System.out.println("Output Numbers num1 :: "+num1+"\n"+"Output Numbers num2 :: "+num2+"\n");
		
	}//method
		
}//class
