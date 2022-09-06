package dayone.shapes;

public class Circle {
    public double radius;



    public Circle(double radius){
        this.radius = radius;
    }
    //Calculate the area of a triangle;
    //PI * R * R
    public Double calculatesArea(){
        return Math.PI * this.radius * this.radius;
    }



}
