package java;
public class test {
public static void main(String[] args) {
    double sum=0.0;
    int MAX_denominator = 1000;
    for(int i =1;i<=MAX_denominator;i+=2){
        if(i%4==1){
            sum+=1.0/i;
        }
       else if(i%4==3){
            sum-=1.0/i;
        }
        else{
            System.out.println("impossible");
        }
        
    }
    double pi = sum*4;
    System.out.printf("Computed π with MAX_DENOMINATOR=%d: %.10f%n",MAX_denominator,pi);
  
}
    
}
