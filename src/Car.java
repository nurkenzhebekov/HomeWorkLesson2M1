public class Car {

    private int year;
    private CarModel carModel;
    private CarColor carColor;

    public Car(int year, CarModel carModel, CarColor carColor) {
        this.year = year;
        this.carModel = carModel;
        this.carColor = carColor;
    }

    public int getYear() {
        return year;
    }

    public CarModel getCarModel() {
        return carModel;
    }

    public CarColor getCarColor() {
        return carColor;
    }

    public String getInfo() {
        return "Car Model: " + carModel.getCarModel() +
                "\nCar Type: " + carModel.getCarType() +
                "\nCar Color: " + carColor +
                "\nYear: " + year;
    }
}
