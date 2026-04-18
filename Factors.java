/*
Find the Factors of a Number in Java Language
Given an integer input, the objective is to find all the factors of a given integer input but the number itself.

To do so we’ll use loops to iterate through the range from 2 to the number itself and check whether there are any factors within the range. To do so, we’ll use loops to iterate through the range and check if each number is a factor of the number or not.

Once we find that the number is divisible by any number we’ll append it to the factors list or simply print the factors along the way. Here are a few methods to Find the Factors of a Number in Java Language,

Method 1: Using Range as [ 2, number ]
Method 2: Using Range as [ 2, number/2]
Method 3: Using Range as [2, Sqrt( number ) ]
Method 4: Using Range as [2, Sqrt( number ) ] Updated
Method 5: Update for negative numbers
We’ll discuss the above-mentioned methods in detail in the upcoming sections.
* */
import java.util.Scanner;
public class Factors{
    public void usingRange(int n){
        System.out.print(1+" ");
        for(int i=2;i<=n;i++){
            if(n%i==0){
                System.out.print(i+" ");
            }
        }
    }
    public void usingRangenby2(int n){
        System.out.print(1+" ");
        for(int i=2;i<=(n/2);i++){
            if(n%i==0){
                System.out.print(i+" ");
            }
        }
        System.out.print(n);
    }
    public void usingSqrt(int n){
        for(int i=1;i<=Math.sqrt(n);++i) {
            if (n % i == 0){
                if(i==n/i)
                    System.out.print(i + " ");
                else
                    System.out.print(i + " " + n / i + " ");
            }
        }
    }
    public void usingNegative(int n){
        for(int i=n;i<=Math.abs(n);++i) {
            if (i == 0) {
                continue;
            }
            else {
                if (n % i == 0) {
                    System.out.print(i + " ");
                }
            }
        }
    }
    public void usingSqrtFactors (int num)
        {
            int i;
            boolean flag = false;
            for(i = 1; i <= Math.sqrt(num); i++)
            {
                if (num % i == 0)
                    System.out.print(i + " ");
                if(i == num/i)
                    flag = true;
            }
            if(flag)
                i -= 2;
            for(; i >= 1; i--)
            {
                if (num % i == 0)
                    System.out.print(num/i + " ");
            }
        }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        Factors f1=new Factors();
        if(n>0) {
            f1.usingRange(n);
            System.out.println();
            f1.usingRangenby2(n);
            System.out.println();
            f1.usingSqrt(n);
            System.out.println();
            f1.usingSqrtFactors(n);
        }
        else {
            f1.usingNegative(n);
            System.out.println();
        }
    }
}