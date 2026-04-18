/*
Find the Fibonacci Series up to Nth Term in Java Language
Given an integer input for the Nth value, the objective is to Find the Fibonacci Series up to the Nth term using Loops and recursion in Java Language. To do so we’ll use the following methods,

Method 1: Using Iteration
Method 2: Using Recursion
Method 3: Using Static Variable
Method4: Using Direct Formula*/

import java.util.Scanner;
class FibonacciSeries{
    static int nextterm1;
    static int a1=0,b1=1;
    public static void usingLoop(int n){
        int a=0,b=1;
        for(int i=2;i<=n;i++){
            System.out.print(a+",");
            int nextterm=a+b;
            a=b;
            b=nextterm;
        }
    }
    public static int usingRecursion(int n){
        System.out.print(a1+",");
        if(n>0){
            nextterm1=a1+b1;
            a1=b1;
            b1=nextterm1;
            usingRecursion(n-1);
        }

        return 0;
    }
    public static void usingArray(int n){

        int arr[]=new int[n+1];
        arr[0]=0;
        arr[1]=1;
        System.out.print(arr[0]+" "+arr[1]+",");
        for(int i=2;i<n;i++){
            arr[i]=arr[i-1]+arr[i-2];
            System.out.print(arr[i]+",");
        }
    }
    public static void UsingFormula(double phi,int n){
        for(int i=0;i<n;i++){
            System.out.print(Math.round(Math.pow(phi,i)/Math.sqrt(5))+", ");
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        usingLoop(n);
        System.out.println();
        usingRecursion(n-2);
        System.out.println();
        usingArray(n);
        System.out.println();
        double phi=(1+Math.sqrt(5))/2;
        UsingFormula(phi,n);
    }
}