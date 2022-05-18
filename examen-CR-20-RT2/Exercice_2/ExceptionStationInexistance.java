package Exercice_2;

public class ExceptionStationInexistance extends Exception {
    ExceptionStationInexistance() {
        super("La station n'est pas sur cette ligne");
        System.out.println("La station n'est pas sur cette ligne");
    }

}
