import org.apache.log4j.Logger;


public class Day extends TimeDelay {
    private long delayDay;
    private final Logger log = Logger.getLogger(Day.class);

    Day(String nameOfPlanet,long delayDay) {
        super(nameOfPlanet);
        this.delayDay=delayDay;
    }

    @Override
    public void run() {
        do {
            if(isInterrupted()) {
                return;
            }
            else{
                log.info("Новый день на " + this.nameOfPlanet);

            }

            try {
                sleep(this.delayDay);

            } catch (InterruptedException e) {
                return;
            }
        }while(true);
    }
}
