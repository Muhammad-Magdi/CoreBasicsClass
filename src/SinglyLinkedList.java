public class SinglyLinkedList<E> {
    private static class Node<E>{
        private E data;
        private Node<E> next;

        Node(){}
        Node(E data){
            this(data, null);
        }
        Node(E data, Node<E> next){
            this.data = data;
            this.next = next;
        }
        public E getData() {
            return data;
        }
        public void setData(E data) {
            this.data = data;
        }
        public Node<E> getNext() {
            return next;
        }
        public void setNext(Node<E> next) {
            this.next = next;
        }
    }
    private int size;
    private Node<E> front, back;

    SinglyLinkedList(){}
    SinglyLinkedList(E initialValue){
        addFront(initialValue);
    }
    public void addFront(E data){     //O(1)
        Node<E> newNode = new Node<>(data, front);
        front = newNode;
        if(size == 0)   back = newNode;
        ++size;
    }
    public int size(){          //O(1)
        return this.size;
    }
    public E getFront(){      //O(1)
        if(isEmpty())
            throw new IllegalStateException("Can't get Front of an Empty List.");
        return front.getData();
    }
    public void removeFront() throws IllegalStateException{  //O(1)
        if(isEmpty())
            throw new IllegalStateException("Can't Remove from an Empty List.");
        if(size == 1){
            front = null;
            back = null;
        }
        else   front = front.getNext();
    }
    public boolean isEmpty(){       //O(1)
        return size == 0;
    }
    public String toString(){       //O(n)
        //TODO
        return "";
    }
    public void add(E data, int index){    //O(n)
        if(index < 0 || index > size)
            throw new IndexOutOfBoundsException();
        if(index == 0)  addFront(data);
        else if(index == size)   addBack(data);
        else {
            Node<E> cur = front;
            for (int i = 0; i < index - 1; ++i)
                cur = cur.getNext();
            Node<E> newNode = new Node<>(data, cur.getNext());
            cur.setNext(newNode);
        }
    }
    public void remove(int index){      //O(n)
        if(index < 0 || index >= size)
            throw new IndexOutOfBoundsException();
        if(index == 0)  removeFront();
        else if(index == size - 1)  removeBack();
        else{
            Node<E> cur = front;
            for(int i = 0 ; i < index -1 ; ++i)
                cur = cur.getNext();
            cur.setNext(cur.getNext().getNext());
        }
    }
    public E get(int index){  //O(n)
        if(index < 0 || index >= size)
            throw new IndexOutOfBoundsException();
        Node<E> cur = front;
        for(int i = 0 ; i < index ; ++i)
            cur = cur.getNext();
        return cur.getData();
    }
    public void clear(){        //O(1)
        front = null;
        back = null;
    }
    public void sort(){
        //TODO
    }
    public int find(E data){      //O(n)
        //TODO
        return 0;
    }
    public void addBack(E data){        //O(1)
        if(size == 0)   addFront(data);
        else {
            Node<E> newNode = new Node<>(data);
            back.setNext(newNode);
            back = newNode;
        }
    }
    //O(n) using SinglyLinkedList
    public void removeBack(){
        if(size < 2)    removeFront();
        Node<E> cur = front;
        int index = 0;
        while(index != size - 2){
            cur = cur.getNext();
            ++index;
        }
        cur.setNext(null);
        back = cur;
    }
    public E getBack(){
        if(isEmpty())
            throw new IllegalStateException();
        return back.getData();
    }
}
