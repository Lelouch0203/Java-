package CollegeExercises.SpecialNumbers;

import java.util.Scanner;

public class Specialnumber {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        int num=n;
        int sumFact= 0; int fact= 1;
        int digit;
        while (n>0) {
            digit = n%10;
            for (int i = digit; i > 0; i--) {
                fact*=i;
            }
           sumFact+=fact;
           fact=1;
           n=n/10;
        }
    if (sumFact==num) {
        System.out.println("Special Number");
        
    }
    else{
        System.out.println("Not a special number");
    }
    sc.close();

    }
    
}
