import java.lang.Thread;     


public class ThreadDownload extends Thread {
  Download dl ;
  ThreadDownload(Download dl){ 
    this.dl = dl;
  }
  void run(){ 
    dl.download();
  }
  
}
