package CollegeExercises;
import java.util.*;

public class SalesTaxCaluculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the tax inclusive price: $");
        double taxInclusivePrice = sc.nextDouble();
        // double Actualprice, tax;
        // tax= Actualprice*7/100;
        // taxInclusivePrice= Actualprice*7/100 + Actualprice;
        while (taxInclusivePrice!=-1) {
            
            double Actualprice= taxInclusivePrice/(1+7/100.0);
            double tax= taxInclusivePrice- Actualprice;
            System.out.printf("The actual price is :$%.2f%n",Actualprice);
            System.out.printf("Total sales tax is :$%.2f%n",tax);
            System.out.print("Enter the tax inclusive price: $");
             taxInclusivePrice = sc.nextDouble();
        }
        System.out.println("Bye have a great day!");
        }
}
