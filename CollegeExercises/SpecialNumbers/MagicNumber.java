package CollegeExercises.SpecialNumbers;

import java.util.Scanner;

public class MagicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int num = sc.nextInt();
        int digits = 0;
        int sum =0;

        while (num>9) {
            while (num>0) {
                digits=num%10;
                sum = sum +digits;
                num=num/10;

            }
            num=sum;
            sum=0;
        }
        if (num==1) {
            System.out.println("Magic number");
            
        }
        else{
            System.out.println("Not a magic number");
        }
        sc.close();
    }
}
