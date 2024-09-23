import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int num = 0;
        String answer = "";
        
        for(int i = 0; i < s.length(); i++) {
            if(Character.isUpperCase(s.charAt(i))) {
                answer += Character.toLowerCase(s.charAt(i));
            } else if(Character.isLowerCase(s.charAt(i))) {
                answer += Character.toUpperCase(s.charAt(i));
            }
        }
        System.out.print(answer);
    }
}