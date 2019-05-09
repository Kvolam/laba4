import java.util.ArrayList;

class Model {

    private static ArrayList<Planet> listPlanet = new ArrayList<Planet>();

    static void begin() {
        listPlanet.add(new Planet(2400,2400*60,"Марсе"));
        listPlanet.add(new Planet(2400*11,2400*22,"Венере"));
        listPlanet.add( new Planet(2400,2400*36,"Земле"));
        listPlanet.add( new Planet(2400*6,2400*9,"Меркурии"));
        listPlanet.add(new Planet(1000,2400*1000,"Юпитере"));
        listPlanet.add(new Planet(1000,2400*2000,"Сатурне"));
        listPlanet.add( new Planet(1800,2400*10000,"Нептуне"));
        listPlanet.add( new Planet(1900,2400*5000,"Уране"));
        for (Planet planet : listPlanet) {
            planet.start();
        }
    }

    static void end(){
        for(Planet planet: listPlanet){
            planet.end();
        }
    }
}
