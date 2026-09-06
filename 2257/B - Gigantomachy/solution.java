import java.util.*;
 
public class Main {
 
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while (t > 0) {
 
            int n = sc.nextInt();
            int m = sc.nextInt();
 
            int[] a = new int[n];
            int[] b = new int[m];
 
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
 
            for (int i = 0; i < m; i++) {
                b[i] = sc.nextInt();
            }
 
            long bea = (long) a[0] + n - 1;
            long ver = (long) b[0] + m - 1;
 
            if (bea >= ver) {
                System.out.println(1);
            } else {
                System.out.println(2);
            }
            
            t--;
        }
 
        sc.close();
    }
}