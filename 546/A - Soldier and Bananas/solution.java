import java.util.*;
 
public class Main {
 
    public static void main(String args[]){
        Scanner ui = new Scanner(System.in);
 
        int k = ui.nextInt();
        int money = ui.nextInt();
        int b = ui.nextInt();
 
        int total = 0;
 
        for(int i = 1; i <= b; i++){
            total += i * k;
        }
 
        System.out.println(Math.max(0, total - money));
    }
}