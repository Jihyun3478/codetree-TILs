import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int[] A = new int[n1];
        int[] B = new int[n2];
        String a = "";
        String b = "";

        for(int i = 0; i < n1; i++) {
            A[i] = sc.nextInt();
            a += String.valueOf(A[i]);
        }

        for(int i = 0; i < n2; i++) {
            B[i] = sc.nextInt();
            b += String.valueOf(B[i]);
        }

        if(a.contains(b)) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
    }
}