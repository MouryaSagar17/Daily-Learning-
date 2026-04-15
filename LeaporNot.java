/* Check Whether or Not the Year is a Leap Year in Java
Given an integer input for the year, the objective is to check whether or not the user
given input “year” is a Leap year or not.
In order to do so we check if the integer input satisfies the conditions for a leap year mentioned below.
Therefore, we write a Java code to check and tell if it’s a leap year or not.
Some of the methods to check for leap year are mentioned below

Method 1: Using if-else Statements 1
Method 2: Using if-else Statements 2
Method 3: Using Ternary Operator
Method 4: Bonus Boolean method
We’ll discuss the above-mentioned methods in detail in the upcoming sections. Before we get to coding check the blue box below for better understanding.*/

import java.util.*;
class LeaporNot{
    public static void usingif(int year){
        if(year%4==0 && year%100!=0||year%400==0){
            System.out.println(year+" is a leap year");
        }
        else{
            System.out.println(year+ " is a not a leap year");
        }
    }
    public static void usingternary(int year){
        String result=year%4==0 && year%100!=0 ||year%400==0 ? "is a Leap year":"is Not a Leap year";
        System.out.println(year+" "+result);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the year");
        int year=sc.nextInt();
        usingif(year);
        usingternary(year);
    }
}