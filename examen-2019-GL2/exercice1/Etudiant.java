package exercice1;
import java.util.ArrayList;

public class Etudiant {
    ArrayList<Integer> notes;
    int moyenne;
    String nom;
    String prenom;

    /**
     * @param notes
     * @param nom
     */
    public Etudiant(ArrayList<Integer> notes, String nom, String prenom) {
        this.notes = notes;
        this.nom = nom;
        this.prenom = prenom;
    }

    public Etudiant(int moyenne, String nom, String prenom) {
        this.moyenne = moyenne;
        this.nom = nom;
        this.prenom = prenom;
    }

    public Etudiant() {

    }

    public float getMoyenne() {
        if (notes.size() == 0)
            return 0;
        float sum = 0;
        for (Integer note : notes) {
            sum += note;

        }
        return sum / notes.size();
    }

    @Override
    public String toString() {

        String returnString = this.nom + " :" + this.prenom;
        for (int note : notes) {
            returnString += " :" + note;
        }
        return returnString;
    }

}
