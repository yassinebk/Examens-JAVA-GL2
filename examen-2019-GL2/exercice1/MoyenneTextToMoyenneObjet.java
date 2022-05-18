package exercice1;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.util.ArrayList;

public class MoyenneTextToMoyenneObjet {
    ArrayList<Etudiant> etudiants;
    String inputString;

    /**
     * 
     */

    public void updateFile() {
        try {
            File fo = new File(this.inputString);

            FileWriter fos = new FileWriter(fo);

            float sum = 0;
            for (int i = 0; i < etudiants.size(); i++) {
                Etudiant etudiant = etudiants.get(i);
                sum += etudiant.getMoyenne();
                fos.append(
                        etudiant.nom + " :" + etudiant.prenom + " :" + etudiant.getMoyenne());
                fos.append("\n");
            }
            fos.append("Moyenne Generale " + sum/etudiants.size());
            fos.close();

        } catch (Exception e) {

        }
    }

    public void readFile() {
        try {
            FileInputStream fis = new FileInputStream(this.inputString);

            ArrayList<String> strings = new ArrayList<>();
            int currByte;
            while ((currByte = fis.read()) != -1 &&  currByte != -1) {
                System.out.println("here");
                String currString = new String();
                if (currByte != '\n') {
                    currString += (char) currByte;
                } else if (currByte == '\n')
                    if (!currString.contains("Moyenne Generale"))
                        strings.add(currString);
            }

            strings.forEach((string) -> string.split(":"));
            for (String s : strings) {

                System.out.println("here");
                String[] values = s.split(":");

                try {
                    values[2] = values[2].trim();
                    etudiants.add(new Etudiant(Integer.parseInt(values[2]), values[0], values[1]));
                } catch (Exception e) {

                }
            }
            fis.close();

        } catch (Exception exception) {
            System.out.println("here" + exception);
        }
    }

    public MoyenneTextToMoyenneObjet(String in, ArrayList<Etudiant> etudiants) {
        this.etudiants = etudiants;
        this.inputString = in;

    }

}
