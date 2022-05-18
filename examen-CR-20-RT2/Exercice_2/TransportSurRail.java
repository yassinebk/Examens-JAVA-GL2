package Exercice_2;

public abstract class TransportSurRail extends Transport {

    /**
     * 
     */
    public TransportSurRail(int numero) {
        super(numero);
    }

    @Override
    public String toString() {
        return "TransportSurRail" + getNumero() + "\n";
    }

}
