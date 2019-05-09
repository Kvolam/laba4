


public class Planet extends  Thread{

    private Day day;
    private Year year;

    Planet(long delayDay,long delayYear,String nameOfPlanet){
        this.day = new Day(nameOfPlanet,delayDay);
        this.year = new Year(nameOfPlanet, delayYear);
    }

    @Override
    public void run(){
        year.start();
        day.start();
    }

    void end() {
       year.interrupt();
       day.interrupt();
    }
}
