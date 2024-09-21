import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        char[] arr = s.toCharArray();
        char ch = s.charAt(0);
        
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == s.charAt(1)) {
                arr[i] = ch;
            }
            System.out.print(arr[i]);
        }
    }
}