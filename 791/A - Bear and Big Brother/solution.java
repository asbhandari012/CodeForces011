import java.util.*;
 
public class Main {
 
    public static void main(String args[]){
        Scanner ui = new Scanner(System.in);
 
        int limwak = ui.nextInt();
        int bob = ui.nextInt();
 
        int years = 0;
 
        while(limwak <= bob){
            limwak *= 3;
            bob *= 2;
            years++;
        }
        System.out.println(years);
    }
}