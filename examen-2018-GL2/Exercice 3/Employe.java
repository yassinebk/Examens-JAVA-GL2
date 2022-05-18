import java.io.Serializable;

public class Employe implements Serializable {
    static private int identifiant;
    private int id;
    private String nom;
    private String prenom;
    private String fonction;

    /**
     * @param nom
     * @param prenom
     * @param codeFonction
     * @param fonction
     */
    public Employe(String nom, String prenom, int codeFonction, String fonction) {
        this.id = Employe.identifiant++;
        this.nom = nom;
        this.prenom = prenom;
        this.codeFonction = codeFonction;
        this.fonction = fonction;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    
    @Override
    public String toString() {
        return "Employe [codeFonction=" + codeFonction + ", fonction=" + fonction + ", id=" + id + ", nom=" + nom
                + ", prenom=" + prenom + "]";
    }

    /**
     * @return the identifiant
     */
    public static int getIdentifiant() {
        return identifiant;
    }

    /**
     * @param identifiant the identifiant to set
     */
    public static void setIdentifiant(int identifiant) {
        Employe.identifiant = identifiant;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * @param nom the nom to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * @return the prenom
     */
    public String getPrenom() {
        return prenom;
    }

    /**
     * @param prenom the prenom to set
     */
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    /**
     * @return the codeFonction
     */
    public int getCodeFonction() {
        return codeFonction;
    }

    /**
     * @param codeFonction the codeFonction to set
     * @throws Exception
     */
    public void setCodeFonction(int codeFonction) throws Exception {
        if (codeFonction <= 4 && codeFonction >= 1)
            this.codeFonction = codeFonction;
        else
            throw new Exception("La valeur de code fonction doit etre entre 1 et 4");
    }

    /**
     * @return the fonction
     */
    public String getFonction() {
        return fonction;
    }

    /**
     * @param fonction the fonction to set
     */
    public void setFonction(String fonction) {
        this.fonction = fonction;
    }

    private int codeFonction;

}
