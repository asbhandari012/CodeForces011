import java.util.*;
 
public class Main{
    public static void main(String args[]){
        Scanner ui = new Scanner(System.in);
        
        int n = ui.nextInt();
        int t = ui.nextInt();
        
        String str = ui.next();
        char queue[] = str.toCharArray();
        
        while(t > 0){
            int left = 0;
            
            while(left < n - 1){
                if(queue[left] == 'B' && queue[left + 1] == 'G'){
                    char temp = queue[left];
                    queue[left] = queue[left+1];
                    queue[left+1] = temp;
                    left += 2;
                }else{
                    left++;
                }
            }
            t--;
        }
        
        System.out.println(new String(queue));
    }
}