/* Find the Sum of N Natural Numbers in Java
Given an integer num input as the upper limit, the objective is to sum up all the numbers that lay in the interval starting from 0 to the integer input “num”. Here are some of the methods to sum up all the numbers in a given interval

Method 1: Using for Loop
Method 2: Using Formula
Method 3: Using Recursion

*/

import java.util.Scanner;
class SumN{
    public static void usingloop(int n){
        int sum=0;
        for(int i=0;i<=n;i++){
            sum+=i;
        }
        System.out.println("Sum of "+ n+ " numbers is : "+sum);
    }
    public static void usingformula(int n){
        int sum=(n*(n+1))/2;
        System.out.println("Sum of "+ n +" numbers is : "+sum);
    }
    public static int usingrecursion(int n){
        if(n==1){
            return n;
        }
        else{
            return n + usingrecursion(n-1);
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        usingloop(n);
        usingformula(n);
        int sum=usingrecursion(n);
        System.out.println("Sum of "+ n +" numbers is: "+sum);
    }
}