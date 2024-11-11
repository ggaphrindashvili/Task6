public class Car {
    private String model;
    private int year;
    private double price;

    public Car(String model, int year, double price) {
        if (year < 2000 || year > 2024) {
            System.out.println("Year should be between 2000 and 2024.");
            this.year = 2000;
        } else {
            this.year = year;
        }

        if (price < 0) {
            System.out.println("Price cannot be negative.");
            this.price = 0;
        } else {
            this.price = price;
        }

        this.model = model;
    }

    @Override
    public String toString() {
        return "Car{" + "model='" + model + "', year=" + year + ", price=" + price + '}';
    }

    public static void main(String[] args) {
        Car car1 = new Car("Honda", 2022, 19000);
        Car car2 = new Car("Ford", 2025, -5000);
        System.out.println(car1);
        System.out.println(car2);
    }
}