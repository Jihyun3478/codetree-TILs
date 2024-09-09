import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        double[] grades = new double[n];
        double sum = 0, avg = 0;
        
        for(int i = 0; i < grades.length; i++) {
            grades[i] = sc.nextDouble();
            sum += grades[i];
            avg = sum / grades.length;
        }
        System.out.printf("%.1f", avg);

        if(avg >= 4.0) {
            System.out.println("\nPerfect");
        } else if(avg >= 3.0 && avg <= 4.0) {
            System.out.println("\nGood");
        } else if(avg < 3.0) {
            System.out.println("\nPoor");
        }
    }
}