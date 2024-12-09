package CollegeExercises.SpecialNumbers;

import java.util.Scanner;

public class AmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number:");
        int num1 = sc.nextInt();
        int digits;
        int noOFdigits=(int)Math.log10(num1)+1;
      
        int sum=0;

        int num2=num1;

        while (num1>0) {
            digits=num1%10;
            sum+=Math.pow(digits,noOFdigits);
            num1/=10;
        }
        if (num2==sum) {
            System.out.println(num2+" is an AmstrongNumber");
            
        }
        else{
            System.out.println(num2+" is not an AmstrongNumber");
        }
   sc.close();
 }

    
}
