import java.util.*;
 
public class Main {
 
    public static void main(String args[]) {
        Scanner ui = new Scanner(System.in);
 
        String s = ui.next();
        String t = ui.next();
 
        t = new StringBuilder(t).reverse().toString();
 
        System.out.println(s.equals(t) ? "YES" : "NO");
    }
}