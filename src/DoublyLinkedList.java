public class DoublyLinkedList<E> {
    private static class Node<E>{
        private E data;
        private Node<E> next, prev;

        Node(){}
        Node(E data){this.data = data;}
        Node(E data, Node<E> next, Node<E> prev){
            this.data = data;
            this.next=  next;
            this.prev = prev;
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
        public Node<E> getPrev() {
            return prev;
        }
        public void setPrev(Node<E> prev) {
            this.prev = prev;
        }
    }
    private Node<E> front, back;
    private int size;
    public int size(){return size;}
    public boolean isEmpty(){return size == 0;}
    public void add(E data, int index){
        if(index < 0 || index > size)
            throw new IndexOutOfBoundsException();
        if(index == 0)  addFront(data);
        else if(index == size)  addBack(data);
        else{
            Node<E> cur = front;
            for(int i = 0 ; i < index-1 ; ++i)
                cur = cur.getNext();
            Node<E> newNode = new Node<>(data, cur.getNext(), cur);
            cur.getNext().setPrev(newNode);
            cur.setNext(newNode);
        }
    }
    private void addFront(E data){
        Node<E> newNode = new Node<>(data);
        if(size == 0){
            front = newNode;
            back = newNode;
        }else{
            front.setPrev(newNode);
            newNode.setNext(front);
            front = newNode;
        }
    }
    private void addBack(E data){
        if(size == 0)   addFront(data);
        else{
            Node<E> newNode = new Node<>(data, null, back);
            back.setNext(newNode);
            back = newNode;
        }
    }
    public void remove(int index){
        if(index < 0 || index >= size)
            throw new IndexOutOfBoundsException();
        if(index == 0)  removeFront();
        else if(index == size -1)   removeBack();
        else{
            Node<E> cur = front;
            for(int i = 0 ; i < index ; ++i)
                cur = cur.getNext();
            cur.getNext().setPrev(cur.getPrev());
            cur.getPrev().setNext(cur.getNext());
        }
    }
    private void removeFront(){
        if(size == 1)   front = back = null;
        else{
            front = front.getNext();
            front.setPrev(null);
        }
    }
    private void removeBack(){
        if(size == 1)   removeFront();
        else{
            back = back.getPrev();
            back.setNext(null);
        }
    }
    public E get(int index){
        if(index < 0 || index >= size)
            throw new IndexOutOfBoundsException();
        if(index == 0)  return getFront();
        else if(index == size-1) return getBack();
        else{
            Node<E> cur = front;
            for(int i = 0 ; i < index ; ++i)
                cur = cur.getNext();
            return cur.getData();
        }
    }
    private E getFront(){
        return front.getData();
    }
    private E getBack(){
        return back.getData();
    }
}
