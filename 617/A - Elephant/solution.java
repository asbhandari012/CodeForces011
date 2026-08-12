import java.util.*;
 
public class Main {
 
    public static void main(String args[]){
        Scanner ui = new Scanner(System.in);
 
        int d = ui.nextInt();
 
        int moves = d/5;
 
        if(d % 5 != 0){
            moves++;
        }
 
        System.out.println(moves);
    }
}