import java.util.*;
 
public class Main{
    public static void main(String args[]){
        Scanner ui = new Scanner(System.in);
        
        int t = ui.nextInt();
        
        while(t-- > 0){
            int a = ui.nextInt();
            int b = ui.nextInt();
            int c = ui.nextInt();
            
            if(a + b == c || b + c == a || a + c == b){
                System.out.println("YES");
            }else{
                System.out.println("No");
            }
        }
    }
}