import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        String s = sc.next();
        
        LinkedList<Character> list = new LinkedList<>();
        for(int i = 0; i < s.length(); i++) {
            list.add(s.charAt(i));
        }
        ListIterator<Character> it = list.listIterator(list.size());

        while(m-- > 0) {
            char recipe = sc.next().charAt(0);

            if(recipe == 'L') {
                if(it.hasPrevious()) {
                    it.previous();
                }
            } else if(recipe == 'R') {
                if(it.hasNext()) {
                    it.next();
                }
            } else if(recipe == 'D') {
                if(it.hasNext()) {
                    it.next();
                    it.remove();
                }
            } else if(recipe == 'P') {
                char c = sc.next().charAt(0);
                it.add(c);
            }
        }

        it = list.listIterator();
        while(it.hasNext()) {
            System.out.print(it.next());
        }
    }
}