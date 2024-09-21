import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.next();
        String str2 = sc.next();
        int index = 0;
        boolean isInclude = false;

        for(int i = 1; i < str1.length(); i++) {
            String temp = String.valueOf(str1.charAt(i-1)) + String.valueOf(str1.charAt(i));
            if(temp.equals(str2)) {
                index = i-1;
                isInclude = true;
            }
        }

        if(isInclude == true) {
            System.out.print(index);
        } else {
            System.out.print("-1");
        }
    }
}