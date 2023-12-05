public class Main {
    public static void main(String[] args) {

        CarModel carModel = new CarModel("Nissan GT-R", "Sport Car");
        CarModel carModel1 = new CarModel("Bugatti Veyron", "Hyper Car");
        CarModel carModel2 = new CarModel("Pagani Zonda", "Hyper Car");

        SportCar sportCar = new SportCar(2007, carModel, CarColor.WHITE, 311, 3.8);
        System.out.println(sportCar.getInfo());
        sportCar.drive();
        sportCar.drive("Nurlan");

        HyperCar hyperCar = new HyperCar(2005, carModel1, CarColor.BLUE, 431,
                8.0, 1500);
        System.out.println(hyperCar.getInfo());
        hyperCar.drive();

        HyperCar hyperCar1 = new HyperCar(2009, carModel2, CarColor.BLACK, 355,
                5.9, 750);
        System.out.println(hyperCar1.getInfo());
        hyperCar1.drive();

    }
}