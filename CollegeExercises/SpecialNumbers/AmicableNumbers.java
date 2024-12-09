package CollegeExercises.SpecialNumbers;

import java.util.Scanner;

public class AmicableNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First Number:");
        int num1 = sc.nextInt();
        System.out.print("Enter the Second Number:");
        int num2 = sc.nextInt();
        int sum1=0;
        int sum2=0;
         

        for (int i = 1; i <= num1; i++) {
            if (num1%i==0) {
                
                sum1+=i;
            }
            
        }
        for (int i = 1; i <= num2; i++) {
            if (num2%i==0) {
                
                sum2+=i;
            }
            
        }
     if (sum1==sum2) {
        System.out.println(num1+" and "+num2+" are Amicable Numbers");
        
     }
     else{
        System.out.println(num1+" and "+num2+" are not Amicable Numbers");
     }

    sc.close();
}
}
