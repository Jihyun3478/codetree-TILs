import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char a = sc.next().charAt(0);
        int convertA = 0;

        if(a == 'z') {
            convertA = 97;
        } else {
            convertA = (int)a+1;
        }
        System.out.print((char)convertA);
    }
}