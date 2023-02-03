public class producer extends Thread{
    private int N;
    private check c;
    private boolean ifFinsh;
    producer(int s){
        N=s;
        ifFinsh=false;
        start();
    }

    @Override
    public void run() {
        for(int i=0;i<=N;i++){
            c = new  check(i);
            if(c.check_res)
            {
                try {
                    Main.s.produce();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                Main.b.push(i);
                System.out.println("push" + i);

            }
        }
        G.s.stooooop();
        ifFinsh=true;
        Main.s.weckup();
    }
    public boolean Finshed(){
        return ifFinsh;
    }
}

