import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int[] a = new int[n1];
        int[] b = new int[n2];
        
        String s1 = "";
        String s2 = "";
        for (int i = 0; i < n1; i++) {
            a[i] = sc.nextInt();
            s1 += String.valueOf(a[i]);
        }
        for (int i = 0; i < n2; i++) {
            b[i] = sc.nextInt();
            s2 += String.valueOf(b[i]);
        }
        // Please write your code here.

        if (s1.contains(s2)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}