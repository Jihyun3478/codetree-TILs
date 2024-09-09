import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] n = new int[10];
        int index = 0;
        for(int i = 0; i < n.length; i++) {
            n[i] = sc.nextInt();
            if(n[i] == 0) {
                index = i;
                break;
            } else {
                index = 10;
            }
        }

        int sum = 0;
        double avg = 0;
        for(int i = index-1; i >= 0; i--) {
            sum += n[i];
        }
        System.out.print(sum + " ");
        avg = sum / index;
        System.out.printf("%.1f", avg);
    }
}