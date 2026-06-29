class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {

    Node head=null;

    public void insertBeginning(int data) {

        // Step 1: Create a new node
        Node newNode = new Node(data);

        // Step 2: Make the new node point to the current head
        newNode.next = head;

        // Step 3: Make the new node the head
        head = newNode;
    }
    void insertlast(int data){
        Node newNode = new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
    }
    void insertposition(int pos,int data){
        
        if(pos>0){
            System.out.println("invalid index");
            return;
        }
        if(pos==1){
            insertBeginning(data);
            return;
        }
        Node temp=head;
        Node newNode = new Node(data);
        for(int i=1;i<pos-1;i++){
            if(temp==null){
                System.out.println("Invalid position");
                return;
            }
            newNode.next=temp.next;
            temp.next=newNode;
        }
    }
    void deletefirst(){
        if(head==null){
            System.out.println("Invalid");
            return;
        }
        head=head.next;
    }
    void deleteend(){
        if(head==null){
            System.out.println("Invalid");
            return;
        }
        if(head.next==null){
            head=null;
            return;
        }
        Node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
    }

    public void display() {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("NULL");
    }
}

public class list1 {

    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        list.insertBeginning(30);
        list.insertBeginning(20);
        list.insertlast(10);
        list.insertposition(2,40);
        list.deletefirst();
        list.deleteend();

        list.display();
    }
}