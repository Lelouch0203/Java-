package CollegeExercises;
import java.util.*;


public class InputValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer between 0-10 or 90-100:");
        int marks = sc.nextInt();
        boolean isValid = false;
        do {
            
            if(marks<=100&&marks>=90||marks>=0&&marks<=10){
                System.out.println("You have entered :"+marks);
                isValid=true;
            }

            else{
                System.out.println("Invalid input please try again!");
                System.out.println("Enter an integer between 0-10 or 90-100:");
                 marks = sc.nextInt();
            }
            
        } while (!isValid);
        sc.close();
    }
}
