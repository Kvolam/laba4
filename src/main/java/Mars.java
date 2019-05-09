

public class Mars extends Thread {
    @Override
    public void run(){
        Day day = new Day("Mars",2400);
        Year year = new Year("Mars", 2400*60);
        year.start();
        day.start();
    }
}
