package Queue;

public class CircularQueue {
    private static final int DEFAULT_SIZE=10;
    protected int data[]; 
    protected int front=0;
    protected int end=0;
    private int size=0;
    public CircularQueue()
    {
        this(DEFAULT_SIZE);
    }
    public CircularQueue(int size){
        data=new int[size];
    }
    
    public boolean enqueue(int val){
        if(isFull()){
            System.out.println("Queue is Full");
            return false;
        }
        data[end]=val;
        end=(end+1)%data.length;
        size++;
        return true;
    }

    public int dequeue()throws Exception{
        if(isEmpty()){
            throw new QueueException("QUEUE IS EMPTY");
        }
        int removed= data[front++];
        front=front%data.length;
        size--;
        return removed;
    }

    public int front() throws Exception{
        if(isEmpty()){
            throw new QueueException("QUEUE IS EMPTY");
        }
        return data[front];
    }

    public void display()throws Exception{
        if(isEmpty()){
            throw new QueueException("QUEUE IS EMPTY");
        }
        int i = front;
        do {
            System.out.print(data[i] + " ");
            i = (i + 1) % data.length;
        } while (i != end);
        System.out.println("END");
    }

    public boolean isFull(){
        return size==data.length-1;
    }
    public boolean isEmpty(){
        return size==0;
    }
}
