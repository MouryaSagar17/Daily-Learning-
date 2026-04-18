/*Check Whether or Not the Given Number is a Strong Number in Java Language
Given an integer input as the number, the objective is to Check Whether or Not the Given Number is a Strong Number in Java Language.

To do so we’ll check if the sum of the factorial of each individual digit of the number is equal to the number itself or not.

For a number to be a Strong Number, the sum of Factorial of each digit of the number must be equal to the number itself. Here are a few method to Check Whether or Not the Given Number is a Strong Number or Not in Java Language,
Strong Number
A Number that can be represented as the sum of the factorial of it's individual digits is known as a Strong Number.
Let's try and understand the concept better using an example

Example
Input : 145
Output : Yes, it's a strong number
Explanation : Number = 145
145 = 1! + 4! + 5!
145 = 1 + 24 + 120
output number  = 145.
As the number could be represented as the sum of the factorials of it's digits, it's a Strong Number.

Method 1: Using Simple Iteration
Method 2: Using Recursive Function
*/
import java.util.Scanner;
public class StrongNumber{
    public static int factorial(int n1){
        int fact1=1;
        for(int i=1;i<=n1;i++){
            fact1*=i;
        }
        return fact1;
    }
    public void Strong(int n){
        int sum=0,temp=n;
        while(temp>0){
            sum+=factorial(temp%10);
            temp/=10;
        }
        if(n==sum){
            System.out.println("Yes, it's a strong number");
        }
        else{
            System.out.println("No, it's not a strong number");
        }
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number:");
        int n=sc.nextInt();
        StrongNumber s1=new StrongNumber();
        s1.Strong(n);
    }
}