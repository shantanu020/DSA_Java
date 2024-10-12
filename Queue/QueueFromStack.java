package Queue;

import java.util.Stack;

public class QueueFromStack {
    Stack<Integer>stk1=new Stack<>();
    Stack<Integer>stk2=new Stack<>();
    public static void main(String[] args) {
        QueueFromStack q=new QueueFromStack();
        q.insert(1);
        q.insert(2);
        q.insert(3);
        System.out.println(q.front());
        q.delete();
        q.delete();
        System.out.println(q.front());


    }
    public void insert(int val){
        stk1.push(val);
    }
    public void delete(){
        if(stk1.isEmpty()&&stk2.isEmpty()){
            System.out.println("Queue is Empty");
            return;
        }
        if(stk2.isEmpty()){
            while(!stk1.isEmpty()){
                stk2.push(stk1.pop());
            }
        }
        stk2.pop();
    }
    public int front(){
        if(stk1.isEmpty()&&stk2.isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }
        if(stk2.isEmpty()){
            while(!stk1.isEmpty()){
                stk2.push(stk1.pop());
            }
        }
        return stk2.peek();
    }

}
// Time complexity 
// 1.enqueue O(1)
// 2.dequeue O(n)