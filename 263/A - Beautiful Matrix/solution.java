import java.util.*;
 
public class Main{
 
    public static int solution(int nums[][]) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                if (nums[i][j] == 1) {
                    return Math.abs(i - 2) + Math.abs(j - 2);
                }
            }
        }
        return 0;
    }
 
 
 
    public static void main(String args[]){
        Scanner ui = new Scanner(System.in);
        int n = 5;
        int nums[][] = new int[n][n];
 
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                nums[i][j] = ui.nextInt();
            }
        }
        System.out.println(solution(nums));
    }
}