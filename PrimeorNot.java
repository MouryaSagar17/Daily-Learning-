/* Write a program to check if a given number is prime or not in java
Given an integer input, the objective is to – Write a program to check if a given number is prime or not in Java. Here are some of the Methods to Check for Prime –

Method 1: Simple iterative solution
Method 2: Optimization by break condition
Method 3: Optimization by n/2 iterations
Method 4: Optimization by √n
Method 5: Optimization by skipping even iteration
Method 6: Basic Recursion technique
We’ll discuss the above-mentioned methods in detail in the sections below.*/

import java.util.Scanner;
class PrimeorNot {
    public static void Simple(int n) {
       int count =0;
       if(n<2) {
           System.out.println(n + " is a not  Prime number");
           System.exit(0);
       }
       else{
           for (int i =1 ; i <= n; i++) {
               if (n % i== 0) {
                   count+=1;
               }
           }
       }
        if (count>2)
            System.out.println(n + " is not Prime number");
        else
            System.out.println(n + " is Prime number");
    }
    public static void  optimizedif(int n){
        boolean isPrime=true;
        if(n<2){
            isPrime=false;
        }
        else{
            for(int i=2;i<n;i++){
                if(n%i==0){
                    isPrime=false;
                    break;
                }
            }
        }
        String Result= isPrime ? "  is a Prime Number ": " is Not a Prime Number";
        System.out.println(n+Result);
    }
    public static void optinby2(int n){
        boolean isPrime=true;
        if(n<2){
            isPrime=false;
        }
        else{
            for(int i=2;i<n/2;i++){
                if(n%i==0){
                    isPrime=false;
                    break;
                }
            }
            }
        String Result= isPrime ? "  is a Prime Number ": " is Not a Prime Number";
        System.out.println(n+Result);
    }
    public static void optiofN(int n){
        boolean isPrime=true;
        if(n<2){
            isPrime=false;
        }
        else{
            for(int i=2;i<=Math.sqrt(n);i++){
                if(n%i==0){
                    isPrime=false;
                    break;
                }
            }
        }
        String Result= isPrime ? "  is a Prime Number ": " is Not a Prime Number";
        System.out.println(n+Result);
    }
    public static boolean recursion(int n,int i){
        if(n<2)
            return false;
        if(i==n)
            return true;
        if(n%i==0)
            return false;
        return recursion(n,i+1);
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        Simple(n);
        optimizedif(n);
        optinby2(n);
        optiofN(n);
        boolean result=recursion(n,2);
        String Result= result ? "  is a Prime Number ": " is Not a Prime Number";
        System.out.println(n+Result);
    }
}