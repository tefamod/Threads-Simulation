public class consumer extends  Thread {
    consumer (){
        start();
    }
    @Override
    public void run() {
        while (!Main.Producer.Finshed()) {

            while (Main.b.isFull())
            {
                while(!Main.b.isEmpty()){
                    G.fileWriter.Write(String.valueOf(Main.b.pop()));
                    try {
                        Main.s.consume();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
        while(!Main.b.isEmpty()){
            System.out.println("you are in comsume 3");
            G.fileWriter.Write(String.valueOf(Main.b.pop()));
            try {
                Main.s.consume();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        G.fileWriter.Close();
    }
}