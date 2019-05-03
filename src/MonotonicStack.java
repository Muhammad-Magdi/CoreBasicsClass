public class MonotonicStack<E extends Comparable<E>>{
    private Stack<E> stack, maximums, minimums;

    MonotonicStack(){
        stack = new ArrayStack<>();
        maximums = new ArrayStack<>();
        minimums = new ArrayStack<>();
    }

    public void push(E data){
        stack.push(data);
        if(maximums.isEmpty())
            maximums.push(data);
        else if(data.compareTo(maximums.top()) >= 0)
            maximums.push(data);

        if(minimums.isEmpty())
            minimums.push(data);
        else if(data.compareTo(minimums.top()) <= 0)
            minimums.push(data);
    }
    public E getMax(){
        return maximums.top();
    }
    public E getMin(){
        return minimums.top();
    }
    public E pop(){
        if(stack.top().compareTo(minimums.top()) == 0)
            minimums.pop();
        if(stack.top().compareTo(maximums.top()) == 0)
            maximums.pop();
        return stack.pop();
    }
    public E top(){
        return stack.top();
    }
    public int size(){
        return stack.size();
    }
    public boolean isEmpty(){
        return stack.isEmpty();
    }
}
