import java.util.*;
 
public class Main {
 
    public static boolean solution(String name){
        HashSet<Character> set = new HashSet<>();
 
        for(int i = 0; i < name.length(); i++){
            char ch = name.charAt(i);
                set.add(ch);
        }
        return set.size()  % 2 == 0;
    }
 
 
    public static void main(String args[]){
        Scanner ui = new Scanner(System.in);
 
        String name = ui.next();
 
        boolean result = solution(name);
 
        if(result == true){
            System.out.println("CHAT WITH HER!");
        }else{
            System.out.println("IGNORE HIM!");
        }
    }
}