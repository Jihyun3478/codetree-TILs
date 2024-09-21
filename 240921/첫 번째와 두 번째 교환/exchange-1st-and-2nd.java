import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        String[] strArr = new String[str.length()];
        String c1 = String.valueOf(str.charAt(0));
        String c2 = String.valueOf(str.charAt(1));
        
        for(int i = 0; i < str.length(); i++) {
            strArr[i] =  String.valueOf(str.charAt(i));
            if(strArr[i].equals(c1)) {
                strArr[i] = c2;
            } else if(strArr[i].equals(c2)) {
                strArr[i] = c1;
            }
            System.out.print(strArr[i]);
        }
    }
}