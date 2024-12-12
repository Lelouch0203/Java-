package CollegeExercises.SpecialNumbers;

import java.util.Scanner;

public class PalindromicNumber {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        System.out.print("Enter a number:");
        int num = cs.nextInt();
       int n= num;
       int r=0;
        while (num>0) {
           r= (r*10) + num%10;
           num/=10; 
           
        }
       if (n==r) {
        System.out.println("Palindromic number");
        
       }
       else{
        System.out.println("Not a Palindromic number");
       }
    }
    
}
