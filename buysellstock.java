public class buysellstock {
    public static void main(String[] args) {
        
    
    
    int[] prices= {2,4,1};
int min = Integer.MAX_VALUE;
int max = Integer.MIN_VALUE;    
int newindex = 0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<min){
                min=prices[i];
                newindex=i;
            }
          
          
        }
        for(int i = newindex;i<prices.length;i++){
            if(prices[i]>max){
                max=prices[i];
            }
        }
        System.out.println(max-min);

        
    }
}
