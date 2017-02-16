package labWork_2_7_6;

import java.util.Random;

/**
 * Created by Bulik on 28.07.2016.
 */
public class Main {
    public static void main(String[] args) {
        // lab 2_7_6
        Shape shape = new Shape("RED");
        System.out.println(shape);
        System.out.println("Shape area is: " + shape.calcArea());
        // lab 2_7_7
        shape = new Circle("BLACK", 10.5);
        System.out.println(shape);
        System.out.println("Shape area is: " + shape.calcArea());

        // lab 2_7_8
        shape = new Rectangle("GREEN", 5.5, 2.6);
        System.out.println(shape);
        System.out.println("Shape area is: " + shape.calcArea());

         //lab 2_7_9
        shape = new Triangle("BLUE", 3, 4, 5);
        System.out.println(shape);
        System.out.println("Shape area is: " + shape.calcArea());

        //lab 2_7_10
        System.out.println("-------------------------------------");
        Random random = new Random();
        Shape[] shapes= new Shape[9];
        for(int i=0; i<shapes.length; i++){
            switch (i){
                case 1:case 3:case 5:case 7:case 8:
                    shapes[i] = new Rectangle("GREY",random.nextInt(10),random.nextInt(10));
                    break;
                case 0:case 4:
                    shapes[i] = new Circle("BRAUN", random.nextInt(15));
                    break;
                case 2:
                    shapes[i] = new Triangle("PINK",3, 4, 5 );
                    break;
                case 6:
                    shapes[i] = new Triangle("RED", 6, 6, 6);

            }
        }
        for (Shape elem : shapes){
            System.out.println(elem + ", area is: " + elem.calcArea());
        }
        double sumArea = 0.0;
        for ( Shape shape1 : shapes){
            sumArea+=shape1.calcArea();
        }
        System.out.println("Total area = " + sumArea);

        double suRectArea =0.0,
                sumTriangleArea=0.0,
                sumCircleArea=0.0;
        for (Shape element : shapes){
            if (element instanceof Rectangle){
                suRectArea+=element.calcArea();

            }else if (element instanceof Circle){
                sumCircleArea+=element.calcArea();
            }else if (element instanceof Triangle){
                sumTriangleArea+=element.calcArea();
            }
        }
        System.out.println("Rectangle total area: "+ suRectArea+ "\nCircle total area: "+ sumCircleArea+ "\nTriangle total area: "+ sumTriangleArea);
    }

}
