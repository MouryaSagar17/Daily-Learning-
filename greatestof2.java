/* Find the Greatest of the Two Numbers in Java
Given two integer input Number1 and Number2, the objective is to write a Java code to compare both the Numbers and Find the Greatest of the Two Numbers. To do so we’ll use if-else statements and print the output. Some methods to solve the above-mentioned Problem are given below.

Method 1: Using if-else Statements
Method 2: Using Ternary Operator
Method 3: Using inbuilt max Function
All the above-mentioned methods are discussed in detail in the sections below.*/
import java.util.Scanner;
class greatestof2{
    public static void usingif(int num1,int num2){
        if(num1>num2){
            System.out.println("The "+num1+" is Greater");
        }
        else{
            System.out.println("The "+ num2+" is Greater");
        }
    }
    public static void usingTernary(int num1,int num2){
        String result=num1>num2? "The"+num1+"is greater":"The "+num2+" is greater";
        System.out.println(result);
    }
    public static void usingmax(int num1,int num2){
        int result=Math.max(num1,num2);
        System.out.println(result+" is greater");
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the num1 and num2 numbers");
        System.out.println("Enter the num1 ");
        int num1=sc.nextInt();
        System.out.println("Enter the num2 ");
        int num2=sc.nextInt();
        usingif(num1,num2);
        usingTernary(num1,num2);
        usingmax(num1,num2);
    }
}

