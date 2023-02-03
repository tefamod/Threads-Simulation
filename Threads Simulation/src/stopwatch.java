public class stopwatch extends Thread{
    public static long t=0;
    private static boolean s = false;
    stopwatch ()
    {
        t=0;
        s=false;
        start();
    }

    @Override
    public void run() {
        while (!s)
        {
            try {
                sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            t++;
            G.SetTime(String.valueOf(t));
        }
    }

    public void stooooop(){
        s=true;
    }
}
