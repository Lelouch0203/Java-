package java;
import java.util.*;
public class Stringreverse {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
    //    String name = sc.next();
    //    StringBuilder sb = new StringBuilder(name);
       StringBuilder sb = new StringBuilder("jaisai");
       StringBuilder sbb= new StringBuilder("");
       for(int i=0;i<sb.length();i++){
            
                sbb.insert(0,sb.charAt(i));

            
        } 
        System.out.println(sbb);
    }
}
