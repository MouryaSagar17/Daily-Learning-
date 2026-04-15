/*Find the Greatest of the Three Numbers in Java
Given Three integer inputs num1, num2 and num3, the objective is ti write a code to Find the Largest of the Three Numbers in Java Language. In this article we will see a  Java program to Find Greatest of three numbers. We will use if else conditions and ternary operator too to find the same. Here are some of the methods to solve the above mentioned problem,

Method 1: Using if-else Statements 2
Method 2: Using Ternary Operator
We’ll discuss the above mentioned methods in the sections below in depth.*/
import java.util.Scanner;
class greatestof3{
    public static void usingif(int num1,int num2,int num3){
        if(num1>num2 && num1>num3){
            System.out.println("The "+num1+" is greater");
        }
        else if(num2>num3){
            System.out.println("The "+num2+" is greater");
        }
        else{
            System.out.println("The "+num3+" is greater");
        }
    }
    public static void usingternary(int num1,int num2,int num3){
        int temp=num1>num2? num1:num2;
        int result=temp>num3? temp:num3;
        System.out.println("The "+result+" is greater");
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the num1");
        int num1=sc.nextInt();
        System.out.println("Enter the num2");
        int num2=sc.nextInt();
        System.out.println("Enter the num3");
        int num3=sc.nextInt();
        usingif(num1,num2,num3);
        usingternary(num1,num2,num3);
    }
}
