package linkedList;

import java.util.LinkedList;

public class InbuiltStackUse {

    public static void main(String[] args) {
        LinkedList<Integer> head = new LinkedList<>();

        head.add(10);
        head.add(20);
        head.add(30);
        head.add(40);


//        int value = head.removeFirst();
//        System.out.println(value);
//
//        System.out.println(head.getFirst());

        while (!head.isEmpty()) {
            System.out.print(head.remove() + " ");
        }

    }

}
