package Reucrison;
public class Recursion2 {
    public static void towerofhanai(int n ,String src,String hlp,String des){
        if(n==1){

            System.out.println("transfer disk "+n+ " from " +src +" to "+ des );
            return;
        }
       towerofhanai(n-1, src, des, hlp); 
       System.out.println("transfer disk "+n+ " from " +src +" to "+ des );
       towerofhanai(n-1, hlp, src, des);
}

    


    public static void main(String[] args) {
        int n = 3;
        towerofhanai(n, "a", "b","c");
    }
    
}
