package shapes;

public class Square extends Rectangle {
//    private double side;

    public Square(double side){
        super(side, side);
//        this.side = side;
    }

    public double getArea() {
        System.out.println("in Square.getArea()");
        return Math.pow(this.length,2);
    }

    public double getPerimeter() {
        System.out.println("in Square.getPerimeter()");
        return 4 * this.length;
    }
}