public class Planet extends OrbitalObject {


    public Planet(String name, int circumference, int speed, int weight) {
        super(name, circumference, speed, weight);

    }


    //En ekstra constructor så man ikke behøver ændre i alle de forhenværende test
    private int distance;

    public Planet(String name, int circumference, int speed, long weight, int distance) {
        super(name, circumference, speed, weight);
        this.distance = distance;
    }

    public int getDistance() {
        return distance;
    }
}
