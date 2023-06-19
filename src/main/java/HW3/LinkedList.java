package HW3;

public class LinkedList {
    Node head;
    Node tail;

    public static void main(String[] args) {
        int num1 = 11;
        int num2 = 22;
        int num3 = 33;
        int num4 = 44;

        LinkedList hw3 = new LinkedList();

        hw3.add(num1);
        hw3.add(num2);
        hw3.add(num3);
        hw3.add(num4);

        hw3.revert();

    }

    public class Node {
        int value;
        Node nextNode;
        Node previousNode;
    }

    public void add(int value){
        Node node = new Node();
        node.value = value;

        if(head == null) {
            head = node;
            tail = node;
        } else {
            tail.nextNode = node;
            node.previousNode = tail;
            tail = node;
        }
    }


    public void revert() {
        Node node = head;

        Node currentNode = head;
        head = tail;
        tail = currentNode;

        while (node.nextNode != null) {
            currentNode = node.nextNode;
            node.nextNode = node.previousNode;
            node.previousNode = currentNode;
            node = node.previousNode;
        }
    }
}
