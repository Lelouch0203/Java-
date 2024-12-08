package CollegeExercises;
import java.util.*;
public class Swap2integers {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter first number :");
        int num1 = sc.nextInt();
       while (num1!=-1) {
        
           System.out.println("Enter second number :");
           int num2 = sc.nextInt();
           System.out.println("First Number before swap :"+num1);
           System.out.println("Second Number before swap :"+num2);
           int temp = num1;
           num1=num2;
           num2=temp;
           System.out.println("First Number after swap :"+num1);
           System.out.println("Second Number after swap :"+num2);
           System.out.println("Enter first number :");
        num1 = sc.nextInt();
        }
System.out.println("Bye have a good day!");
          
    }
    
}