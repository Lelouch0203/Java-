package java;
import java.util.*;

public class Arrays {
    public static void main(String[] args) {
    Scanner objScanner = new Scanner(System.in);
    int size = objScanner.nextInt();
    int numbers[] = new int[size];
    for(int i=0;i<size;i++){
        numbers[i]=objScanner.nextInt();
    }
 int min = Integer.MAX_VALUE;
 int max = Integer.MIN_VALUE;
 for(int i =0;i<numbers.length;i++){
    if(numbers[i]<min){
        min=numbers[i];
    }
    if(numbers[i]>max){
        max=numbers[i];
    }
 }
System.out.println("minimum value is "+ min);
System.out.println("maximum value is "+ max);


}
}

 