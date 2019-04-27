public class ArrayQueue<E> implements Queue<E> {
    private static int CAPACITY = 1000;
    private int front, back, size;
    private E [] array;

    ArrayQueue(){this(CAPACITY);}
    ArrayQueue(int capacity){
        array = (E[]) new Object[capacity];
    }
    public void push(E data) {
        if(size == array.length)
            throw new IllegalStateException();
        array[back] = data;
        back = (back+1)%array.length;
        ++size;
    }
    public E pop() {
        if(isEmpty())
            throw new IllegalStateException();
        E ret = array[front];
        front = (front+1)%array.length;
        --size;
        return ret;
    }
    public E front() {
        return array[front];
    }
    public boolean isEmpty() {
        return size == 0;
    }
    public int size() {
        return size;
    }
}
