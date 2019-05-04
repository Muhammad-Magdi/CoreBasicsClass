public class OrderedArrayListPriorityQueue<E extends Comparable<E>> implements  PriorityQueue<E> {
    ArrayList<E> sortedArrayList;

    OrderedArrayListPriorityQueue(){
        sortedArrayList = new ArrayList<>();
    }
    public void push(E data) {      //O(n)
        insertElement(data);
    }
    public E pop() {        //O(1)
        return sortedArrayList.removeBack();
    }
    public E front() {      //O(1)
        return sortedArrayList.get(sortedArrayList.size()-1);
    }
    public boolean isEmpty() {  //O(1)
        return sortedArrayList.isEmpty();
    }
    public int size() {         //O(1)
        return sortedArrayList.size();
    }

    private void insertElement(E data){     //O(n)
        sortedArrayList.addBack(data);
        int i = sortedArrayList.size()-2;
        while(i >= 0 && sortedArrayList.get(i).compareTo(sortedArrayList.get(i+1)) > 0){
            E tmp = sortedArrayList.get(i);
            sortedArrayList.set(i, sortedArrayList.get(i+1));
            sortedArrayList.set(i+1, tmp);
        }
    }
}
