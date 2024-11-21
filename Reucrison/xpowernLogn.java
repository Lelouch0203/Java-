package Reucrison;
public class xpowernLogn {
    public static int xpowern(int n,int x){
        if(n==0){
            return 1;

        }
        if(n%2==0){
            return xpowern(n/2, x)* xpowern(n/2,x);
        }
        else{
            return x*xpowern(n/2,x)*xpowern(n/2, x);
        }
    }
        public static void main(String[] args) {
        int n=5;
        int x =3;
     
        System.out.println(xpowern(n,x));
    }
}
