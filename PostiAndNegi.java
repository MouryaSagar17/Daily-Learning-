/*Check if a Number is Positive or Negative in Java
In this article, we will create a java program to check whether the number entered by the user is positive or negative. The number is demonstrated as positive or negative by comparing the entered number with the Zero(0). If the number entered by the user is greater than zero, then the number is positive, else if the number is less than zero, then the number is negative and else the number is zero.

N > 0 then, number is Positive.
N < 0 then, number is Negative.
N = 0 then, number is Zero.
To solve the above problem we write a Java code using three different methods.

Method 1: Using Brute Force
Method 2: Using Nested if-else Statements
Method 3: Using Ternary Operators
*/
import java.util.Scanner;
class PostiAndNegi {
  public static void Bruteforce(int n){
            if(n>0){
                System.out.println("The "+n+" postive number");
            }
            else if(n<0){
                System.out.println("The "+n+" negative number");
            }
            else{
                System.out.println("The "+n+" number is zero");
            }
    }
    public static void NestedIf(int n){
            if(n>=0){
                if(n==0){
                    System.out.println("The "+n+" number is zero");
                }
                System.out.println("The "+n+" postive number");
            }
            else{
                System.out.println("The "+n+" negative number");
            }
    }
    public static void Ternary(int n){
            if (n==0){
                System.out.println("The "+n+" number is zero");
            }
            else{
                String result=n>0? "The "+n+" postive number":"The "+n+" negative number";
                System.out.println(result);
            }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        Bruteforce(n);
        NestedIf(n);
        Ternary(n);
    }
}