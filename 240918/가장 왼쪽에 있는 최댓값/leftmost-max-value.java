import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] numbers = new int[N];

        for(int i = 0; i < N; i++) {
            numbers[i] = sc.nextInt();
        }
        
        while(numbers.length >= 1) {
            int max = -1; 

            for(int i = 0; i < numbers.length; i++) {
                if(numbers[i] >= max) {
                    max = numbers[i];
                }
            }

            int index = 0;
            for(int i = 0; i < numbers.length; i++) {
                if(numbers[i] == max) {
                    index = i;
                    break;
                }
            }
            System.out.print(index+1 + " ");
            numbers = Arrays.copyOfRange(numbers, 0, index);
        }
    }
}