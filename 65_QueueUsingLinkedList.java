public class QueueUsingLinkedList {

    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
     static class Queue {
         static Node head = null;
         static Node tail = null;

        public static boolean isEmpty(){
             return head==null && tail==null;
        }
        public static void add(int data){
            Node newNode  = new Node(data);
            if(head==null)
            {
                head=tail=newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
        }
        public static int remove(){
            if(isEmpty())
            {
                System.out.println("Queue is Empty");
                return -1;
            }
            int front = head.data;
            if(tail == head)//if single element is present
            {
                head= tail= null;
            }
            else{
                head = head.next;
            }
            return front;
        }
        public static int peek(){
            if(isEmpty())
            {
                System.out.println("Queue is Empty");
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(11);
        q.add(21);
        q.add(31);
        q.add(41);
        q.add(4);
        q.add(51);
        while (!q.isEmpty()){
            System.out.print(q.peek()+" ");
            q.remove();
        }
    }
}
