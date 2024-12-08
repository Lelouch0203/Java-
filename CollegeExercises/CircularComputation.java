package CollegeExercises;
import java.util.*;


public class CircularComputation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Radius:");
        Double r = sc.nextDouble();
        Double Circumference = 2*r*Math.PI;
        Double Area = r*r*Math.PI;
        System.out.printf("Area is : %.2f%n",Area);
        System.out.printf("Circumference is : %.2f%n",Circumference);
        sc.close();
    }
    
}
