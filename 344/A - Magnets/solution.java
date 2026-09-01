import java.util.*;
 
public class Main{
    
    
    public static void main(String args[]){
        Scanner ui = new Scanner(System.in);
        
        int n = ui.nextInt();
        
        String ch[] = new String[n];
        
        for(int i = 0; i < n; i++){
            ch[i] = ui.next();
        }
        
        int count = 1;
        
        for(int i = 1; i < n; i++){
            if(!ch[i].equals(ch[i-1])){
                count++;
            }
        }
        
        System.out.println(count);
    }
}