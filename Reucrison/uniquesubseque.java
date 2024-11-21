package Reucrison;
import java.util.HashSet;
public class uniquesubseque {
    
        public static void subseqences(String str,int idx, String newString,HashSet<String>allseq){
            if(idx==str.length()){
                if(allseq.contains(newString)){
                    return;

                }
                allseq.add(newString);
                System.out.println(newString);
                return;
            }
            char currchar = str.charAt(idx);
    
            subseqences(str, idx+1, newString+currchar,allseq);
            subseqences(str, idx+1, newString,allseq);
    
        }
    public static void main(String[] args) {
        String str = "aaa";
       HashSet<String> allseq = new HashSet<>();
        subseqences(str, 0, "",allseq); 
    
    }
        
   
}
