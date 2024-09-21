import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        char[] charArr = str.toCharArray();
        
        charArr[1] = 'a';
        charArr[charArr.length-2] = 'a';

        for(int i = 0; i < charArr.length; i++) {
            System.out.print(charArr[i]);
        }
    }
}