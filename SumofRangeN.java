/* Find the Sum of the Numbers in a Given Interval in Java
Given the range as integer input, the objective is to find the Sum of all the Numbers that lay in the given interval using different methods. To do so we basically iterate from the base interval to the final interval and keep adding the number. Here are some of the methods to solve the above mentioned problem in Java Language.

Method 1: Using Brute Force
Method 2: Using the Formula
Method 3: Using Recursion

*/

import java.util.Scanner;
class SumofRangeN{
    public static void usingloop(int num1,int num2){
        int sum=0;
        for(int i=num1;i<=num2;i++){
            sum+=i;
        }
        System.out.println("Sum of "+ num1+"to"+num2+ " numbers is : "+sum);
    }
    public static void usingformula(int num1,int num2){
        int sum=(num2*(num2+1))/2 - (num1*(num1+1))/2 +num1 ;
        System.out.println("Sum of "+ num1 +" to "+ num2 +" numbers is : "+sum);
    }
    public static int usingrecursion(int sum,int num1,int num2){
        if(num1>num2){
            return sum;
        }
        else{
            return num1 + usingrecursion(sum,num1+1,num2);
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the num1 and Num2 numbers");
        System.out.println("Enter the num1:");
        int num1=sc.nextInt();
        System.out.println("Enter the Num2:");
        int num2=sc.nextInt();
        usingloop(num1,num2);
        usingformula(num1,num2);
        int sum=usingrecursion(0,num1,num2);
        System.out.println("Sum of "+ num1 +" to "+ num2 +" numbers is: "+sum);
    }
}