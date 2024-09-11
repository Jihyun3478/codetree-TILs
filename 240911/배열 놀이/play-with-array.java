import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int q = sc.nextInt();

        int[] numbers = new int[n];
        for(int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        int[] question = new int[q];
        for(int i = 0; i < q; i++) {
            question[i] = sc.nextInt();

            if(question[i] == 1) {
                int a = sc.nextInt();
                question1(numbers, a);

            } else if(question[i] == 2) {
                int b = sc.nextInt();
                question2(numbers, b);

            } else if(question[i] == 3) {
                int s = sc.nextInt();
                int e = sc.nextInt();
                question3(numbers, s, e);
            }
        }
    }

    public static void question1(int[] numbers, int a) {
        System.out.println(numbers[a-1]);
    }

    public static void question2(int[] numbers, int b) {
        int cnt = 0;
        int num = 0;
        int[] index = new int[numbers.length];
        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i] == b) {
                cnt++;
                index[num++] = i+1;
            }
        }

        if(cnt >= 1) {
            System.out.println(index[0]);
        } else if(cnt == 0) {
            System.out.println("0");
        }
    }

    public static void question3(int[] numbers, int s, int e) {
        for(int i = s-1; i < e; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
}