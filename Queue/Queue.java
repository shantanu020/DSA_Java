package Queue;

public class Queue {
    private static final int DEFAULT_SIZE=10;
    protected int data[];
    // with only one pointer 
    int end=-1;
    public Queue()
    {
        this(DEFAULT_SIZE);
    }
    public Queue(int size){
        data=new int[size];
    }
    
    public boolean enqueue(int val){
        if(isFull()){
            System.out.println("Queue is Full");
            return false;
        }
        data[++end]=val;
        return true;
    }

    public int dequeue()throws Exception{
        if(isEmpty()){
            throw new QueueException("QUEUE IS EMPTY");
        }
        int removed= data[0];
        // shift all the elements left by one position;
        for(int i=1;i<=end;i++){
            data[i-1]=data[i];
        }
        end--;
        return removed;
    }

    public int front() throws Exception{
        if(isEmpty()){
            throw new QueueException("QUEUE IS EMPTY");
        }
        return data[0];
    }

    public void display(){
        for(int i=0;i<=end;i++){
            System.out.print(data[i]+" ");
        }
        System.out.print("END");
    }

    public boolean isFull(){
        return end==data.length-1;
    }
    public boolean isEmpty(){
        return end==-1;
    }
}
