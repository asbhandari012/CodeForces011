import java.util.*;
 
public class Main{
    public static void main(String args[]){
        Scanner ui = new Scanner(System.in);
        
        String u = ui.next();
        String l = ui.next();
        
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < u.length(); i++){
            if(u.charAt(i) == l.charAt(i)){
                sb.append('0');
            }else{
                sb.append('1');
            }
        }
        
        System.out.println(sb);
    }
}