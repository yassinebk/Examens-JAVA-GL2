public class Album extends Book {
    boolean page_coloriee[];

    public Album(String t, String a, double p, int nb) {
        super(t, a, p, nb);
        page_coloriee = new boolean[nb];
        int i;
        for (i = 0; i < 100; i++) {
            page_coloriee[i] = false;
        }
    }

    public void Coloriee(int num_page) {
        if (page_coloriee[num_page] == false && !is_new()) {
            page_coloriee[num_page] = true;
        } else {
            System.out.println("Page deja coloriee");
        }
    }

}
