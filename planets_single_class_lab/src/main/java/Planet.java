import java.math.BigInteger;

public class Planet {

    private String name;
    private int size;

    public Planet(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String explode() {
        return String.format("Boom! % has exploded", this.name);

    }
}

//        mars = Planet("Mars", 908973)
//        print(f"{mars.get_name()} is {mars.get_size()}")
//        mars.explode()
