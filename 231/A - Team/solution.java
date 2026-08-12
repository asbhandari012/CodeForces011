import java.util.*;
 
public class Main{
    
    public static void main(String args[]){
        Scanner ui = new Scanner(System.in);
        
        int n = ui.nextInt();
        int count = 0;
        int mat[][] = new int[n][3];
        
        for(int i = 0;i < n; i++){
            int temp = 0;
            
            for(int j = 0; j < 3; j++){
                temp += ui.nextInt();
            }
            
            if(temp >= 2){
                count++;
            }
        }
        
        System.out.println(count);
    }
}