import java.util.*;
 
public class Main {
    public static void main(String args[]){
        Scanner ui = new Scanner(System.in);
 
        int n = ui.nextInt();
        double sum = 0.0;
        for(int i = 0; i < n; i++){
            int num = ui.nextInt();
 
            sum += num;
        }
 
        System.out.println(sum / n);
    }
}