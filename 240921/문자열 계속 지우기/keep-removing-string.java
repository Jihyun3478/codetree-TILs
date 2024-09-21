import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String A = sc.next();
        String B = sc.next();

        boolean isInclude = true;

        while(isInclude == true) {
            for(int i = 0; i <= A.length() - B.length(); i++) {
                isInclude = true;

                for(int j = 0; j < B.length(); j++) {
                    if(A.charAt(i + j) != B.charAt(j)) {
                        isInclude = false;
                        break;
                    }
                }

                if(isInclude) {
                    A = A.substring(0, i) + A.substring(i + B.length(), A.length());
                }
            }
        }
        System.out.print(A);
    }
}