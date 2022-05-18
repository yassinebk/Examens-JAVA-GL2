package Exercice_2;

public class Station {

    private int x, y;
    private String nom;
    private int numero;

    /**
     * @param x
     * @param y
     * @param nom
     * @param numero
     */
    public Station(int x, int y, String nom, int numero) {
        this.x = x;
        this.y = y;
        this.nom = nom;
        this.numero = numero;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */

    @Override
    public String toString() {
        return "Station [nom=" + nom + ", numero=" + numero + ", x=" + x + ", y=" + y + "]";
    }

    /**
     * @return the x
     */
    public int getX() {
        return x;
    }

    /**
     * @param x the x to set
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * @return the y
     */
    public int getY() {
        return y;
    }

    /**
     * @param y the y to set
     */
    public void setY(int y) {
        this.y = y;
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
     * @return the numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

}
