/* Program to Find the Sum of First N Natural Numbers using java
Find the Sum of First N Natural Numbers in Java
Given an integer input of N, the objective is to find the sum of all the natural numbers until the given input integer. To do so we can use different approaches to write the Java code and some such methods are mentioned below,

Method 1: Using for Loop
Method 2: Using Formula for the Sum of Nth Term
Method 3: Using Recursion

*/

import java.util.Scanner;
class SumofNnaturalnumbers{
    public void usingloop(int n){
    int sum=0;
        for(int i=1;i<=n;i++){
            sum+=i;
        }
        System.out.println("Sum of first " + n + " natural numbers is " + sum);
    }
    public void usingformula(int n){
        int sum=(n*(n+1))/2;
        System.out.println("Sum of first " + n + " natural numbers is " + sum);
    }
    public int usingrecursion(int n){
        if(n==1){
            return n;
        }
        else{
            System.out.println(n);
            return n + usingrecursion(n-1);
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        SumofNnaturalnumbers obj=new SumofNnaturalnumbers();
        obj.usingloop(n);
        obj.usingformula(n);
        int sum=obj.usingrecursion(n);
        System.out.println("Sum of first " + n + " natural numbers is " + sum);

    }
}