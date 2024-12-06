package java;

import java.util.Arrays;
import java.util.Scanner;

public class trial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int size = sc.nextInt();
        System.out.println("Enter " + size + " numbers: ");
        String[] str = new String[size];

        for(int i=0; i<str.length; i++){
            str[i] = sc.next();
        }
        //System.out.println("Original array: " + Arrays.toString(str));

        //predefining array
        System.out.println("Fixing a value in the array:");
        //str[1] = "Siri";
        
        change(str);
        //System.out.println(Arrays.toString(str));

        //2D arrays

    }
    //strings are immutable, arrays are mutable(ori. value is changed) in java
    public static void change(String[] str){
        str[1] = "Changed val";
    }
}
    
