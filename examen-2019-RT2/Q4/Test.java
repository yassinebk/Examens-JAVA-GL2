package Q4;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Test
 */
public class Test implements java.io.Serializable {

    public static void main(String[] args) {
        CardPlayer c1 = new CardPlayer();
        try {
            FileOutputStream fos = new FileOutputStream("play.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(c1);
            oos.close();
            FileInputStream fis = new FileInputStream("play.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            CardPlayer c2 = (CardPlayer) ois.readObject();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}