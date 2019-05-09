


public class Earth extends  Thread{
    @Override
    public void run(){
        Day day = new Day("Earth",2400);
        Year year = new Year("Earth", 2400*36);
        year.start();
        day.start();
    }
}
