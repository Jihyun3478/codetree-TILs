import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        char o = sc.next().charAt(0);
        int c = sc.nextInt();

        int answer = 0;
        if(o == '+') {
            answer = add(a, o, c);
        } else if(o == '-') {
            answer = sub(a, o, c);
        } else if(o == '/') {
            answer = div(a, o, c);
        } else if(o == '*') {
            answer = mul(a, o, c);
        } else {
            System.out.print("False");
        }
        System.out.print(a + " " + o + " " + c + " = " + answer);
    }

    public static int add(int a, char o, int c) {
        return a+c;
    }

    public static int sub(int a, char o, int c) {
        return a-c;
    }

    public static int div(int a, char o, int c) {
        return a/c;
    }

    public static int mul(int a, char o, int c) {
        return a*c;
    }
}