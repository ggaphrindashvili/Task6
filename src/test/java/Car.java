public class Car {
    private String model;
    private int year;
    private double price;

    public Car(String model) {
        this(model, 2000, 0);
    }

    public Car(String model, int year, double price) {
        this.model = model;

        if (year < 2000 || year > 2024) {
            System.out.println("Error: Year must be between 2000 and 2024.");
            this.year = 2000;
        } else {
            this.year = year;
        }

        if (price < 0) {
            System.out.println("Error: Price cannot be negative.");
            this.price = 0;
        } else {
            this.price = price;
        }
    }

    @Override
    public String toString() {
        return "Car{" + "model='" + model + "', year=" + year + ", price=" + price + '}';
    }

    public static void main(String[] args) {
        Car car1 = new Car("Toyota");
        Car car2 = new Car("Ford", 2015, 18000);
        System.out.println(car1);
        System.out.println(car2);
    }
}
