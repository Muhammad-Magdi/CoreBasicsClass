public class LinkedListQueue<E> implements Queue<E> {
    private SinglyLinkedList<E> linkedList;

    LinkedListQueue(){linkedList = new SinglyLinkedList<>();}

    public void push(E data) {
        linkedList.add(data, linkedList.size());
    }
    public E pop() {
        E ret = linkedList.get(0);
        linkedList.remove(0);
        return ret;
    }
    public E front() {
        return linkedList.get(0);
    }
    public boolean isEmpty() {
        return linkedList.isEmpty();
    }
    public int size() {
        return linkedList.size();
    }
}
