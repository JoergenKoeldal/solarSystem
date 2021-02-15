import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlanetTest {

    //Så ved Junit det er en test
    @Test
    public void earthTester(){

        //For at sikre mod tastefejl, når samme tal genbruges
       String name = "Earth";
        int circumference = 40075;
        int speed = 1667;
        int weight = 500;

        Planet earth = new Planet(name, circumference, speed, weight);


        assertEquals(circumference, earth.getCircumference());
        assertEquals(speed, earth.getSpeed());
        assertEquals(weight, earth.getWeight());
        assertEquals(name, earth.getName());


    }



}