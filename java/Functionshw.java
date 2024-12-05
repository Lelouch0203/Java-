package java;
import java.util.*;
public class Functionshw {
    public static void caluculateSum(int n){
        int sum = 0;
        for(int i=1;i<=n;i++){
            if(i%2!=0){
                sum = sum+i;

            }
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        caluculateSum(n);
    }
}
