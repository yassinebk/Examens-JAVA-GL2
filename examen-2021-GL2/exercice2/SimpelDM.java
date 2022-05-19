public class SimpelDM implements DownloadManager {

  synchronized public void submit(Download dl) {
    DownloadThread dthread = new DownloadThread(dl);
  }

}
