import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int count = 0;
        for(int i = a; i <= b; i++) {
            if(!isDivideTwo(i) && !isFive(i) && !checkDivideCondition(i)) {
                count++;
            }
        }
        System.out.print(count);
    }

    public static boolean isDivideTwo(int i) {
        return i % 2 == 0;
    }

    public static boolean isFive(int i) {
        String s = String.valueOf(i);
        return s.charAt(s.length()-1) == '5';
    }

    public static boolean checkDivideCondition(int i) {
        return i % 3 == 0 && i % 9 != 0;
    }
}