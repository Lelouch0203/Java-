
public class backtracking {
    public static void printPermutations(String str,String perm){
        if(str.length()==0){
            System.out.println(perm);
            return;
        }
        for(int i=0;i<str.length();i++){
            char currchar = str.charAt(i);
     String newStr = str.substring(0,i) + str.substring(i+1);
            printPermutations(newStr, perm+currchar);
    }   
 }
    public static void main(String[] args) {
        String str= "ABC";
        printPermutations(str, "");
        
    }
}
