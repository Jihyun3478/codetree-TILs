import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        List<Integer> answer = new ArrayList<>();

        for(int i = 0; i < N; i++) {
            String s = sc.next();
            
            if(s.equals("push_back")) {
                int A = sc.nextInt();
                answer.add(A);
            } else if(s.equals("pop_back")) {
                answer.remove(answer.size()-1);
            } else if(s.equals("size")) {
                System.out.println(answer.size());
            } else if(s.equals("get")) {
                int k = sc.nextInt();
                System.out.println(answer.get(k-1));
            }
        }

        // for(int i = 0; i < answer.size(); i++) {
        //     System.out.println(answer.get(i));
        // }
    }
}