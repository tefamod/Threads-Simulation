import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class G extends JFrame {
    public static WriteToFile fileWriter;
    public static stopwatch s;
    JButton start = new JButton("Start Producer");
    ActionListener startMission = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {



            if (n.getText() != null && buffer.getText() != null && file.getText() != null) {
                try {


                    fileWriter = new WriteToFile(file.getText());
                    Main.s = new semaphore(Integer.parseInt(buffer.getText()));
                    Main.b = new buffer(Integer.parseInt(buffer.getText()));
                    s = new stopwatch();
                    Main.Producer = new producer(Integer.parseInt(n.getText()));
                    Main.Consumer = new consumer();
                } catch (NumberFormatException ex) {
                    ex.printStackTrace();
                }
            }
        }
    };

    JTextField n=new JTextField();
    static JLabel numbers = new JLabel("N");
    JTextField buffer=new JTextField();
    static JLabel bufferLabel = new JLabel("Buffer Size");
    JTextField file=new JTextField();
    static JLabel fileLabel = new JLabel("File Name");

     static JTextField largeVal=new JTextField();
    static JLabel largestLabel = new JLabel("the largest prime number");
    static JTextField elements=new JTextField();
    static JLabel elementsLabel = new JLabel("# of elements (primes number) generated");
    static JTextField timeCounter=new JTextField();
    static JLabel timeLabel = new JLabel("time elapsed since the start of processing");


    public G() {
       JFrame frame=new JFrame();
       Container con=frame.getContentPane();
       GroupLayout lay=new GroupLayout(con);
       con.setLayout(lay);
       start.addActionListener(startMission);
       largeVal.setEditable(false);
       elements.setEditable(false);
       timeCounter.setEditable(false);
        lay.setHorizontalGroup(lay.createSequentialGroup().addGroup(lay.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(n)
                                .addComponent(buffer)
                                .addComponent(file)
                                .addComponent(largestLabel)
                                .addComponent(elementsLabel)
                                .addComponent(timeLabel)
                        )
                        .addGroup(lay.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(start)
                        )
                        .addGroup(lay.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(numbers)
                                .addComponent(bufferLabel)
                                .addComponent(fileLabel)
                                .addComponent(largeVal)
                                .addComponent(elements)
                                .addComponent(timeCounter)
                        )
        );
        lay.setVerticalGroup(
                lay.createSequentialGroup()
                        .addGroup(lay.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(n)
                                .addComponent(numbers)
                        )
                        .addGroup(lay.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(buffer)
                                .addComponent(bufferLabel)
                        )
                        .addGroup(lay.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(file)
                                .addComponent(fileLabel)
                        )
                        .addGroup(lay.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(start)
                        )
                        .addGroup(lay.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(largeVal)
                                .addComponent(largestLabel)
                        )
                        .addGroup(lay.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(elements)
                                .addComponent(elementsLabel)
                        )
                        .addGroup(lay.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(timeCounter)
                                .addComponent(timeLabel)
                        )
        );
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
    public static void Setlargest (String num)
    {
        G.largeVal.setText(num);
    }
    public static void SetCounter (String num)
    {
        G.elements.setText(num);
    }
    public static void SetTime (String num)
    {
        G.timeCounter.setText(num);
    }

    }


