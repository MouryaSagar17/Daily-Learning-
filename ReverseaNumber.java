/*Find the Reverse of a Number in Java Language
Given an integer input as number, the objective is Find the Reverse of a Number in Java Language. To do so we usually break down the number into its individual digits and then rearrange them in reverse order. Here are a few methods to solve the above-mentioned problem in Java Language,

Method 1: Using while loop
Method 2: Using for loop
Method 3: Using Recursion I
Method 4: Using Recursion II
Method 5: Taking care of negative numbers in case of method 4*/
import java.util.Scanner;
class ReverseaNumber{
    public static void UsingWhile(int n){
        int rev=0,rem;

        while(n>0){
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        System.out.println("The reverse of a number:"+rev);
    }
    public static void usingFor(int num){
        int rev=0,rem;
        for(;num!=0;num=num/10){
            rem=num%10;
            rev=rev*10+rem;
        }
        System.out.println("The reverse of a number:"+rev);
    }
    public static int usingrecursion(int num,int rev){
        if(num==0){
            return rev;
        }
        int rem=num%10;
        rev=rev*10+rem;
        return usingrecursion(num/10,rev);
    }
    public static void usingrecursionII(int num){
        if(num==0)
            return;
        int rem=num%10;
        System.out.print(rem);
        usingrecursionII(num/10);
    }
    public static void NegeativeReverse(int num){
        if(num==0){
            return ;
        }
        int rem=num%10;
        System.out.print(rem);
        NegeativeReverse(num/10);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number:");
        int n=sc.nextInt();

        UsingWhile(n);
        usingFor(n);
        int result=usingrecursion(n,0);
        System.out.println("The reverse of a number:"+result);
        usingrecursionII(n);
        System.out.println("ENter a negative value");
        int negative=sc.nextInt();
        boolean isNegative = n < 0 ? true: false;
        if (isNegative) {
            System.out.print("-");
            negative = negative * -1;
        }
        NegeativeReverse(negative);

    }
}
