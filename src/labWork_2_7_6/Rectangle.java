package labWork_2_7_6;

/**
 * Created by Bulik on 28.07.2016.
 */
public class Rectangle extends Shape {
    private double width, height;

    public Rectangle(String shapeColor, double width, double height) {
        super(shapeColor);
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", width=" + width +
                ", height=" + height;
    }

    @Override
    public double calcArea() {
        return width * height;
    }
}
