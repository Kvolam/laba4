
public class Day extends TimeDelay {
    private long delayDay;

    Day(String nameOfPlanet,long delayDay) {
        super(nameOfPlanet);
        this.delayDay=delayDay;
    }

    @Override
    public void run() {
        while (true) {
            try {
                sleep(this.delayDay);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
