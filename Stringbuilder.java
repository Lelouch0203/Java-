public class Stringbuilder {
public static void main(String[] args) {
    StringBuilder sb = new StringBuilder("Jaisai Valasa");
    // sb.insert(2, 'K');
     sb.delete(3, sb.length());
    System.out.println(sb);
}
    
} 