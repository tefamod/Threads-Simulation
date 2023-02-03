import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException;  // Import the IOException class to handle errors
public class WriteToFile {
    private FileWriter file_writer;
    private int c=0;
    WriteToFile (String name)
    {
        String s = "D:\\os_ass1\\OS_ASS1\\" + name;
        try {
            file_writer = new FileWriter(s);
            System.out.println("Successfully creation writer.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    public void Write (String target)
    {
        try {
            file_writer.write(target + " ");
            System.out.println("Successfully wrote " + target +" to the file");
            G.Setlargest(target);
            c++;
            G.SetCounter(String.valueOf(c));
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    public void Close ()
    {
        try {
            file_writer.close();
            System.out.println("Successfully close file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

}
