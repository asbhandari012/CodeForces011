import java.util.*;
 
public class Main {
 
 
    public static String solution(String exp){
 
        if(exp.length() == 1) return exp;
 
        char arr[] = new char[(exp.length() + 1)/ 2];
 
        int ind = 0;
 
        for(int i = 0; i < exp.length(); i++){
            if(i % 2 == 0){
                arr[ind] = exp.charAt(i);
                ind++;
            }
        }
 
        Arrays.sort(arr);
        StringBuilder sb = new StringBuilder();
        sb.append(arr[0]);
 
        for(int i = 1; i < arr.length; i++){
            sb.append("+" + arr[i]);
        }
 
        return sb.toString();
 
    }
 
    public static void main(String args[]) {
        Scanner ui = new Scanner(System.in);
 
        String exp = ui.next();
 
        System.out.println(solution(exp));
    }
}