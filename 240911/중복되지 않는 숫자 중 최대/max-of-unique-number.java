import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] numbers = new int[n];
        int[] cnt = new int[n+1];

        for(int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
            cnt[numbers[i]]++;
        }
        
        int max = -1;    
        for(int i = 0; i < n+1; i++) {
            if(cnt[i] == 1) {
                if(i > max) {
                    max = i;
                }
            } else if(cnt[i] != 1) {
                continue;
            }
        }
        System.out.print(max);
    }
}