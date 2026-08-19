import java.util.*;
 
public class Main {
 
    public static void main(String args[]){
            Scanner ui = new Scanner(System.in);
 
            int n = ui.nextInt();
            int count = 0;
 
            for(int i = 0; i < n; i++){
                int x = ui.nextInt();
                int y = ui.nextInt();
 
                if(x + 2 <= y){
                    count++;
                }
            }
 
            System.out.println(count);
        }
 
}