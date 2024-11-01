import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int len = a.length;
        boolean sorted = true;
  
        do {
            sorted = true;

            for(int i = 1; i < n; i++) {
                if(a[i-1] > a[i]) {
                    int tmp = a[i-1];
                    a[i-1] = a[i];
                    a[i] = tmp;

                    sorted = false;
                }
            }
        } while (sorted == false);

        for(int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}