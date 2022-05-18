class BD extends Book {
    private boolean encouleur;

    public BD(String t, String a, double p, int nb, boolean c) {
        super(t, a, p, nb);
        encouleur = c;
    }

}