package Probleme;

public class TacheElementaire implements ITache {

    String nom;
    int cout;

    TacheElementaire(String nom, int cout) {
        this.nom = nom;
        this.cout = cout;
    }

    @Override
    public String getNom() {
        return this.nom;
    }

    @Override
    public int getCout() {
        // TODO Auto-generated method stub
        return this.cout;
    }

}
