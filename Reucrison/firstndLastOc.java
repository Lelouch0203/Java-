package Reucrison;
public class firstndLastOc {
    public static int first =-1;
    public static int last=-1;
    public static void getIndices(String str,char el,int idx){
        if(idx==str.length()){
            return;

        }
        
        if(str.charAt(idx)==el){
            if(first==-1){
                first = idx;

            }
            else{
                last=idx;
            }

        }
        getIndices(str, el, idx+1);

    }

    public static void main(String[] args) {
        String str="jaisai";
        int idx=0;
        char el = 'a';
        getIndices(str, el, idx);
System.out.println("first occurance is "+first);
System.out.println("last occurance is "+last);
 }
    
}
