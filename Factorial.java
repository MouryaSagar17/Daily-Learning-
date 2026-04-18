/*
* Factorial of a Number in Java
Here on this page, we will learn how to Find the Factorial of a Number in Java. Factorial is a sequence of a number where we multiply by all previous numbers.

factorial of n (n!) = 1 * 2 * 3 * 4....n


Note : 0! = 1 and 1! = 1

Example :
5! = 1 * 2 * 3 * 4 * 5 = 120
Factorial of a Number in Java 1

Methods we will discuss
Iterative approach for factorial
Recursive approach for factorial */

import java.util.Scanner;
public class Factorial{
    public static void usingLoop(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact*=i;
        }
        System.out.println("Factorial of "+n+" "+fact);
    }
    public int Usingrecursion(int n){
        if(n==0){
            return 1;
        }
        return n* Usingrecursion(n-1);
    }
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number:");
    int n=sc.nextInt();
    Factorial fact=new Factorial();
    fact.usingLoop(n);
    int fact1=fact.Usingrecursion(n);
    System.out.println("Factorial of "+n+" "+fact1);
    }
}
