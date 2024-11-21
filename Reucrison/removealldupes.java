package Reucrison;
public class removealldupes {
public static boolean[] map = new boolean[26];
    public static void removeDupes(int idx, String str,String newString)  {
        
        if(idx==str.length()){
            System.out.print(newString);
            return;
            

        }
        char currChar=str.charAt(idx);

        if(map[currChar-'a']==true){
            removeDupes( idx + 1, str, newString);
        }else{
            newString+=currChar;
            map[currChar-'a']=true;
            removeDupes( idx + 1, str, newString);
        }

    }  
public static void main(String[] args) {
    String str ="aabbccdd";
    removeDupes(0,str, "");
}
    
}