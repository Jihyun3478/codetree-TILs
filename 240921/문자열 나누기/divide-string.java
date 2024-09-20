import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] strArr = new String[n];
        String answer = "";

        for(int i = 0; i < n; i++) {
            strArr[i] = sc.next();
            answer += strArr[i];
        }

        for(int i = 0; i < answer.length(); i++) {
            System.out.print(answer.charAt(i));
            if((i+1) % 5 == 0) {
                System.out.println();
            }
        }
    }
}