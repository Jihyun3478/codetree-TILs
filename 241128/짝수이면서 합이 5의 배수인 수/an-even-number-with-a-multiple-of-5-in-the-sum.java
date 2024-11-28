import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        checkNumber(n);
    }

    public static void checkNumber(int n) {
        String str = String.valueOf(n);
        String[] strArr = str.split("");
        int sum = 0;

        for(int i = 0; i < 2; i++) {
            sum += Integer.parseInt(strArr[i]);
        }
        
        if(n % 2 == 0 && sum % 5 == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}