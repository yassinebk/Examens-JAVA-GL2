package Probleme;

import java.util.*;
import java.util.Iterator;

public class TacheComplexe implements java.lang.Iterable<ITache>, ITache {

    private Collection<ITache> sousTaches;

    private String nom;

    public TacheComplexe(String nom) {
        this.nom = nom;
        this.sousTaches = new ArrayList<ITache>();
    }

    public void ajouter(ITache tache) {
        this.sousTaches.add(tache);
    }

    public void supprimer(ITache tache) {
        this.sousTaches.remove(tache);
    }

    public String getNom() {
        return this.nom;
    }

    public int getCout() {
        int cout = 0;
        for (ITache tache : sousTaches) {
            cout += tache.getCout();
        }
        return cout;
    }

    @Override
    public Iterator iterator() {
        // TODO Auto-generated method stub
        return sousTaches.iterator();
    }

}
