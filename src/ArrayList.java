public class ArrayList<E> implements List<E> {
    private E [] array;
    private int size;

    ArrayList(){this(1);}
    ArrayList(int capacity){
        array = (E[]) new Object[capacity];
    }

    public E get(int index) {
        if(index < 0 || index >= size)
            throw new IndexOutOfBoundsException();
        return array[index];
    }

    public void addBack(E data) {
        if(size == array.length)
            resize(2*array.length);
        array[size++] = data;
    }

    public E removeBack() {
        if(isEmpty())
            throw new IllegalStateException();
        return array[--size];
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    private void resize(int newCapacity){
        E [] tmpArray = (E[]) new Object[newCapacity];
        for(int i = 0 ; i < array.length ; ++i)
            tmpArray[i] = array[i];
        array = tmpArray;
    }
}
