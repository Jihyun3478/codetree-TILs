import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        char[] arr = s.toCharArray();
        int q = sc.nextInt();
        
        for(int i = 0; i < q; i++) {
            int numberOfQuestion = sc.nextInt();

            if(numberOfQuestion == 1) {
                int num1 = sc.nextInt();
                int num2 = sc.nextInt();

                char temp = arr[num1-1];
                arr[num1-1] = arr[num2-1];
                arr[num2-1] = temp;

                for(int j = 0; j < arr.length; j++) {
                    System.out.print(arr[j]);
                }
                System.out.println();
            } else if(numberOfQuestion == 2) {
                char a = sc.next().charAt(0);
                char b = sc.next().charAt(0);

                for(int j = 0; j < arr.length; j++) {
                    if(arr[j] == a) {
                        arr[j] = b;
                    }
                    System.out.print(arr[j]);
                }
            }
        }
    }
}