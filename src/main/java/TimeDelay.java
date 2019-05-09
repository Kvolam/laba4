

class TimeDelay extends Thread {

    int degree;
    String nameOfPlanet;

    TimeDelay(String nameOfPlanet){
       this.nameOfPlanet=nameOfPlanet;
       this.degree=0;
    }

    int getDegree(){
        return degree;
    }
}
