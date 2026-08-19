import java.util.*;
 
public class Main {
 
    public static void main(String args[]){
        Scanner ui = new Scanner(System.in);
 
        int n = ui.nextInt();
        boolean isHard = false;
 
        for(int i = 0; i < n; i++){
            int a = ui.nextInt();
            if(a == 1){
                isHard = true;
                break;
            }
        }
        if(isHard){
            System.out.println("HARD");
        }else{
            System.out.println("EASY");
        }
 
    }
}