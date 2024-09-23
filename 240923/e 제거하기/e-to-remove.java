import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int index = 0;

        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'e') {
                index = i;
                break;
            }
        }

        String answer = s.substring(0, index) + s.substring(index+1, s.length());
        System.out.print(answer);
    }
}