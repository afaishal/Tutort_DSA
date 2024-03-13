package linkedlist.singly;

public class reverseSinglyList {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;

        }
    }

    Node head = null;
    public Node addNode(int data){
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
        return head;
    }


    public static void main(String[] args){
        reverseSinglyList list = new reverseSinglyList();
        Node head = null;
        head =list.addNode(5);
        head = list.addNode(17);
        head = list.addNode(23);
        head = list.addNode(3);

        list = list.reverseSingleLL(head);

        System.out.println(list.head);




    }

    private reverseSinglyList reverseSingleLL(Node head) {
        reverseSinglyList singlyList = new reverseSinglyList();
        Node current = null;
        Node prev = null;
        while(head.next!=null){
            current = head.next;
            head.next = prev;
            prev = head;
            head= current;
            singlyList.addNode(prev.data);
        }
        return singlyList;


    }


}
