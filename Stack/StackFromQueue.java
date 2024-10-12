package Stack;

import java.util.LinkedList;
import java.util.Queue;


public class StackFromQueue {
    Queue<Integer> q1=new LinkedList<>();
    Queue<Integer> q2=new LinkedList<>();
    public static void main(String[] args) {

        StackFromQueue stk=new StackFromQueue();
        stk.push(1);
        stk.push(2);
        stk.push(3);
        stk.push(4);
        stk.push(5);
        System.out.println(stk.peek());
    }
    public void push(int val){
        // Empty all elements from q1 into q2;
        while(!q1.isEmpty()){
            q2.add(q1.peek());
            q1.poll();
        }
        // add value in q1;
        q1.add(val);
        // move back all elements from q2 ti q1;
        while(!q2.isEmpty()){
            q1.add(q2.peek());
            q2.poll();

        }
    }
    public int pop(){
        // if q1 is empty return WARNING;
        if(q1.isEmpty()){
            System.out.println("STACK UNDERFLOW");
            return -1;
        }
        // remove the front element of queue;
       int ele= q1.peek();
       q1.poll();
       return ele;
    }
    public int peek(){
        if(q1.isEmpty()){
            System.out.println("STACK UNDERFLOW");
            return -1;
        }
        int val=q1.peek();
       return val;
    }

    
}
