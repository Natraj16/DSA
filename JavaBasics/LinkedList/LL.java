package JavaBasics.LinkedList;

public class LL {

    private Node head;
    private Node tail;

    public LL() {
        this.size = 0;
    }

    private int size;

    public void insertFirst(int val){
        Node node=new Node(val);
        node.next=head;
        head=node;

        if (tail==null){
            tail=head;
        }
        size+=1;

    }

    public void display(){
        Node temp=head;

        while(temp!=null){
            System.out.print(temp.value+ " -> ");
            temp=temp.next;
        }
        System.out.print("END");
    }

    public void insertLast(int val){
        if(tail==null){
            insertFirst(val);
            return;
        }
        Node node=new Node(val);
        tail.next=node;
        tail=node;
        size++;
    }
    public void insert(int value, int index){
        if(index==0){
            insertFirst(value);
            return;
        }
        if(index==size){
            insertLast(value);
            return;
        }
        Node temp=head;
        for(int i=1;i<index;i++){
            temp=temp.next;
        }
        Node node=new Node(temp.next,value);
        temp.next=node;

        size++;
    }

    //insert using recursion
    //we are given index value and head
    //observation: 1)have a void return type and make change in LL 2)have a node return type that returns the list node to change the structure
    //step 1 visualize how the ll will look like

    public void insertRec(int val, int index){
        head=insertRec(val,index, head);
    }
    private Node insertRec(int val, int index, Node node ){
        if(index==0){
            Node temp=new Node(node, val);
            size++;
            return temp;
        }
        node.next=insertRec(val,index-1,node.next);
        return node;
    }

    public int deleteFirst(){

        int val=head.value;
        head=head.next;
        if (head == null) {
            tail=null;
        }
        size--;
        return val;

    }
    public Node get(int index){
        Node node=head;
        for(int i=0;i<index;i++){
            node=node.next;
        }
        return node;
    }
    public int deleteLast(){
        if(size<=1){
            return deleteFirst();
        }
        Node secondLast=get(size-2);
        int value=tail.value;
        tail=secondLast;
        tail.next=null;
        size--;
        System.out.println("\n The deleted node is:");
        return value;
    }
    private class Node{
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
        public Node(Node next, int value) {
            this.next = next;
            this.value = value;
        }

    }
    public int delete(int index){
        if(index ==0){
           return deleteFirst();
        }
        if(index== size-1){
            return deleteLast();
        }
        Node prev= get(index-1);
        int val=prev.next.value;
        prev.next=prev.next.next;
        System.out.println();
        return val;
    }
    public Node find(int value){
        Node node=head;
        while(node!=null){
            if(node.value==value){
                return node;
            }
            node=node.next;

        }
        return null;
    }
}
