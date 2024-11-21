package Reucrison;
public class movextoend {
    public static void moveALx(String str,int idx,int count,String newString){
 
        if(idx==str.length()){
            for(int i=0;i<count;i++){
                newString=newString+'x';
            }
            System.out.println(newString);
        return;
        }
        char currChar = str.charAt(idx);
        if(currChar=='x'){
            count++;
            moveALx(str, idx+1, count, newString);
        }
        else{
            newString+=currChar;
            moveALx(str, idx+1, count, newString);
        }



    }
    public static void main(String[] args) {
        String str = "jaxixsaxxi";
        int idx=0;
        int count=0;
        
        moveALx(str, idx, count,"");
    }
    
}
