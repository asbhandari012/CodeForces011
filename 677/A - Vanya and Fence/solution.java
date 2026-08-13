import java.util.*;
 
public class Main {
 
 
    public static int solution(int mat[], int h){
 
        int count = 0;
 
        for(int i = 0; i < mat.length; i++){
            int x = mat[i] + (h-1);
 
            count += (x / h);
        }
        return count;
    }
 
    public static void main(String args[]){
        Scanner ui = new Scanner(System.in);
 
        int n = ui.nextInt();
        int h = ui.nextInt();
 
        int mat[] = new int[n];
 
        for(int i = 0; i < n; i++){
            mat[i] = ui.nextInt();
        }
 
        System.out.println(solution(mat, h));
    }
}