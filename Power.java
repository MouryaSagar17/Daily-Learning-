/*
Find the Power of a Number in Java Language
Given two integers as the number and power inputs, the objective is to raise the number input to the power input and print the value. To do so we’ll use the concepts of loops and recursion. Here are few methods to Find the Power of a Number in Java Language,

Method 1: Without While Loop
Method 2: With While Loop
We’ll discuss the above mentioned methods in depth in the upcoming sections.*/

import java.util.Scanner;
public class Power{
    public void power(double base,double exp){
        double result=1.0;
        for(int i=1;i<=exp;i++){
            result*=base;
        }
        System.out.println(base+"^"+exp+"="+result);
    }
    public void withWhile(double base,double exp){
        double result=1.0;
        double temp=exp;
        while(temp!=0){
            result*=base;
            temp--;
        }
        System.out.println(base+"^"+exp+"="+result+"");
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Base of the power");
        double base=sc.nextInt();
        System.out.println("Enter the Exponent of the power");
        double exp=sc.nextInt();
        double result=Math.pow(base,exp);
        System.out.println(base+"^"+exp+"="+result+" ");
        Power p1=new Power();
        p1.power(base,exp);
        p1.withWhile(base,exp);


    }
}
