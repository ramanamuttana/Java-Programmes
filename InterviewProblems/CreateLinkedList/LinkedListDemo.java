package org.leetcodeproblems;

// add the values to Linkedlist and print them
class ListNode {
    int val;
    ListNode  next;

    ListNode (int x){
        this.val=x;
        this.next=null;
    }
}
public class LinkedListDemo {

    ListNode head;
    public void add(int i) {

        ListNode newNodeValue=new ListNode(i);
        if(head==null){
            head=newNodeValue;
        }else{
            ListNode current =head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNodeValue;
        }

    }


    public void printList() {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}
