import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class SolarSystemTest {

    @Test
    public void solarSystemTest(){

        SolarSystem solarSystem = new SolarSystem();

        String name = "Earth";
        int circumference = 40075;
        int speed = 1667;
        int weight = 500;


        Planet earth = new Planet(name, circumference, speed, weight);

        String moonName = "earthMoon";
        int moonCircumference = 10921;
        int moonSpeed = 2300;
        long moonWeight = 150;
        String orbitPlanet = "earth";


        Moon earthMoon = new Moon(moonName, moonCircumference,moonSpeed, moonWeight, orbitPlanet);



        solarSystem.addPlanet(earth);
        solarSystem.addMoonToPlanet(earthMoon, earth);


        assertEquals(1, solarSystem.getMoons(earth));



    }

    @Test
    public void planetDistanceTest(){

        SolarSystem solarSystem = new SolarSystem();

        String name = "Earth";
        String nameMars = "Mars";
        String nameJupitor = "Jupitor";
        int circumference = 40075;
        int speed = 1667;
        int weight = 500;
        int earthDistance = 0;
        int marsDistance = 200;
        int jupitorDistance = 500;

        Planet earth = new Planet(name, circumference, speed, weight, earthDistance);
        Planet mars = new Planet(nameMars, circumference, speed, weight, marsDistance);
        Planet jupitor = new Planet(nameJupitor, circumference, speed, weight, jupitorDistance);

        assertEquals(200, solarSystem.distanceCalculator(earth, mars));
        assertEquals(300, solarSystem.distanceCalculator(jupitor, mars));







    }

}
