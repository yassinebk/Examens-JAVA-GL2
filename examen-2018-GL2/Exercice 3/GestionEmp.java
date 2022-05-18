import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Comparator;

public class GestionEmp implements Comparator<Employe> {
    ArrayList<Employe> employes;
    AffichEmp afficheEmp;
    final String file = "emp.txt";

    GestionEmp() {
        this.employes = new ArrayList<>();
        afficheEmp = new AffichEmp();
    }

    public void AjouterEmployes(ArrayList<Employe> employes) {
        employes.addAll(employes);
    }

    public void AjoutEmploye(Employe employe) {
        employes.add(employe);
    }

    public void supprimerEmployes(ArrayList<Employe> employes) {
        employes.removeAll(employes);

    }

    public void SupprimerEmploye(Employe employe) {
        employes.remove(employe);
    }

    public void saveEmployeObj(Employe employe) {
        try {
            FileOutputStream fOutputStream = new FileOutputStream(employe.getNom() + employe.getPrenom() + ".obj");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fOutputStream);
            objectOutputStream.writeObject(employe);
            objectOutputStream.close();
            fOutputStream.close();

        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }

    @Override
    public int compare(Employe arg0, Employe arg1) {
        if (((Employe) arg0).getCodeFonction() > ((Employe) arg1).getCodeFonction())
            return -1;

        else if (((Employe) arg0).getCodeFonction() < ((Employe) arg1).getCodeFonction())
            return -1;
        else
            return 0;
    }

}
