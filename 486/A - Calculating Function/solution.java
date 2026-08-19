    import java.util.*;
 
    public class Main {
        public static void main(String args[]){
            Scanner ui = new Scanner(System.in);
 
            long n = ui.nextLong();
 
 
            if(n % 2 == 0){
                System.out.println(n/2);
            }else{
                System.out.println(-(n/2) - 1);
            }
        }
    }