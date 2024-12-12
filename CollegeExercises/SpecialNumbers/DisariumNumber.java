package CollegeExercises.SpecialNumbers;

import java.util.Scanner;

public class DisariumNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int num = sc.nextInt();
        int digits = 0;
        int sum=0;
        int temp = num;
        int count = 0;
        int n = num;
        while (temp>0) {
            temp/=10;
            count++;
            
        }
        while (num>0) {
            digits=num%10;
          
            sum+=Math.pow(digits,count);
            count--;
            num/=10;
        }
     if (sum==n) {
        System.out.print("Disarium Number");


        
     }
     else{
        System.out.print("Not a Disarium Number");
     }

    sc.close();
    }
    
}
