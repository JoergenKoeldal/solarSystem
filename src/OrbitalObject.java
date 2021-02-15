public abstract class OrbitalObject {

    private String name;
    private int circumference;
    private int speed;
    private Long weight;

    public OrbitalObject(String name, int circumference, int speed, long weight) {
        this.name = name;
        this.circumference = circumference;
        this.speed = speed;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }


    public int getCircumference() {
        return circumference;
    }



    public int getSpeed() {
        return speed;
    }


    public Long getWeight() {
        return weight;
    }


}
