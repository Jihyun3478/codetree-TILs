import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] numbers = new int[n];

        for(int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }
        
        int[] cnt = new int[n];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(numbers[j] == numbers[i]) {
                    cnt[numbers[j]]++;
                }
            }
        }
        
        for(int i = cnt.length-1; i >= 0; i--) {
            if(cnt[i] == 1) {
                System.out.print(i);
                break;
            } else {
                System.out.print("-1");
                break;
            }
        }
    }
}