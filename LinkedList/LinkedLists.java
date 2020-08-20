package LinkedListDAS;

public class LinkedLists<T> {
    private class Node{
        T data;
        Node next;
    }
    private Node head;
    private int size;
    private Node tail;

    public int size(){
        return this.size;
    }
    public boolean empty(){
        return this.size==0;
    }

    public void addLast(T d){

        if(this.size==0){
            this.hendelAddWhenHeadZero( d);
            return;
        }
        //create
        Node node =new Node();
        // set properties
        node.data=d;
        node.next=null;
        //attach;
        tail.next=node;
        //update tail and size;
        tail=node;
        this.size++;
    }


    public void addFirst(T d){

        if(this.size==0){
            this.hendelAddWhenHeadZero( d);
            return;
        }
        //create
        Node node =new Node();
        // set properties
        node.data=d;
        node.next=head;
        head=node;
        //update tail and size;

        this.size++;
    }

    private void hendelAddWhenHeadZero(T data) {
        Node node=new Node();
        node.data=data;
        node.next=null;
        this.head=this.tail=node;
        size++;
    }

    public void display(){
        Node temp=this.head;
        while (temp!=null){
            System.out.print(temp.data+"-->");
            temp=temp.next;

        }
        System.out.println(".");
    }

    public T getFirst() throws Exception{
        if(this.size==0){
            throw new Exception("Index Out of Bound");
        }
        return head.data;
    }
    public T getLast() throws Exception{
        if(this.size==0){
            throw new Exception("Index Out of Bound");
        }
        return tail.data;
    }

    public T getAt(int indx) throws Exception{
        if(this.size==0){
            throw new Exception("Index Out of Bound");
        }
        if(indx<0 || indx>=size){
            throw new Exception("Index Out of Bound");
        }
        Node node=head;
        for (int i=0;i<indx;i++){
            node=node.next;
        }
        return node.data;

    }

    public Node NodeAt(int indx) throws Exception{
        if(this.size==0){
            throw new Exception("Index Out of Bound");
        }
        if(indx<0 || indx>=size){
            throw new Exception("Index Out of Bound");
        }
        Node node=head;
        for (int i=0;i<indx;i++){
            node=node.next;
        }
        return node;

    }




    public void addAt(int indx,T da) throws Exception{
        if(indx<0 || indx>size){
            throw new Exception("This is invalid argument");
        }
        else if(indx==0){
           addFirst(da);
        }
        else if(indx==size){
            addLast(da);
        }
        else {
            Node nodeindxmone=NodeAt(indx-1);
            Node nodeindex=NodeAt(indx);
            Node node=new Node();
            node.data=da;
            node.next=nodeindex;
            nodeindxmone.next=node;
            this.size++;
        }

    }


    public void removeFirst(){
        head=head.next;
        this.size--;
    }

    public void removeLast() throws Exception {
        Node lastMinOne = this.NodeAt(size-2);
        lastMinOne.next=null;
        this.size--;
        tail=lastMinOne;
    }


    public void removeAt(int indx) throws Exception{
        if(indx<0 || indx>size){
            throw new Exception("This is invalid argument");
        }
        else if(indx==0){
            removeFirst();
        }
        else if(indx==size){
            removeLast();
        }
        else {
            Node nodeindxmone=NodeAt(indx-1);
            Node nodeindex=NodeAt(indx);
           nodeindxmone.next=nodeindex.next;
           nodeindex.next=null;
            this.size--;
        }

    }


}
