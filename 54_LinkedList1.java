import java.util.*;
public class LinkList2 {

public static class Node{
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
 public static Node head;
public static Node tail;

public static int size;

public void addaNodeFirst(int data){
    Node n1 = new Node(data);
    size++;
    if(head== null)
    {
        head = tail=n1;
        return;
    }
    n1.next = head;
    head= n1;

}

public void addNodeLast(int data)
{
    Node lastNode  = new Node(data);
    size++;
    if(head == null)
    {
        head = tail = lastNode;
    }
    tail.next= lastNode;
    tail = lastNode;
}

public void addNodeMid(int index, int data)
{
    Node midNode = new Node(data);
    size++;
    Node temp = head;
    int i=0;
    while(i<index-1)
    {
        temp = temp.next;
        i++;
    }

    midNode.next=temp.next;
    temp.next = midNode;
}

public void print()
{
    if(head == null){
        System.out.println("Empty LinkedList");
    }
    Node current = head;
    while(current.next != null){
        System.out.print(current.data + "-->");
        current = current.next;
    }
    System.out.print(current.data + "-->");
    System.out.print("null\n");
}

public int length(){
    Node curr = head;
    int count = 0;
    while(curr.next != null){
        curr = curr.next;
        count++;
    }
    return count+1;
}


    public static void main(String[] args) {
        LinkList2 ll = new LinkList2();
        ll.addaNodeFirst(1);
        ll.addaNodeFirst(2);
        ll.addNodeLast(3);
        ll.addNodeLast(4);
        ll.addNodeLast(4);
        ll.addNodeLast(4);
        ll.addNodeLast(4);
        ll.addNodeLast(4);
        ll.addNodeMid(2,6);
        ll.print();
        System.out.println(size);
    }


}
