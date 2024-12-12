package CollegeExercises.SpecialNumbers;

import java.util.Scanner;

public class HappyNumber {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int num = sc.nextInt();
        int digits=0;
        int n= num;
       int  sum=0;
        

        while (num>9) {
            while (num>0) {
                digits= num%10;
                sum = sum+(digits*digits);
                num/=10;
            }
            num=sum;
            sum=0;
        }
            if(num==1){
                System.out.println(n+" is a capricorn number");
            }
            else{
                System.out.println(n+" is not a capricorn number");
            }
    sc.close();
}
}
