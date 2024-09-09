import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int stuCnt = sc.nextInt();
        int cnt = 0;

        for(int i = 0; i < stuCnt; i++) {
            int[] grades = new int[4];
            int sum = 0, avg = 0;
            for(int j = 0; j < grades.length; j++) {
                grades[j] = sc.nextInt();
                sum += grades[j];
            }
            
            avg = sum / 4;
            if(avg >= 60) {
                System.out.println("pass");
                cnt++;
            } else if(avg < 60){
                System.out.println("fail");
            }
        }
        System.out.print(cnt);
    }
}