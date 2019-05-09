

public class Year extends TimeDelay {

    private long delayYear;

    public Year(String nameOfPlanet, long delayYear) {
        super(nameOfPlanet);
        this.delayYear=delayYear;
    }

    @Override
    public void run(){
        while (true) {
            try {
                sleep(this.delayYear);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
