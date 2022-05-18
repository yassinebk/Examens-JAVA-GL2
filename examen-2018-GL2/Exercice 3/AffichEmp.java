import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

/**
 * AffichEmp
 */
public class AffichEmp {

    public ArrayList<Employe> readFile(String inputFile) {
        ArrayList<Employe> aEmployes = new ArrayList<>();
        try {
            File file = new File(inputFile);
            FileReader fileReader = new FileReader(file);

            int currByte = 0;
            String currString = "";
            ArrayList<String> strings = new ArrayList<>();
            while ((currByte = fileReader.read()) != -1) {
                if (currByte != '\n') {
                    strings.add(currString);
                    currString = "";
                }
            }
            fileReader.close();

            for (int i = 0; i < strings.size(); i++) {
                String s = strings.get(i);
                String[] values = s.split(":");

                try {
                    Employe employe = new Employe(values[0], values[1], Integer.parseInt(values[2]), values[3]);
                    System.out.println(employe);
                    aEmployes.add(employe);
                } catch (Exception exception) {
                    exception.printStackTrace();
                }

            }

        } catch (Exception e) {

        }

        return aEmployes;

    }

}