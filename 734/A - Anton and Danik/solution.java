import java.util.*;
 
public class Main {
 
    public static void main(String args[]){
        Scanner ui = new Scanner(System.in);
 
        int n = ui.nextInt();
 
        String s = ui.next();
 
        int a = 0;
        int d = 0;
 
        for(int i = 0; i < n; i++){
            char ch = s.charAt(i);
 
            if(ch == 'A'){
                a++;
            }else{
                d++;
            }
        }
 
        if(a > d){
            System.out.println("Anton");
        }else if(d > a){
            System.out.println("Danik");
        }else{
            System.out.println("Friendship");
        }
    }
}