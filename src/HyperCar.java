public final class HyperCar extends SportCar{

    private int horsePower;

    public HyperCar(int year, CarModel carModel, CarColor carColor, int maxSpeed,
                    double engineCapacity, int horsePower) {
        super(year, carModel, carColor, maxSpeed, engineCapacity);
        this.horsePower = horsePower;
    }

    @Override
    public void drive() {
        System.out.println("Hyper car driving down the road");
    }

    public int getHorsePower() {
        return horsePower;
    }

    @Override
    public String getInfo() {
        return super.getInfo() +
                "\nHorse Power: " + horsePower;
    }
}
