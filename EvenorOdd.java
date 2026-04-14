/*Check Whether a Number is Even or Odd in Java
Given an integer input the objective is to write a Java code to Check Whether a Number is Even or Odd. To do so the main idea is to divide the number by 2 and check if it’s divisible or not. It’s an Even number is it’s perfectly divisible by 2 or an Odd number otherwise.

Here are the Methods to solve the above mentioned problem,

Method 1 : Using Brute Force
Method 2 : Using Ternary Operator
Method 3 : Using Bitwise Operators
We’ll discuss the above mentioned methods in detail in the next section.
*/

import java.util.Scanner;
class EvenorOdd{
	
public static void Brute(int n){
	if (n%2!=0){
		System.out.println(n+"Odd Number");
	}
	else{
		System.out.println(n+"Even Number");
	}
}
public static void Ternary(int n){
	
	String result=n%2!=0? n+"Odd Number" : n+"Even Number";
	System.out.println(result);
}
public static boolean isEven(int n){
	return (n&1)==0;
}
public static void Bitwise(int n){
	if(isEven(n)){
		System.out.println(n+"Even Number");
	}
	else{
		System.out.println(n+"Odd Number");
	}
}
public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	Brute(n);
	Ternary(n);
	Bitwise(n);
}
}