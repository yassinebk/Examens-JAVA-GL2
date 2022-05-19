
public class Download {
  String nomDocument;

  Download(String nomDocument) {
    this.nomDocument = nomDocument;
  }

  public void download() {
    try {
      Thread.sleep((long) (10000 * Math.random()));
    } catch (InterruptedException e) {
      System.out.println("Telechargement Interrompu");
      e.printStackTrace();
    }
  }
}
