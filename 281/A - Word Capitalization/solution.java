import java.util.*;
 
public class WordCapitalization {
 
    public static String solution(String word){
        char c = word.charAt(0);
 
        return Character.toUpperCase(c) + word.substring(1);
    }
 
    public static void main(String args[]){
        Scanner ui = new Scanner(System.in);
 
        String word = ui.next();
 
        System.out.println(solution(word));
    }
}