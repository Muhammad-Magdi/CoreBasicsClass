public class ArrayListStack<E> implements Stack<E> {
    private ArrayList<E> arrayList;

    ArrayListStack(){arrayList = new ArrayList<>();}
    public void push(E data) {
        arrayList.addBack(data);
    }
    public E pop() {
        return arrayList.removeBack();
    }
    public E top() {
        return arrayList.get(arrayList.size()-1);
    }
    public int size() {
        return arrayList.size();
    }
    public boolean isEmpty() {
        return arrayList.isEmpty();
    }
}
