import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        s = s.toLowerCase();
        
        for(int i = 0; i < s.length(); i++) {
            if(Character.isLetter(s.charAt(i)) || Character.isDigit(s.charAt(i))) {
                System.out.print(s.charAt(i));
            }
        }
    }
}