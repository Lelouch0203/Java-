package CollegeExercises.SpecialNumbers;

import java.util.Scanner;

public class NeonNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int num = sc.nextInt();
        int sqr = num*num;
        int sum= 0;

        while (sqr>0) {
            sum = sum+(sqr%10);
            sqr/=10;
        }
        if (sum==num) {
            System.out.println("Neon number");

            
        }
        else{
            System.out.println("not a Neon number");
        }
        sc.close();
    }
}
