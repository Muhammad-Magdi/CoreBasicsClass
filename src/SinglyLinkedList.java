public class SinglyLinkedList<E> {
    private static class Node<E>{
        private E data;
        private Node next;

        Node(){}

        Node(E data){
            this(data, null);
        }

        Node(E data, Node next){
            this.data = data;
            this.next = next;
        }
        public E getData() {
            return data;
        }
        public void setData(E data) {
            this.data = data;
        }
        public Node getNext() {
            return next;
        }
        public void setNext(Node next) {
            this.next = next;
        }
    }
    private int size;
    private Node<E> front;

    SinglyLinkedList(){}
    SinglyLinkedList(E initialValue){
        addFront(initialValue);
    }

    public void addFront(E data){     //O(1)
        Node<E> newNode = new Node(data, front);
        front = newNode;
        ++size;
    }
    public int size(){          //O(1)
        return this.size;
    }

    public E getFront(){      //O(1)
        return front.getData();
    }

    public void removeFront(){  //O(1)
        if(!isEmpty()) {
            front = front.getNext();
            size--;
        }else{
            //TODO
        }
    }

    public boolean isEmpty(){       //O(1)
        return size == 0;
    }

    public String toString(){       //O(n)
        //TODO
        return "";
    }

    public void add(E data, int index){    //O(n)
        Node<E> cur = front;
        for(int i = 0 ; i < index - 1 ; ++i)
            cur = cur.getNext();
        Node<E> newNode = new Node(data, cur.getNext());
        cur.setNext(newNode);
    }

    public void remove(int index){      //O(n)
        //TODO
    }

    public E get(int index){  //O(n)
        if(index < size){
            Node<E> cur = front;
            for(int i = 0 ; i < index ; ++i)
                cur = cur.getNext();
            return cur.getData();
        }else{
            //TODO
            return null;
        }
    }

    public void clear(){        //O(1)
        front = null;
    }

    public void sort(){

    }

    public int find(E data){      //O(n)
        //TODO
        return 0;
    }

    public void addBack(E data){        //O(1)
        //TODO
    }

    //O(1) using DoublyLinkedList
    //O(n) using SinglyLinkedList
    public void removeBack(){
        //TODO
    }
}
