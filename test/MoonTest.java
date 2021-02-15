import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MoonTest {

    @Test
    public void moonTest(){

        String name = "earthMoon";
        int circumference = 10921;
        int speed = 2300;
        long weight = 150;
        String orbitPlanet = "earth";


        Moon earthMoon = new Moon(name, circumference,speed, weight, orbitPlanet);

        assertEquals(name, earthMoon.getName());
        assertEquals(circumference, earthMoon.getCircumference());
        assertEquals(speed, earthMoon.getSpeed());
        assertEquals(weight, earthMoon.getWeight());
        assertEquals(orbitPlanet, earthMoon.getOrbitPlanet());



    }
}
