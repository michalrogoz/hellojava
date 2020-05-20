package singly_linked_list;

public class SinglyLinkedList {

    private Node head;

    public void add(int data) {
        Node newNode = new Node(data);
        newNode.next = null;

        if (this.head == null) {
            this.head = newNode;
        } else {
            Node last = this.head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = newNode;
        }
    }

    public String print() {

        StringBuilder sb = new StringBuilder();

        Node currNode = this.head;
        sb.append("Linked list: ");
        while (currNode != null) {
            sb.append(currNode.data);
            sb.append(" ");
            currNode = currNode.next;
        }
        return sb.toString();
    }

    public void serialize(String filename) {
        String print = this.print();

        //stworzyc nowy plik i zapisac w nim Stringa print
    }


    public boolean deleteByKey(int key) {

        Node currentNode = this.head;
        Node prev = null;

        //Case 1 (head to be deleted)
        if (currentNode != null && currentNode.data == key) {
            this.head = currentNode.next;
            System.out.println("Deleted");
            return true;
        }

        //Case 2 key is somewhere
        while (currentNode != null && currentNode.data != key) {
            prev = currentNode;
            currentNode = currentNode.next;
        }
        if (currentNode != null) {
            prev.next = currentNode.next;
            System.out.println("Deleted");
            return true;
        }

        //Case 3 There is no key to be deleted
        if (currentNode == null) {
            System.out.println("Not found");
            return false;
        }

        return false;
    }

    public void deleteAll(int key) {
        boolean flag;
        do {
            flag = deleteByKey(key);
        } while (flag);
    }


    private static class Node {
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {

//LISTA
        SinglyLinkedList list = new SinglyLinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(3);
        list.add(5);
        list.add(5);
        System.out.println(list.print());
        list.deleteAll(3);
        System.out.println(list.print());


    }
}
