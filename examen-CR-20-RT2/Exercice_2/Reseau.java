package Exercice_2;

import java.util.ArrayList;

public class Reseau {
    ArrayList<Ligne> lignes;
    ArrayList<Transport> transportCommuns;

    /**
     * 
     */
    public Reseau() {
    }

    public void addLigne(Ligne l) {
        lignes.add(l);
    }

}
