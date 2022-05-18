class Book {
    protected String title, author, proprietaire;
    protected int nb_page;
    double price;

    public Book(String t, String a, double p, int nb) {
        title = t;
        author = a;
        price = p;
        proprietaire = "";
        nb_page = nb;
    }

    public void afficher() {
        System.out.println("Title :" + title);
        System.out.println("Author :" + author);
        System.out.println("Price:" + price);
        System.out.println("Nombre of pages:" + nb_page);
        if (this.is_new()) {
            System.out.println("Aucune proprietaire");
        } else {
            System.out.println("Proprietaire" + proprietaire);
        }
        System.out.println();
    }

    public boolean is_new() {
        if (this.proprietaire == "")
            return true;
        else
            return false;
    }

    public void Acheter(String nom) {
        proprietaire = nom;
    }

}