import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.next();
        String s2 = sc.next();
        String newS1 = "";
        String newS2 = "";

        for(int i = 0; i < s1.length(); i++) {
            if(Character.isDigit(s1.charAt(i))) {
                newS1 += s1.charAt(i);
            }           
        }

        for(int i = 0; i < s2.length(); i++) {
            if(Character.isDigit(s2.charAt(i))) {
                newS2 += s2.charAt(i);
            }
        }
        System.out.print(Integer.parseInt(newS1) + Integer.parseInt(newS2));
    }
}