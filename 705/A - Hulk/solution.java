import java.util.*;
 
public class Main{
    
    public static void solution(int n){
        
        for(int i = 1; i <= n; i++){
            if(i % 2 == 0){
                System.out.print("I love ");
            }else{
                System.out.print("I hate ");
            }
            
            
            if(i == n){
                System.out.print("it");
            }else{
                System.out.print("that" + " ");
            }
        }
    }
    
    public static void main(String args[]){
        Scanner ui = new Scanner(System.in);
        
        int n = ui.nextInt();
        
        solution(n);
    }
}