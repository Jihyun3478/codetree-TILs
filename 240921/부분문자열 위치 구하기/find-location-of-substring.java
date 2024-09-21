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
                for(int j = 0; j < str2.length(); j++) {
                    if(str2.charAt(j) == str1.charAt(i)) {
                        index = i-1;
                        isInclude = true;
                        break;
                    }
                }
            }
        }
        
        if(str1 == str2) {
            isInclude = true;
        }
        
        if(isInclude) {
            System.out.print(index);
        } else {
            System.out.print("-1");
        }
    }
}