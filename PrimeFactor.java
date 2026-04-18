/*
Prime Factors of a number in Java


Here, in this page we will discuss the program to print all the prime factors of a number in java. Prime factorization is a way of expressing a number as a product of its prime factors. A prime number is a number that has exactly two factors, 1 and the number itself.

Example :

Input : 12
Output : 2 2 3
 */

import java.util.Scanner;

class PrimeFactor{
    public static int isPrime(int n){
    for (int i=2;i<=Math.sqrt(n);i++){
        if(n%i==0) {
            return 0;
         }
        }
    return 1;
    }
    public static void PrimeFact(int n){

        for(int i=2;i<=n;i++){
            if(isPrime(i)==1){
                int x=n;
                while(x%i==0){
                    System.out.print(i+" ");
                    x/=i;
                }
            }
        }
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        PrimeFactor pf=new PrimeFactor();
        pf.PrimeFact(n);

    }
}