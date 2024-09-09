import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] n = new int[10];
        
        int sum = 0;
        double cnt = 0.0;
        for(int i = 0; i < n.length; i++) {
            n[i] = sc.nextInt();
        }

        for(int i = 0; i < n.length; i++) {
            if(n[i] < 250) {
                sum += n[i];
                cnt++;
            } else {
                break;
            }
        }
        System.out.print(sum + " ");
        System.out.printf("%.1f", sum/cnt);
    }
}