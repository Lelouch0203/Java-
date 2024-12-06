package CollegeExercises;
import java.util.*;

public class IncomtaxCaluculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double ABOVE_20K= 0.1;
        final double ABOVE_40K= 0.2;
        final double ABOVE_60K= 0.3;
        double taxpayable;
        System.out.print("Enter taxable income: $");
        int taxableIncome= sc.nextInt();
        if(taxableIncome<=20000){
            taxpayable=0;
            System.out.println(taxpayable);
        }else if (taxableIncome<=40000) {
            taxpayable = (taxableIncome-20000)*ABOVE_20K;
            
        }else if (taxableIncome<=60000){
            taxpayable = (taxableIncome-40000)*ABOVE_40K+20000*ABOVE_20K;
        }else{
            taxpayable=20000*ABOVE_20K+20000*ABOVE_40K+(taxableIncome-60000)*ABOVE_60K;
        }
        System.out.printf("The taxpayable is :$ %.2f%n",taxpayable);
    }
}
