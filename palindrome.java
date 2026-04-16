
import java.util.Scanner;

class palindrome{
    public static void palindromeornot(int n){
        int temp=n;
        int rem;
        int rev=0;
        while(temp>0){
            rem=temp%10;
            rev=rev*10+rem;
            temp=temp/10;
        }
        if(n==rev){
            System.out.println(n+" is a Palindrome");
        }
        else{
            System.out.println(n+ "is not a Palindrome");
        }
    }
    public static void PalindromeString(String str){
        String reversed=new StringBuilder(str).reverse().toString();
        System.out.println(reversed);
        if(str.equals(reversed)){
            System.out.println(str+" is a Palindrome");
        }
        else{
            System.out.println(str+" is not a palindrome");
        }
    }
    public static void PalindromeString1(String str){
        boolean ispalindrome=true;
        for(int i=0;i<str.length()/2;i++){
            if(str.charAt(i)!=str.charAt(str.length()-1-i)){
                ispalindrome=false;
                break;
            }
        }
        if(ispalindrome){
            System.out.println(str+" is a Palindrome");
        }
        else{
            System.out.println(str+" is not a palindrome");
        }
    }


    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        //System.out.println("Enter a number:");
        //int n=sc.nextInt();
        //palindromeornot(n);
        System.out.println("Enter a String:");
        String str=sc.nextLine();
        PalindromeString(str);
        PalindromeString1(str);
    }
}
