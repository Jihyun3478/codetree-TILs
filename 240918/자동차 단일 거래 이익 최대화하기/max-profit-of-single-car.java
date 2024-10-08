import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] price = new int[n];
        int max = 0;

        for(int i = 0; i < n; i++) {
            price[i] = sc.nextInt();
        }
        
        int profit = 0;
        for(int i = 0; i < n; i++) {
            for(int j = i+1; j < n; j++) {
                if(price[i] <= price[j]) {
                    profit = Math.abs(price[i] - price[j]);
                    if(profit > max) {
                        max = profit;
                    }
                }       
            }
        }
        System.out.print(max);
    }
}