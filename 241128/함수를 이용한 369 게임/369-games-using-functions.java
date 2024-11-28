import java.util.Scanner;

public class Main {
    

    public static int isMagicNumber(int a, int b) {
        int cnt = 0;
        for(int i = a; i <= b; i++) {
            String number = String.valueOf(i);
            if(i % 3 == 0 || number.contains("3") || number.contains("6") || number.contains("9")) {
                cnt++;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(isMagicNumber(a, b));
    }
}