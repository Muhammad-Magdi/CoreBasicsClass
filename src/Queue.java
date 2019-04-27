public interface Queue<E> {
    void push(E data);
    E pop();
    E front();
    boolean isEmpty();
    int size();
}
