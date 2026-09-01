import java.util.*;
 
public class Main{
    public static void main(String args[]){
        Scanner ui = new Scanner(System.in);
        
        int n = ui.nextInt();
        
        int gift[] = new int[n+1];
        
        for(int i = 1; i <= n; i++){
            
            int p = ui.nextInt();
            
            gift[p] = i;
        }
        
        for(int i = 1; i <= n; i++){
            System.out.println(gift[i] + " ");
        }
    }
}