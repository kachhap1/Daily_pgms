import java.util.Deque;
import java.util.LinkedList;

public class StackUsingDeque {
    static  class  Stack{
        Deque<Integer> dq = new LinkedList<>();

        public void push(int data){
            dq.addLast(data);
        }
         public int pop(){
            return dq.removeLast();
         }

         public int peek(){
            return dq.getLast();
         }

    }

    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        System.out.println(st.peek()+" ");
        System.out.println(st.pop());
        while (!st.dq.isEmpty())
        {
            System.out.print(st.peek()+" ");
            st.pop();
        }
    }
}
