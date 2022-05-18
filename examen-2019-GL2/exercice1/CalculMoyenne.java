package exercice1;
import java.util.ArrayList;

class CalculMoyennae {
    public static void main(String[] args) {
        System.out.println(args);
        final String notesFile = args[0];
        final String moyenneFile = args[1];
        for (String arg : args) {
            System.out.println(arg);
        }
        ;
        ArrayList<Etudiant> etudiants = new ArrayList<>();
        // System.out.println(moyenneFile + " " + notesFile);
        NotesTextToNotesObjet ntso = new NotesTextToNotesObjet(notesFile, etudiants);
        ntso.readFile();
        MoyenneTextToMoyenneObjet mtso = new MoyenneTextToMoyenneObjet(moyenneFile, etudiants);

        for (Etudiant etudiant : etudiants) {
            System.out.println("here" + etudiant);
        }
        etudiants.get(0).nom = "NewName";
        ntso.updateFile();
        mtso.updateFile();
        // Collections.sort(etudiants, comparator);
        // ntso.updateFile();
        // mtso.updateFile();

    }

}