package exercice1;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.util.ArrayList;

import javax.management.ValueExp;

public class NotesTextToNotesObjet {
    ArrayList<Etudiant> etudiants;
    String inputString;

    public void readFile() {
        try {
            FileInputStream fis = new FileInputStream(this.inputString);

            ArrayList<String> strings = new ArrayList<>();
            while (fis.available() != 0) {
                String currString = new String();
                int currByte;
                while ((currByte = fis.read()) != '\n' && currByte != -1) {
                    currString += (char) currByte;

                }
                strings.add(currString);

            }

            strings.forEach((string) -> string.split(":"));
            for (String s : strings) {
                String[] values = s.split(":");
                // System.out.println(values.length);

                ArrayList<Integer> notes = new ArrayList<>();
                for (String value : values) {
                    System.out.println(value);
                }
                for (int i = 2; i < values.length; i++) {
                    try {
                        notes.add(Integer.parseInt(values[i].trim()));
                    } catch (Exception e) {
                    }
                }
                Boolean flag = false;
                for (Etudiant etudiant : etudiants) {
                    if (etudiant.nom == values[0] && etudiant.prenom == values[1]) {
                        etudiant.notes = notes;
                        flag = true;
                    }
                }
                if (!flag) {
                    etudiants.add(new Etudiant(notes, values[0], values[1]));
                }
            }
            fis.close();

        } catch (Exception exception) {
            exception.printStackTrace();
            System.out.println("here" + exception);
        }
    }

    public void updateFile() {
        try {
            File fo = new File(this.inputString);

            FileWriter fos = new FileWriter(fo);
            for (int i = 0; i < etudiants.size(); i++) {
                fos.append(etudiants.get(i).toString());
                if (i != etudiants.size() - 1) {
                    fos.append("\n");
                }
            }
            fos.close();

        } catch (Exception e) {

        }

    }

    /**
     * 
     */
    public NotesTextToNotesObjet(String in, ArrayList<Etudiant> etudiants) {

        this.etudiants = etudiants;
        this.inputString = in;

    }

}
