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
            if(isInterrupted()) {
               return;
            }
            else if(this.degree==6){
                log.info("Новый день на " + this.nameOfPlanet);
                this.degree=0;
            }
            else this.degree++;
            try {
                sleep(this.delayYear);
            } catch (InterruptedException e) {
                return;
            }
        }while(true);
    }
}
