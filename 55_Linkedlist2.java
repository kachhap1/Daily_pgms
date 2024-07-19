import java.util.*;
public class linkedList {
    public class Node{
        int data;
        Node next;
        public Node(int data)
        {
            this.data= data;
            this.next=null;
        }

    }
    public static Node head;
    public static Node tail;

    public void addFirst(int data){
        Node n1= new Node(data);
        if(head== null)
        {
            head=tail= n1;
            return;
        }
        n1.next = head;
        head= n1;
    }
    public void addMidNode(int index,int data)
    {
        Node n2= new Node(data);
        Node temp = head;
        int i=0;
        while(i<index-1){
            temp = temp.next;
            i++;
        }
        n2.next=temp.next;
        temp.next =n2;
    }

    public void printList()
    {
        Node temp = head;
        while(temp!=null)
        {
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
        System.out.print("null");
        System.out.println();
    }

    public int searchKey(int key)
    {
        Node curr = head;
        int idx=0;
        if(curr.next!= null)
        {
            if(curr.data == key)
            {
                return idx;
            }
            else{
                curr=curr.next;
                idx++;
            }

        }
        return -1;
    }

    // public int searchingKey(int index , Node head)
    // {
        
    // }


    public static void main(String args[])
    {
        linkedList ll= new linkedList();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addMidNode(2,8);
        ll.printList();
        System.out.println("Found at index"+ll.searchKey(5)); //iterative search
    }
}
