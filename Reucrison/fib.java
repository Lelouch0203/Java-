package Reucrison;
public class fib {
    public static void fibs(int a,int b,int n){
        if(n==0){
            return;
        }
        int c = a+b;
        System.out.println(c);
       fibs(b, c, n-1);
        return;
    }
    public static void main(String[] args) {
        System.out.println(0);
        System.out.println(1);
        int a =0;
        int b =1;
        int n=7;
        fibs(a, b, n-2);
    }
    
}
