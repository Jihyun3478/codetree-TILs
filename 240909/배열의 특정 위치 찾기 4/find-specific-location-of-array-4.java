import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] n = new int[10];
        int index = 0, sum = 0, cnt = 0;
        for(int i = 0; i < n.length; i++) {
            n[i] = sc.nextInt();
            if(n[i] == 0) {
                index = i;
                break;
            } else {
                index = 10;
            }
        }

        for(int i = 0; i < index; i++) {
            if(n[i] % 2 == 0) {
                sum += n[i];
                cnt++;
            }
        }
        System.out.print(cnt + " " + sum);
    }
}