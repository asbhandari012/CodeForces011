import java.util.*;
 
public class Main{
    public static void main(String args[]){
        Scanner ui = new Scanner(System.in);
        
        int n = ui.nextInt();
        int k = ui.nextInt();
        int nums[] = new int[n];
        int count = 0;
        
        for(int i = 0; i < n; i++){
            nums[i] = ui.nextInt();    
        }
        
        int target = nums[k-1];
        
        for(int i = 0; i < n; i++){
            if(nums[i] > 0 && nums[i] >= target){
                count++;
            }
        }
        
        System.out.println(count);
    }
}