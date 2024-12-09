package CollegeExercises.Patterns;
import java.util.*;

public class BoxPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size:");
        int size = sc.nextInt();

        for (int i = 0; i <size; i++) {
            for (int j = 0; j < size; j++) {
                if(i==0||j==0||j==size-1||i==size-1){
                    System.out.print("# ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
            
        }
        System.out.println("\n\n");
        
        for (int i = 0; i <size; i++) {
            for (int j = 0; j < size; j++) {
                if(i==0||i==size-1||i==j){
                    System.out.print("# ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
            
        }
        System.out.println("\n\n");

        for (int i = 0; i <size; i++) {
            for (int j = 0; j < size; j++) {
                if(i==0||i==size-1||i+j==size-1){
                    System.out.print("# ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
            
        }
        System.out.println("\n\n");

        for (int i = 0; i <size; i++) {
            for (int j = 0; j < size; j++) {
                if(i==0||i==size-1||i==j||i+j==size-1){
                    System.out.print("# ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
            
        }
        System.out.println("\n\n");

        for (int i = 0; i <size; i++) {
            for (int j = 0; j < size; j++) {
                if(i==0||i==size-1||i==j||i+j==size-1||j==size-1||j==0){
                    System.out.print("# ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
            
        }
        sc.close();
    }
}
