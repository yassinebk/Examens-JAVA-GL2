public class Test {

    public static void main(String[] args) {
        Book l1 = new Book("Java pour les Debutants", "Smith John", 10.40, 50);
        Book l2 = new Book("Systems", "Grimm", 10.40, 254);
        l1.afficher();
        l1.Acheter("moi");
        l1.afficher();
        l1.price = 0.0;
        l2.Acheter("lui");
        l2.afficher();
        BD b1 = new BD("TOM and JERRY", "Morris", 10.40, 35, true);
        BD b2 = new BD("Tintin", "ilerge", 200.40, 45, false);

        b1.Acheter("moi");
        b1.afficher();
        b2.afficher();
        Album a1 = new Album("Dors", "Dors", 3.5, 300);
        a1.afficher();
        a1.Coloriee(23);
        a1.afficher();
        a1.Coloriee(23);

    }

}
