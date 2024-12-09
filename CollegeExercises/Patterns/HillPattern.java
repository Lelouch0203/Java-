package CollegeExercises.Patterns;

import java.util.Scanner;

public class HillPattern {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size:");
        int size = sc.nextInt();

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size-i-1; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < 2*i+1; j++) {
                System.out.print("# ");

            }
            System.out.println();           
        }
        System.out.println("\n\n");


        for (int i = 0; i < size; i++) {
            for (int j = 0; j <i; j++) {
                System.out.print("  ");
                
            }
            for (int j = 2*size-i; j > i+1; j--) {
                System.out.print("# ");
            }
            System.out.println();
        }
        System.out.println("\n\n");


        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size-i-1; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < 2*i+1; j++) {
                System.out.print("# ");

            }
            System.out.println();           
        }
        for (int i = 1; i < size; i++) {
            for (int j = 0; j <i; j++) {
                System.out.print("  ");
                
            }
            for (int j = 2*size-i; j > i+1; j--) {
                System.out.print("# ");
            }
            System.out.println();
        }
sc.close();
}

}