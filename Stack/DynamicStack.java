package Stack;

public class DynamicStack extends Stack {
    public DynamicStack(){
        super();
    }
    public DynamicStack(int size){
        super(size);
    }
    @Override
    public boolean push(int val){
        if(this.isFull()){
            int [] temp=new int[data.length*2];
            for(int i=0;i<data.length;i++){
                temp[i]=data[i];
            }
            data=temp;
        }
        return super.push(val);
    }
    public static void main(String[] args)throws Exception {
        DynamicStack dstk=new DynamicStack(3);
        dstk.push(1);
        dstk.push(2);
        dstk.push(3);
        // Size will be doubled after this as stack is full
        dstk.push(4);
        dstk.push(5);
        System.out.println(dstk.peek());

    }
}
