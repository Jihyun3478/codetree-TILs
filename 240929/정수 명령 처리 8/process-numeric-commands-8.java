import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        LinkedList<Integer> list = new LinkedList<>();

        for(int i = 0; i < N; i++) {
            String order = sc.next();
        
            if(order.equals("push_front")) {
                int A = sc.nextInt();
                list.addFirst(A);

            } else if(order.equals("push_back")) {
                int A = sc.nextInt();
                list.addLast(A);

            } else if(order.equals("pop_front")) {
                System.out.println(list.pollFirst());

            } else if(order.equals("pop_back")) {
                System.out.println(list.pollLast());

            } else if(order.equals("size")) {
                System.out.println(list.size());

            } else if(order.equals("empty")) {
                if(list.isEmpty()) {
                    System.out.println("1");
                } else {
                    System.out.println("0");
                }

            } else if(order.equals("front")) {
                System.out.println(list.peekFirst());

            } else if(order.equals("back")) {
                System.out.println(list.peekLast());
            }
        }
    }
}