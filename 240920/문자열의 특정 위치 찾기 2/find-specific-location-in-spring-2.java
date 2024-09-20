import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = "apple";
        String str2 = "banana";
        String str3 = "grape";
        String str4 = "blueberry";
        String str5 = "orange";
        int cnt = 0;

        char alphabet = sc.next().charAt(0);

        if(str1.charAt(2) == alphabet || str1.charAt(3) == alphabet) {
            System.out.println("apple");
            cnt++;
        }
        if(str2.charAt(2) == alphabet || str2.charAt(3) == alphabet) {
            System.out.println("banana");
            cnt++;
        }
        if(str3.charAt(2) == alphabet || str3.charAt(3) == alphabet) {
            System.out.println("grape");
            cnt++;
        }
        if(str4.charAt(2) == alphabet || str4.charAt(3) == alphabet) {
            System.out.println("blueberry");
            cnt++;
        }
        if(str5.charAt(2) == alphabet || str5.charAt(3) == alphabet) {
            System.out.println("orange");
            cnt++;
        }
        System.out.println(cnt);
    }
}