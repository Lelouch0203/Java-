package CollegeExercises.SpecialNumbers;

import java.util.Scanner;

public class CapriconNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number:");
        int num1 = sc.nextInt();
        int square = num1*num1;
        boolean isCapricon = false;
        int countDigits=0;
        int temp = square;

        while (temp>0) {
            countDigits++;
            temp/=10;
            
        }

        for (int i = 1; i <countDigits; i++) {
            int divisor= (int) Math.pow(10, i);
            int qoutient = square/divisor;
            int remainder = square% divisor;
            if (qoutient+remainder==num1) {
                isCapricon=true;
                
            }
        }
            if (isCapricon) {
                System.out.println(num1+" is a Capricorn number");
                
            }
            else{

                System.out.println(num1+" is not a Capricorn number");
            }

            
sc.close();
        }


    
    }