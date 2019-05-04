public class MonotonicQueue<E extends Comparable<E>> {
    private Queue<E> queue;
    private Deque<E> min;
    private Deque<E> max;

    MonotonicQueue(){
        queue = new ArrayQueue<>();
        min = new Deque<>();
        max = new Deque<>();
    }
    public void push(E data){       //Amortized O(1)
        queue.push(data);
        while(!min.isEmpty() && min.getBack().compareTo(data) > 0)
            min.popBack();
        min.pushBack(data);

        while(!max.isEmpty() && max.getBack().compareTo(data) < 0)
            max.popBack();
        max.pushBack(data);
    }
    public E front(){       //O(1)
        return queue.front();
    }
    public E pop(){         //O(1)
        E ret = queue.pop();
        if(min.getFront().equals(ret))
            min.popFront();
        if(max.getFront().equals(ret))
            max.popFront();
        return ret;
    }
    public E getMin(){       //O(1)
        return min.getFront();
    }
    public E getMax(){       //O(1)
        return max.getFront();
    }
    public int size(){       //O(1)
        return queue.size();
    }
    public boolean isEmpty(){       //O(1)
        return queue.isEmpty();
    }
}
