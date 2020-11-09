public class Runner {

    public static void main(String[] args) {
//        Calculator calculator = new Calculator();
//        System.out.println(calculator.add(1, 5));
//        System.out.println(calculator.subtract(5, 1));
//        System.out.println(calculator.multiply(2, 5));
//        System.out.println(calculator.divide(10, 5));
        WaterBottle waterBottle = new WaterBottle(100);
        System.out.println(waterBottle.getVolume());
        System.out.println(waterBottle.drink());
        System.out.println(waterBottle.empty());
        System.out.println(waterBottle.fill());
    }

}

