import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] isCorona = new char[3];
        int[] temp = new int[3];
        int[] cnt = new int[4];

        for(int i = 0; i < 3; i++) {
            isCorona[i] = sc.next().charAt(0);
            temp[i] = sc.nextInt();

            if(isCorona[i] == 'Y' && temp[i] >= 37) {
                cnt[0]++;
            } else if(isCorona[i] == 'N' && temp[i] >= 37) {
                cnt[1]++;
            } else if(isCorona[i] == 'Y' && temp[i] < 37) {
                cnt[2]++;
            } else {
                cnt[3]++;
            }
        }

        for(int i = 0; i < 4; i++) {
            System.out.print(cnt[i] + " ");
        }

        if(cnt[0] >= 2) {
            System.out.print("E");
        }
    }
}