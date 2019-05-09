import org.apache.log4j.Logger;

public class Year extends TimeDelay {
    private static final Logger log = Logger.getLogger(Year.class);
    private long delayYear;

    Year(String nameOfPlanet, long delayYear) {
        super(nameOfPlanet);
        this.delayYear=delayYear;
    }

    @Override
    public void run(){
        do {
            if(Thread.interrupted()) {
                log.info("Новый год на " + this.nameOfPlanet);
            }
            else {
                log.info("Планета остановила своё врашение вокруг солнца");
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
