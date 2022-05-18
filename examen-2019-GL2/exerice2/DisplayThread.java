package exerice2;

public class DisplayThread implements Runnable {

    int i = 0;

    public void displayMsg() {
        System.out.println("Hello there " + i + " hashcode : " + this.hashCode());
    }

    public void run() {
        for (i = 0; i < 10; i++)
            displayMsg();
    }

}
