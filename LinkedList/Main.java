package LinkedList;

class Node{
    int data;
    Node next;
    public Node(int data){
        this.data=data;
        this.next=null;
    }
}
class LinkedList{
    private Node head=null;
    public void insertAtEnd(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
        }
        else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newNode;
        }
    }
    public void insertAtBeg(int data){
        // create a newNode
        Node newNode=new Node(data);
        // attach the newNode at the begining
        newNode.next=head;
        // make newNode as head
        head=newNode;
    }
    public void insertAfter(int key,int data){
        // if head is null return
        if(head==null){
            System.out.println("Linked List is empty");
            return;
        }
        Node newNode=new Node(data);
        Node pre=head;
        // traverse the linkedlist until key is found provided node should not be null
        while(pre!=null&&pre.data!=key){
            pre=pre.next;
        }
        // if current node is not null insert data after key
        if(pre!=null){
            newNode.next=pre.next;
            pre.next=newNode;
        }else{
            System.out.println("Key not Found: "+key);
        }
        
    }
    public void insertBefore(int key,int data){
        if(head==null){
            System.out.println("Linked List is empty");
            return;
        }
        Node newNode=new Node(data);
        
        if(head.data==key){
            insertAtBeg(data);
            return;
        }
        Node pre=head;
        while(pre.next!=null&&pre.next.data!=key){
            pre=pre.next;
        }
        if(pre.next!=null){
            newNode.next=pre.next;
            pre.next=newNode;
        }
        else{
            System.out.println("Key not Found: "+key);
        }
    }
    public void delAtBeg(){
        if(head==null){
            System.out.println("Linked List is empty");
            return;
        }
        Node temp=head;
        head=head.next;
        temp.next=null;

    }
    public void delAtEnd(){
        if(head==null){
            System.out.println("Linked List is empty");
            return;
        }
        Node temp=head;
        Node preTemp=head;
        while(temp.next!=null){
            preTemp=temp;
            temp=temp.next;
        }
        preTemp.next=null;
    }
    public void delAfter(int key){
        if(head==null){
            System.out.println("Linked List is empty");
            return;
        }
        Node temp=head;
        Node postTemp=head;
        while(temp.next!=null&&temp.data!=key){
            temp=temp.next;
        }
        if(temp.next==null){
            System.out.println("No element to be deleted After : "+key);
        }else{
            postTemp=temp.next;
            temp.next=postTemp.next;
        }
        
    }
    public void delBefore(int key){
        if(head==null){
            System.out.println("Linked List is empty");
            return;
        }
        Node post=head;
        Node pre=head;
        if(post.next.data==key){
            delAtBeg();
            return;
        }
        while(post.next!=null&&post.next.data!=key){
            pre=post;
            post=post.next;
        }
        if(post.next!=null){
            pre.next=post.next;
        }else{
            System.out.println("Key not Found: "+key);
        }
        
    }
    // public void delAtPos(int pos){
    //     if(head==null){
    //         System.out.println("Linked List is empty");
    //         return;
    //     }
    // }
    public void display(){
        if(head==null){
            System.out.println("Linked List is empty");
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }
        System.out.println(temp.data);
    }
}

public class Main {
    public static void main(String[] args) {
        LinkedList link=new LinkedList();
        for(int i=0;i<=10;i++){
            link.insertAtEnd(i);
        }
        
        link.display();
    }
    
}
