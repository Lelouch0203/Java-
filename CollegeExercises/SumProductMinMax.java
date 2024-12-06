package CollegeExercises;
import java.util.*;
public class SumProductMinMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First number:");
        int num1 = sc.nextInt();
        System.out.println("Enter Second number:");
        int num2 = sc.nextInt();
        System.out.println("Enter Third number:");
        int num3 = sc.nextInt();

        int sum = num1+num2+num3;
        int product = num1*num2*num3;
        int max;
        int min;
        max = num1;
        if(max<num2){
            max=num2;
        }
        if(max<num3){
            max = num3;
        }
        min = num1;
        if(min>num2){
            min=num2;
        }
        if(min>num3){
            min = num3;
        }
        System.out.println("Sum = "+sum);
        System.out.println("Product = " + product);
        System.out.println("MIN = "+min);
        System.out.println("MAX = " +max);
    }
    
}