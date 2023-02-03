import java.util.LinkedList;
import java.util.Queue;

public class buffer {
private int n;
private Queue<Long> Buffer;
private int n_queue;
buffer(int s){
    n=s;
    Buffer= new LinkedList<>();
    n_queue=0;
}
public void push(long ele){
    n_queue++;
    Buffer.add(ele);
}
public long pop(){
    long i;
        n_queue--;
        i=Buffer.peek();
        Buffer.remove();
        return i;
    }
public long TheFront(){
    return Buffer.peek();
    }
    public boolean isFull(){
        return n_queue==n;
    }
    public boolean isEmpty(){
        return n_queue==0;
    }
}
