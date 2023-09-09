/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package linkedlist;

class ListNode {

    int data;
    ListNode next;
}

/**
 *
 * @author Chandirasegaran
 */
public class LinkedList {

    private ListNode head = null;

    public void displayList() {
        if (head == null) {
            System.out.println("\nEmpty List");
            return;
        }
        ListNode temp = head;
        System.out.print("\nList Contains: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public void insertAtBeginning(int val) {
        ListNode newNode = new ListNode();
        newNode.data = val;
        if (head == null) {
            newNode.next = null;
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void insertAtEnd(int val) {
        ListNode newNode = new ListNode();
        if (head == null) {
            insertAtBeginning(val);
            return;
        }
        ListNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        newNode.data = val;
        newNode.next = null;
        temp.next = newNode;
    }

    public void insertAtPosition(int val, int position) {
        if (position == 0) {
            insertAtBeginning(val);
            return;
        }
        ListNode newNode = new ListNode();
        ListNode temp = head;
        for (int i = 0; i < position - 1; i++) {
            temp = temp.next;
            if (temp == null) {
                System.out.println("\nInvalid Position");
                return;
            }
        }
        newNode.data = val;
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void deleteAtPosition(int position) {
        if (head == null) {
            System.out.println("Empty List");
            return;
        }

        ListNode temp = head;
        ListNode prev = null;

        if (position == 0) {
            head = head.next;
            temp = null;
            return;
        }

        for (int i = 0; i < position; i++) {
            prev = temp;
            temp = temp.next;
            if (temp == null) {
                System.out.println("\nInvalid Position");
                return;
            }
        }

        prev.next = temp.next;
        temp = null;
    }

    public void searchAtPosition(int position) {
        ListNode temp = head;
        for (int i = 0; i < position; i++) {
            temp = temp.next;
            if (temp == null) {
                System.out.println("\nInvalid Position");
                return;
            }
        }
        System.out.println("\nThe Value at position \"" + position + "\" is " + temp.data);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int choice, val, position;
        LinkedList list = new LinkedList();
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        while (true) {
            System.out.println("\n--------------------Linked List--------------------");
            System.out.println("1. Display");
            System.out.println("2. Insert at Beginning.");
            System.out.println("3. Insert at End.");
            System.out.println("4. Insert at Position.");
            System.out.println("5. Delete at Position.");
            System.out.println("6. Search at Position.");
            System.out.println("7. Exit");
            System.out.print("Enter your Choice: ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    list.displayList();
                    break;
                case 2:
                    System.out.print("Enter the Value to Insert: ");
                    val = scanner.nextInt();
                    list.insertAtBeginning(val);
                    break;
                case 3:
                    System.out.print("Enter the Value to Insert: ");
                    val = scanner.nextInt();
                    list.insertAtEnd(val);
                    break;
                case 4:
                    System.out.print("Enter the Position: ");
                    position = scanner.nextInt();
                    System.out.print("Enter the Value to Insert: ");
                    val = scanner.nextInt();
                    list.insertAtPosition(val, position);
                    break;
                case 5:
                    System.out.print("Enter the Position to Delete: ");
                    position = scanner.nextInt();
                    list.deleteAtPosition(position);
                    break;
                case 6:
                    System.out.print("Enter the Position to Search: ");
                    position = scanner.nextInt();
                    list.searchAtPosition(position);
                    break;
                case 7:
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("\n\nInvalid Choice!\n\n");
                    break;
            }
        }

    }

}
