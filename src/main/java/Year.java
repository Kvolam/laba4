import org.apache.log4j.Logger;

public class Year extends TimeDelay {
    private final Logger log = Logger.getLogger(Year.class);
    private long delayYear;

    Year(String nameOfPlanet, long delayYear) {
        super(nameOfPlanet);
        this.delayYear=delayYear;
    }

    @Override
    public void run(){
        do {
            if(!isInterrupted()) {
                log.info("Новый год на " + this.nameOfPlanet);
            }
            else {
                return;
            }
            try {
                sleep(this.delayYear);
            } catch (InterruptedException e) {
                return;
            }
        }while(true);
    }
}
