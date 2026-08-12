import java.util.*;
 
public class Main {
 
    public static void main(String args[]){
        Scanner ui = new Scanner(System.in);
 
        int n = ui.nextInt();
 
        int step = ui.nextInt();
 
        while(step > 0){
 
            if(n % 10 == 0){
                n /= 10;
            }else{
                n -= 1;
            }
 
            step--;
        }
 
        System.out.println(n);
    }
}