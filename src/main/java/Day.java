import org.apache.log4j.Logger;


public class Day extends TimeDelay {
    private long delayDay;
    private static final Logger log = Logger.getLogger(Day.class);

    Day(String nameOfPlanet,long delayDay) {
        super(nameOfPlanet);
        this.delayDay=delayDay;
    }

    @Override
    public void run() {
        do {
            if(Thread.interrupted()) {
                log.info("Новый день на " + this.nameOfPlanet);
            }
            else{
                log.info("Планета остановила врашение вокруг своей оси");
                return;
            }

            try {
                sleep(this.delayDay);

            } catch (InterruptedException e) {
                return;
            }
        }while(true);
    }
}
