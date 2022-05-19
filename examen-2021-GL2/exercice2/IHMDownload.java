import java.awt.*;

public class IHMDownload extends Frame {

  final Button downloadBtn;
  final TextField textField;
  final Label label;
  IHMDownload(){
    Content pane = this.getContentPane();
    textField= new TextField();
    textField.setEditable(true);
    downloadBtn= new Button("Download");
    label = new Label("Nom Document")
    Pane pane = new Pane(new FlowLayout());


  }

  public static void main(String[] args) {
    IHMDownload ihmDownload = neww IHMDownload();
    
  }
  
}
