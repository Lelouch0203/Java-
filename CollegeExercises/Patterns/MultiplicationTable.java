package CollegeExercises.Patterns;
import java.util.*;

    public class MultiplicationTable {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the Size:");
            int size = sc.nextInt();
            System.out.print("    * |");
            for (int i = 1; i <= size; i++) {
                System.out.printf("%4d", i);

            }
            System.out.println();
            for (int i = 0; i <= size; i++) {
                System.out.print("----");
                
            }
            System.out.print("---");
            System.out.println();


            for (int i = 1; i <=size; i++) {
                System.out.printf(" %4d |",i);
                for (int j = 1; j <=size; j++) {
                    System.out.printf("%4d",i*j);
                    
                }
                System.out.println();
            }
                    
        
                
            sc.close();
            }
        }


