public interface List<E> {
    E get(int index);
    void addBack(E data);
    E removeBack();
    int size();
    boolean isEmpty();
}
