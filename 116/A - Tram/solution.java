import java.util.*;
 
public class Main {
 
    public static void main(String args[]){
        Scanner ui = new Scanner(System.in);
 
        int n = ui.nextInt();
 
        int max = 0;
        int current = 0;
 
        for(int i = 0; i < n; i++){
            int exit = ui.nextInt();
            int enter = ui.nextInt();
 
            current = current - exit + enter;
 
            max = Math.max(max, current);
        }
 
        System.out.println(max);
    }
}