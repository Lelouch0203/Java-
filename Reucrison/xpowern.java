package Reucrison;
public class xpowern {
    public static int printpower(int x,int n){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        int x_ = printpower(x, n-1);
        int xn = x*x_;
        return xn;
    }
    public static void main(String[] args) {
        int x=2,n=4;
        System.out.println(printpower(x, n));
    }
    
}
