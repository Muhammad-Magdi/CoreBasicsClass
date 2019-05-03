public class Deque<E> {
    DoublyLinkedList<E> doublyLinkedList;

    Deque(){
        doublyLinkedList = new DoublyLinkedList<>();
    }
    public void pushBack(E data){
        doublyLinkedList.add(data, doublyLinkedList.size());
    }
    public void pushFront(E data){
        doublyLinkedList.add(data, 0);
    }
    public E popBack(){
        E ret = doublyLinkedList.get(doublyLinkedList.size()-1);
        doublyLinkedList.remove(doublyLinkedList.size()-1);
        return ret;
    }
    public E popFront(){
        E ret = doublyLinkedList.get(0);
        doublyLinkedList.remove(0);
        return ret;
    }
    public E getBack(){
        return doublyLinkedList.get(doublyLinkedList.size()-1);
    }
    public E getFront(){
        return doublyLinkedList.get(0);
    }
    public int size(){
        return doublyLinkedList.size();
    }
    public boolean isEmpty(){
        return doublyLinkedList.isEmpty();
    }
}
