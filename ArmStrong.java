/*
* Find the Armstrong Numbers in a given Range using Java
Given two integer inputs as high and low, the objective is to
* find all the Armstrong Numbers that falls under the limits [Low,High] interval.
* Before Going into the Explanation let’s understand the problem and the definition of Armstrong Numbers.*/
import java.util.Scanner;

class ArmStrong {

    public static void armstrong(int n1) {
        int temp = n1;
        int arm = 0;
        int sum = 0;

        int digits = getcount(n1); // FIX: calculate once

        while (temp != 0) {
            sum = temp % 10;
            arm = arm + (int) Math.pow(sum, digits);
            temp = temp / 10;
        }

        System.out.println("Calculated value: " + arm);

        if (n1 == arm) {
            System.out.println("Armstrong");
        } else {
            System.out.println("Not an Armstrong");
        }
    }

    public static int getcount(int n) {
        int count = 0;
        while (n > 0) {
            count++;
            n = n / 10;
        }
        return count;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n1 = sc.nextInt();

        armstrong(n1);
    }
}

