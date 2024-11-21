package Reucrison;
public class subseq {
    public static void subseqences(String str,int idx, String newString){
        if(idx==str.length()){
            System.out.println(newString);
            return;
        }
        char currchar = str.charAt(idx);

        subseqences(str, idx+1, newString+currchar);
        subseqences(str, idx+1, newString);

    }
public static void main(String[] args) {
    String str = "abc";
    subseqences(str, 0, ""); 

}
    
}