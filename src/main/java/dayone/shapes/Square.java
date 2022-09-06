package dayone.shapes;

public class Square {
    public double side;


    public Square(double side){
        this.side = side;
    }

    public double calculateSquareArea(){
        //return this.side * this.side;
        return Math.pow(this.side, 2);
    }


}
