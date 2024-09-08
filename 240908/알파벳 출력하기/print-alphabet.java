import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int start = 65;
        int cnt = 0;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < i+1; j++) {
                System.out.print((char)(start+cnt));
                cnt++;
                if(cnt > 25) {
                    cnt = 0;
                }
            }
            System.out.println();
        }
    }
}