public class Runner {

    public static void main(String[] args) {
        Planet planet = new Planet("Mars", 908973);
//        System.out.println(planet.getName());
//        System.out.println(planet.getSize());
        System.out.println(String.format("%s is %d", planet.getName(), planet.getSize()));
    }
}

//        mars = Planet("Mars", 908973)
//        print(f"{mars.get_name()} is {mars.get_size()}")
//        mars.explode()
