package Exercice_2;

import java.util.ArrayList;

public class Ligne {

    String lettre;
    Terminal depart;
    Terminal arrive;
    ArrayList<Station> stations;
    ArrayList<Transport> moyenTransports;

    public void addTransport(Transport e) throws Exception {
        if (moyenTransports.size() >= 500)
            throw new Exception("Le nombre des stations a atteint la limite 100");
        this.moyenTransports.add(e);

    }

    public void addStation(Station s) throws Exception {
        if (stations.size() >= 100)
            throw new Exception("Le nombre des stations a atteint la limite 100");

        this.stations.add(s);

    }

    public Boolean existeStation(Station s) throws ExceptionStationInexistance {
        if (!stations.contains(s)) {
            throw new ExceptionStationInexistance();
        }
        return true;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */

    @Override
    public String toString() {
        String returnString = "Ligne [arrive=" + arrive + ", depart=" + depart + ", lettre=" + lettre
                + ", moyenTransports=";
        for (Transport x : moyenTransports) {
            returnString += x;
        }

        System.out.println(", stations=");
        for (Station x : stations) {
            returnString += x;
        }

        return returnString + "]";

    }
}
