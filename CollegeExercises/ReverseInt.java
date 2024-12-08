package CollegeExercises;
import java.util.*;
public class ReverseInt {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number:");
        int num= in.nextInt();
        int revNum=0;
        int digit;
        while (num>0) {
            digit=num%10;
             revNum= revNum*10+digit;

        num/=10;

            
        }
        System.out.println("The reverse int is:"+revNum);
        in.close();
    
    
    }

}
