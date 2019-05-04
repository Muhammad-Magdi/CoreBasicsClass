public class StackQueue<E> implements Queue<E> {
    private Stack<E> s1, s2;

    StackQueue(){
        s1 = new ArrayStack<>();
        s2 = new ArrayStack<>();
    }
    public void push(E data) {
        s1.push(data);
    }
    public E pop() {
        if(s2.isEmpty())
            swapStacks();
        return s2.pop();
    }
    public E front() {
        if(s2.isEmpty())
            swapStacks();
        return s2.top();
    }
    public boolean isEmpty() {
        return s1.isEmpty() && s2.isEmpty();
    }
    public int size() {
        return s1.size() + s2.size();
    }

    private void swapStacks(){
        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }
    }
}
