import java.util.*;
 
public class Main{
    public static int solution(int a, int b){
    
    if(a % b == 0){
        return 0;
    }
    
    return b - (a%b);
    }
    
    public static void main(String args[]){
        Scanner ui = new Scanner(System.in);
        
        int n = ui.nextInt();
        
        for(int i = 0; i < n; i++){
            int a = ui.nextInt();
            int b = ui.nextInt();
            
            System.out.println(solution(a, b));
        }
    }
}