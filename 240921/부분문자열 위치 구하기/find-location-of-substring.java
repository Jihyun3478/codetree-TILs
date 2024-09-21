import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.next();
        String str2 = sc.next();
        int index = 0;
        boolean isInclude = false;

        for(int i = 0; i < str1.length(); i++) {
            if(str1.charAt(i) == str2.charAt(0)) {
                index = i;
                isInclude = true;
                break;
            }
        }

        if(isInclude) {
            System.out.print(index);
        } else {
            System.out.print("-1");
        }
    }
}