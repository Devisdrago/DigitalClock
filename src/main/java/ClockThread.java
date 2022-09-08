import java.util.Date;

public class ClockThread extends Thread{

    DigitalClock digitalClock ;


    public ClockThread(DigitalClock digitalClock){
        this.digitalClock =digitalClock;
        start();
    }

    public void run(){
        while(true){
            digitalClock.jLabelClock.setText(String.valueOf(new Date()));
        }
    }

}
