package CollegeExercises.SpecialNumbers;

import java.util.Scanner;

public class SpyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        int digit;
        int sum=0;
        int product=1;
        while (num>0) {
            digit=num%10;
            sum+=digit;
            product*=digit;
            num/=10;
        }
        if (product==sum) {
            System.out.println("Spy Number");
            
        }
        else{
            System.out.println("Not a Spy number");
        }
        sc.close();
    }
}
