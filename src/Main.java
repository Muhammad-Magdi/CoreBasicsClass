import java.util.Scanner;

public class Main {

    public static ArrayList<Integer> heapSort(ArrayList<Integer> data){
        ArrayList<Integer> ret = new ArrayList<>(data.size());
        PriorityQueue<Integer> q = new HeapPriorityQueue<>();
        for(int i = 0 ; i < data.size() ; ++i)      //O(n*log(n))
            q.push(data.get(i));
        while(!q.isEmpty()){    //O(n*log(n))
            ret.addBack(q.pop());
        }
        return ret;
    }
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new HeapPriorityQueue<>();
        priorityQueue.push(5);
        System.out.println(priorityQueue.front());
        priorityQueue.push(2);
        System.out.println(priorityQueue.front());
        priorityQueue.push(7);
        System.out.println(priorityQueue.front());
        priorityQueue.pop();
        System.out.println(priorityQueue.front());
        priorityQueue.pop();
        System.out.println(priorityQueue.front());
    }
}