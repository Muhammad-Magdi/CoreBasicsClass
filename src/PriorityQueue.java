public interface PriorityQueue<E extends Comparable<E>>{
    void push(E data);
    E pop();
    E front();
    boolean isEmpty();
    int size();
}
