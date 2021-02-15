public class Moon extends OrbitalObject {

    private String orbitPlanet;

    public Moon(String name, int circumference, int speed, long weight, String orbitPlanet) {
        super(name, circumference, speed, weight);
        this.orbitPlanet = orbitPlanet;
    }

    public String getOrbitPlanet() {
        return orbitPlanet;
    }


}
