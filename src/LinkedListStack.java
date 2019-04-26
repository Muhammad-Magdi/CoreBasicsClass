public class LinkedListStack<E> implements Stack<E> {
    SinglyLinkedList<E> linkedList;

    LinkedListStack(){
        linkedList = new SinglyLinkedList<>();
    }

    public void push(E data) {
        linkedList.addFront(data);
    }

    public E pop() {
        E ret = linkedList.getFront();
        linkedList.removeFront();
        return ret;
    }

    public E top() {
        return linkedList.getFront();
    }

    public int size() {
        return linkedList.size();
    }

    public boolean isEmpty() {
        return linkedList.isEmpty();
    }
}
