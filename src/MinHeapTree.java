public class MinHeapTree<E extends Comparable<E>> extends AbstractHeapTree<E> {
    protected boolean mustGoUp(E node, E parent) {
        return node.compareTo(parent) < 0;
    }
}
