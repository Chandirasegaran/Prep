/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stackusinglinkedlist;

/**
 *
 * @author chandirasegaran
 */
class stack {

    private class Node {

        int data;
        Node next;

        Node(int val) {
            data = val;
            next = null;
        }
    }

    Node top;

    void push(int val) {
        
        Node newNode = new Node(val);
        newNode.next=top;
        top=newNode;
    }
    int pop(){
        int temp = top.data;
        top=top.next;
        return temp;
    }
}

public class StackUsingLinkedList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        stack stk = new stack();
        stk.push(10);
        stk.push(20);
        stk.push(259);
        stk.push(285);
        stk.push(525);
        stk.push(25);
        stk.push(55);
        System.out.println(stk.pop());
    }

}
