package linkedlist.singly;

public class CreateSingleLL{
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    Node head = null;

    public void addNodeAtBegin(int data){

        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        }else{
            newNode.next = head;
            head = newNode;
        }
    }
    public void addNodeAtEnd(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        } else{
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public void addNodeAtAnyPoint(int data, int position){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        }else {
            Node temp = head;
            for(int i=0;i<position-1; i++){
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }
    }

    public static void main(String[] args){
        CreateSingleLL singleLL = new CreateSingleLL();

        singleLL.addNodeAtBegin(7);
        singleLL.addNodeAtBegin(17);
        singleLL.addNodeAtBegin(13);
        singleLL.addNodeAtBegin(11);
        singleLL.addNodeAtEnd(5);
        singleLL.addNodeAtEnd(3);
        singleLL.addNodeAtAnyPoint(15, 3);
        singleLL.addNodeAtAnyPoint(19, 5);

    }
}