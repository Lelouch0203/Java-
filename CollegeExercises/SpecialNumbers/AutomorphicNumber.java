package CollegeExercises.SpecialNumbers;


import java.util.Scanner;

public class AutomorphicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int num = sc.nextInt();
        int sqr = num*num;
        int temp= num;
        int count=0;
        int test;

        while (temp>0) {
            temp/=10;
            count++;
            
        }
        test=sqr-num;
       if (test%Math.pow(10, count)==0) {
        System.out.println("Automorphic number");
        
       }
       else{
        System.out.println("Not a Automorphic number");
       }

    sc.close();
}
}
