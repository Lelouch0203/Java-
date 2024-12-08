package CollegeExercises;

import java.util.Scanner;

public class SumOfDigitsInt {
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number:");
        int num= in.nextInt();
        // int revNum=0;
        int digit;
        int sum=0;
        while (num>0) {
            digit=num%10;
          sum+=digit;

        num/=10;

            
        }
        System.out.println("The Sum of the digits is:"+sum);
    
        
  in.close();
    }

}
