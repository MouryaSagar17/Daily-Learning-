/*Find the Sum of the Digits of a Number in Java Language
Given an input integer as the number, our objective is to break down the number into it’s individual digits and sum them up together. To do so we’ll use the follow two operators,

Modulo Operator % : We’ll use this to extract the digits from the number.
Divide Operator / : We’ll use it to shorten the number by 1 digit.
Once we get the digits, we sum them up one by one with each iteration. Here are some of the methods to solve the above mentioned problem

Method 1: Using Brute Force
Method 2: Using Recursion I
Method 3: Using Recursion II
Method 4: Using ASCII Table*/

import java.util.Scanner;
class SumofN{
    public static void usingBruteforce(int n) {
        int sum=0;
        int temp=n;
        while(n!=0){
            sum+=n%10;
            n=n/10;
        }
        System.out.println("Sum of "+ temp + " numbers is : "+sum);
    }
    public static int usingrecursion1(int n,int sum){
        if(n==0)
            return sum;
        sum+=n%10;
        return usingrecursion1(n / 10,sum);
    }
    public static int usingrecursion2(int n){
        if(n==0){
            return 0;
        }
        return (n%10) + usingrecursion2(n/10);
    }
    public static int usingASCII(String num){
        int sum=0;

        for(int i=0;i<num.length();i++){
            sum=sum+num.charAt(i)-48;
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        usingBruteforce(n);
        int result=usingrecursion1(n,0);
        System.out.println("Sum of "+ n + " numbers is : "+result);
        int result1=usingrecursion2(n);
        System.out.println("Sum of "+ n + " numbers is : "+result);
        String num=String.valueOf(n);
        int result2=usingASCII(num);
        System.out.println("Sum of "+ n + " numbers is : "+result);

    }
}