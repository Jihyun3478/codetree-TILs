import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int count  = 0;
        for(int i = a; i <= b; i++) {
            if(isDecimal(i) && isSumEven(i)) {
                count++;
            }
        }
        System.out.print(count);
    }

    public static boolean isDecimal(int i) {
        int count = 0;
        for(int j = 1; j <= i; j++) {
            if(i % j == 0) {
                count++;
            }
        }
        return count == 2;
    }

    public static boolean isSumEven(int i) {
        int sum = 0;

        while(i != 0) {
            sum += i % 10;
            i /= 10;
        }
        
        return sum % 2 == 0;
    }
}