public class semaphore {
    private int size;
    private boolean c_on;
    public int val;
    semaphore(int s){
        size=s;
        val=s;

    }
    public synchronized void produce() throws InterruptedException {
        c_on=false;
        val--;
        System.out.println("value = " + val);
        if(val<0){
            c_on=true;
            notify();
            wait();
            System.out.println("value = " + val);
        }

    }
    public synchronized void consume() throws InterruptedException {
        if(!c_on)
            wait();
        c_on=true;
        val++;
        System.out.println("value = " + val);
        if(val==size-1&&!Main.Producer.Finshed()){
            c_on=false;
            notify();
            wait();
        }
    }

    public synchronized void weckup ()
    {
        c_on=true;
        notify();
    }

}
