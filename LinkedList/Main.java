package LinkedList;

// Node 
class Node{
    int data;
    Node next;
    public Node(int data){
        this.data=data;
        this.next=null;
    }
}

// LinkedList Class 
class LinkedList{

    private Node head=null;
    // GET HEAD
    public Node getHead(){
        return head;
    }

    // INSERT AT END
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


    // INSERT AT BEGINING
    public void insertAtBeg(int data){
        // create a newNode
        Node newNode=new Node(data);
        // attach the newNode at the begining
        newNode.next=head;
        // make newNode as head
        head=newNode;
    }

    // INSERT AFTER A NODE
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

    // INSERT BEFORE A NODE
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

    // INSERT AT POSITION
    public void insertAtPos(int pos,int data){
        if(head==null){
            System.out.println("Linked List is empty");
            return;
        }
        // if position to be inserted is at begining
        if(pos==1){
            insertAtBeg(data);
            return;
        }
        // if position to be inserted is in between begining and end
        Node temp=head;
        Node preTemp=head;
        Node newNode= new Node(data);
        while(temp!=null&&pos!=1){
            preTemp=temp;
            temp=temp.next;
            pos--;
        }
        if(temp!=null&&pos==1)
        {
            newNode.next=preTemp.next;
            preTemp.next=newNode;
        }
        // is position to be inserted is at end
        if(temp==null){
            insertAtEnd(data);
        }else{
            System.out.println("Position is out of bound");
        }


    }

    // DEL AT BEGINING
    public void delAtBeg(){
        if(head==null){
            System.out.println("Linked List is empty");
            return;
        }
        Node temp=head;
        head=head.next;
        temp.next=null;

    }

    // DEL AT END
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

    // DEL AFTER
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

    // DEL BEFORE
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

    // DEL AT POS
    public void delAtPos(int pos){
        if(head==null){
            System.out.println("Linked List is empty");
            return;
        }
        // if position to be deleted is at begining
        if(pos==1){
            delAtBeg();
        }
        Node temp=head;
        Node preTemp=head;
        while(temp!=null&&pos!=1){
            preTemp=temp;
            temp=temp.next;
            pos--;
        }
        // if position to be deleted doesn't exist
        if(pos>1||temp==null){
            System.out.println("Position is out of bound");
        }
        // if position to be deleted is at end  
        else if(temp.next==null){
            delAtEnd();
        }
        // if position to be deleted exist and in between the first and last position
        else{
            preTemp.next=temp.next;
        }
       
    }

    // DISPLAY
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

    // REVERSING THE LINKEDLIST
    public void reverse(){
        Node currNode=head;
        Node prevNode=null;
        Node nextNode;
        while(currNode!=null){
            nextNode=currNode.next;
            currNode.next=prevNode;

            prevNode=currNode;
            currNode=nextNode;
        }
        head=prevNode;
    }

    // REVERSING THE LINKEDLIST RECURSIVELY
    public void reverseRecur(Node prevNode,Node currNode)
    {
        if(currNode==null){
            head=prevNode;
            return;
        }
        Node nextNode=currNode.next;
        currNode.next=prevNode;
        reverseRecur(currNode, nextNode);
    }

    // FINDING MIDDLE OF THE LINKEDLIST
    public void mid(){
        Node slowTemp=head;
        Node fastTemp=head;
        while(fastTemp!=null&&fastTemp.next!=null){
            slowTemp=slowTemp.next;
            fastTemp=fastTemp.next.next;
        }
        System.out.println("Middle: "+slowTemp.data);
        
    }
    
    // CYCLE DETECTION IN LINKEDLIST
    // FLOYD'S CYCLE DETECTION ALGORITHM
    // if slow and fast pointers both point to same node this means loop is detected
    public void detectCycle(){
        Node slowTemp=head;
        Node fastTemp=head;
        boolean flag=false;
        while(fastTemp!=null&&fastTemp.next!=null){
            slowTemp=slowTemp.next;
            fastTemp=fastTemp.next.next;
            if(slowTemp==fastTemp){
                flag=true;
                break;
            }
        }
        if(flag){
            System.out.println("Cycle detected");
        }else{
            System.out.println("Cycle not detected");
        }
    }

    // SEARCHING AN ELEMENT IN THE LINKED LIST
    public void search(int key){
        Node temp=head;
        boolean found=false;
        int pos=1;
        while(temp!=null){
            if(temp.data==key){
                found =true;
                break;
            }
            pos++;
            temp=temp.next;
        }
        if(found){
            System.out.println("Element found at pos: "+pos);
        }else{
            System.out.println("Element not found");
        }
    }

    // REMOVING DUPLICATES FROM SORTED LINKEDLIST
    public void removeDuplicates(){
        Node temp=head.next;
        Node preTemp=head;
        while(temp!=null){
            // if current and next node both have same data
            if(preTemp.data==temp.data){
                // skip the duplicate node
                preTemp.next=temp.next;
                temp=preTemp.next;
            }
            else{
                // move both the pointers
                preTemp=preTemp.next;
                temp=temp.next;
            }
            
        }
    }

}

public class Main {
    public static void main(String[] args) {
        LinkedList link=new LinkedList();
        link.insertAtBeg(5);
        link.insertAtBeg(5);
        link.insertAtBeg(3);
        link.insertAtBeg(2);
        link.insertAtBeg(2);
        link.insertAtBeg(2);
        link.insertAtBeg(1);
        link.display();
        link.removeDuplicates();
        link.display();
    }
    
}


// some important questions on linkedList
// 1. Linked list is Palindrome or not
// 2. Addition of two linkedlist

