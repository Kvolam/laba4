

public class Venus extends Thread {
    @Override
    public void run(){
        Day day = new Day("Venus",2400*30);
        Year year = new Year("Venus", 2400*50);
        year.start();
        day.start();
    }
}
