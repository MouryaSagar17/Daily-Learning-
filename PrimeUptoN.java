/*
Find all the Prime Numbers in a Given Interval in Java
Given two integer inputs for the range or the interval for the search. The objective is to search and find all the Prime Numbers that lay in the given interval or range. To do so we’ll iterate through the numbers and check whether or not they are prime simultaneously. We’ll use loops to check whether the number has any factors other than 1 and the number itself. Here are few methods we’ll use to Find all the Prime Number in a Given Interval in Java Language.

Method 1: Using inner loop Range as [2, number-1].
Method 2: Using inner loop Range as [2, number/2].
*/
import java.util.Scanner;
class PrimeUptoN {
    public static boolean isprimeornotN(int n) {
        boolean isprime = true;
        if (n < 2)
            isprime = false;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                isprime = false;
            }
        }
        return isprime;
    }

    public static boolean isprimeornorNby2(int n) {
        boolean isprime = true;
        if (n < 2)
            isprime = false;
        for (int i = 2; i < n / 2; i++) {
            if (n % i == 0) {
                isprime = false;
            }
        }
        return isprime;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int m = sc.nextInt();
        for (int i = n; i < m; i++) {
            if (isprimeornotN(i)) {
                System.out.print(i + " ");
            }
        }
        for (int i = n; i < m; i++) {
            if (isprimeornorNby2(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
