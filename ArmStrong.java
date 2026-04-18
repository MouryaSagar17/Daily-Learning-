/*
* Find the Armstrong Numbers in a given Range using Java
Given two integer inputs as high and low, the objective is to
* find all the Armstrong Numbers that falls under the limits [Low,High] interval.
* Before Going into the Explanation let’s understand the problem and the definition of Armstrong Numbers.*/

import java.util.*;
public class ArmStrong{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the range of numbers:");
        int low=sc.nextInt();
        int high=sc.nextInt();

        for(int num=low;num<=high;num++){
            int sum=0;
            int digit;
            int temp=num;
            int len=getcount(num);
            while(temp>0){
                digit=temp%10;
                sum=sum+(int)Math.pow(digit,len);
                temp=temp/10;
            }
            if(sum==num){
                System.out.print(sum+ " ");
            }
        }

    }
    public static int getcount(int num){
        int count=0;
        while(num>0){
            count++;
            num=num/10;
        }
        return count;
    }
}