import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] s = new String[100];
        int index = 0, cnt = -1;

        for(int i = 0; i < 100; i++) {
            s[i] = sc.next();
            cnt++;

            if(s[i].equals("0")) {
                System.out.println(cnt);
                index = i;
                break;
            }
        }

        for(int i = 0; i < index; i++) {
            if(i % 2 == 0) {
                System.out.println(s[i]);
            }
        }
    }
}