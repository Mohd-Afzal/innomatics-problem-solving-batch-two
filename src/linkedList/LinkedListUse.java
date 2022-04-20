package linkedList;

import java.util.Scanner;

public class LinkedListUse {

    static Scanner s = new Scanner(System.in);

    public static void printList(LinkedListNode<Integer> head) {
        while (head != null) {
            System.out.print(head.data + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    public static LinkedListNode<Integer> inputList() {
        LinkedListNode<Integer> head = null;
        LinkedListNode<Integer> tail = null;

        int data = s.nextInt();
        while (data != -1) {
            LinkedListNode<Integer> newNode = new LinkedListNode<>(data);
            if (head == null) {
                head = newNode;
                tail = newNode;
                data = s.nextInt();
                continue;
            }

//            LinkedListNode<Integer> temp = head;
//            while (temp.next != null) {
//                temp = temp.next;
//            }
//            temp.next = newNode;

            tail.next = newNode;
            tail = newNode; // tail = tail.next

            data = s.nextInt();
        }

        return head;
    }

    public static void main(String[] args) {

//        LinkedListNode<Integer> nodeOne = new LinkedListNode<>(10);
//        LinkedListNode<Integer> nodeTwo = new LinkedListNode<>(20);
//        LinkedListNode<Integer> nodeThree = new LinkedListNode<>(30);
//        LinkedListNode<Integer> nodeFour = new LinkedListNode<>(40);
//
//        nodeOne.next = nodeTwo;
//        nodeTwo.next = nodeThree;
//        nodeThree.next = nodeFour;


        LinkedListNode<Integer> head = inputList();


//        LinkedListNode<Integer> temp = head;
//        temp = head;
//        while (temp.next != null) {
//            System.out.print(temp.data + " -> ");
//            temp = temp.next;
//        }
//        System.out.println("null");

        printList(head);

    }
}
