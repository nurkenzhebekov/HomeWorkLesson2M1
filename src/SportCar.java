public class SportCar extends Car{

    private int maxSpeed;
    private double engineCapacity;

    public SportCar(int year, CarModel carModel, CarColor carColor, int maxSpeed, double engineCapacity) {
        super(year, carModel, carColor);
        this.maxSpeed = maxSpeed;
        this.engineCapacity = engineCapacity;
    }

    public void drive() {
        System.out.println("Sport car driving down the road");
    }

    public final void drive(String owner) {
        System.out.println(owner + "'s sport car driving down the road");
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    @Override
    public String getInfo() {
        return super.getInfo() +
                "\nMax Speed: " + maxSpeed +
                "\nEngine Capacity: " + engineCapacity;
    }
}
