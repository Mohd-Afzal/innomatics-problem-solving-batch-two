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

    public static int getLength(LinkedListNode<Integer> head) {
        int length = 0;

        while (head != null) {
            length += 1;
            head = head.next;
        }

        return length;
    }

    public static LinkedListNode<Integer> getIthNode(LinkedListNode<Integer> head, int i) {
        int n = getLength(head);
        int count = 0;
        // Write your iterative code
        // Write a recursive function

        return null;
    }

    public static void printReverse(LinkedListNode<Integer> head) {

        if (head == null) {
           return;
        }

        printReverse(head.next);
        System.out.print(head.data + " ");
    }

    public static LinkedListNode<Integer> deleteIthNode(LinkedListNode<Integer> head, int i) {

        if (i == 0) {
            return head.next;
        }

//        LinkedListNode<Integer> temp = head;
//        int startIndex = 1; // reducing by 1
//        while (startIndex < i) {
//            temp = temp.next;
//            startIndex += 1;
//        }
//        temp.next = temp.next.next;

        LinkedListNode<Integer> prev = null;
        LinkedListNode<Integer> curr = head;

        while (i != 0) {
            prev = curr;
            curr = curr.next;
            i--;
        }

        prev.next = curr.next;
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

//        printList(head);
//        System.out.println(getLength(head));
//        printReverse(head);

        // Delete the node from ith position
        head = deleteIthNode(head, s.nextInt());
        printList(head);

    }
}
