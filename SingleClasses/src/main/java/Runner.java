public class Runner {

    public static void main(String[] args) {
        Bear bear = new Bear("Baloo");
//        String name = bear.getName();
//        System.out.println(name);
//        bear.setName("Baloo");
        System.out.println(bear.getName());
        bear.setName("Baloo");
        System.out.println(bear.getName());
    }
}
