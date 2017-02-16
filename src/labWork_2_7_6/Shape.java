package labWork_2_7_6;

/**
 * Created by Bulik on 28.07.2016.
 */
public class Shape {
    private String shapeColor;

    public Shape(String shapeColor) {
        this.shapeColor = shapeColor;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+", color is :" + shapeColor ;
    }
    public double calcArea(){
        return 0.0;
    }

}
