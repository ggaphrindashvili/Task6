package Task4;

class Shape {
    protected String name;

    public Shape(String name) {
        this.name = name;
    }

    public void area() {
        System.out.println("Unknown area");
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double side) {
        this(side, side);  // Constructor for square
    }

    public Rectangle(double length, double width) {
        super("Rectangle");
        this.length = length;
        this.width = width;
    }

    @Override
    public void area() {
        System.out.println("Area: " + (length * width));
    }

    public static void main(String[] args) {
        Rectangle rect = new Rectangle(3.2, 4.2);
        rect.area();

        Rectangle square = new Rectangle(4.0);
        square.area();
    }
}
