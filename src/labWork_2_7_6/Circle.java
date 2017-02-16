package labWork_2_7_6;

/**
 * Created by Bulik on 28.07.2016.
 */
public class Circle extends Shape {
    private double radius;

    public Circle(String shapeColor, double radius) {
        super(shapeColor);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return super.toString() +", radius =" + radius;
    }

    @Override
    public double calcArea() {
        return Math.PI* radius* radius;
    }
}
