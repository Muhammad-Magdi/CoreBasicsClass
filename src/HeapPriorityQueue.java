public class HeapPriorityQueue<E extends Comparable<E>> implements PriorityQueue<E> {
    MinHeapTree<E> maxHeapTree;
    HeapPriorityQueue(){
        maxHeapTree = new MinHeapTree<>();
    }
    public void push(E data) {
        maxHeapTree.push(data);
    }
    public E pop() {
        return maxHeapTree.pop();
    }
    public E front() {
        return maxHeapTree.top();
    }
    public boolean isEmpty() {
        return maxHeapTree.isEmpty();
    }
    public int size() {
        return maxHeapTree.size();
    }
}
