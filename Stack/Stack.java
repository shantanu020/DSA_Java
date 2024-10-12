package Stack;
public class Stack {
    protected  int[] data;
    private static final int DEFAULT_SIZE=10;
    int ptr=-1;
    public Stack(){
        this(DEFAULT_SIZE);
    }
    public Stack(int size){
        this.data=new int[size];
    }

    public boolean  push(int val){
        if(isFull()){
            System.out.println("STACK IS FULL");
            return false;
        }
        ptr++;
        data[ptr]=val;
        return true;
    }
    public int pop() throws Exception{
        if(isEmpty()){
            throw new StackException("Stack is already empty");
        }
        return data[ptr--];
    }

    public int peek() throws Exception{
        if(isEmpty()){
            throw new StackException("Stack is already empty");
        }
        return data[ptr];
    }
    public boolean isFull(){
       return ptr==data.length-1; 
    }
    public boolean isEmpty(){
        return ptr==-1;
    }
    public static void main(String[] args)throws Exception {
        Stack stk=new Stack(5);
        stk.push(1);
        stk.push(2);
        stk.push(3);
        stk.push(4);
    }

}
