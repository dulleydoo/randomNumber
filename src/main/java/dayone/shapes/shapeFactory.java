package dayone.shapes;

import org.w3c.dom.ls.LSOutput;

public class shapeFactory {
    public static void main(String[] args) {


        Circle circle1 = new Circle(30.00);
        //invoke or call the method on the object
        System.out.println(circle1.calculatesArea());

        Square square1 = new Square (4.5);
        System.out.println(square1.calculateSquareArea());


    }
}
