public class ArrayStack<E> implements Stack<E> {
    private static final int CAPACITY = 1000;
    private E [] array;
    private int size;

    ArrayStack(){
        this(CAPACITY);
    }

    ArrayStack(int capacity){
        array = (E[]) new Object[capacity];
    }

    public void push(E data) {      //O(1)
        if(size == array.length){
            //TODO
        }
        array[size] = data;
        size++;
    }

    public E pop() {            //O(1)
        --size;
        return array[size];
    }

    public E top() {        //O(1)
        return array[size-1];
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }
}
