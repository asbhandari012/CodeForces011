import java.util.*;
 
public class Main {
 
    public static void main(String args[]){
        Scanner ui = new Scanner(System.in);
 
        String str = ui.next();
 
        int upper = 0;
        int lower = 0;
 
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
 
            if(Character.isUpperCase(ch)){
                upper++;
 
            }else{
                lower++;
 
            }
        }
 
        if(lower >= upper){
            System.out.println(str.toLowerCase());
        }else{
            System.out.println(str.toUpperCase());
        }
    }
}