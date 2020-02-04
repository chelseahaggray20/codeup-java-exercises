package shapes;

public class Rectangle {
    protected double length;
    protected double width;

    public Rectangle (double length, double width){
       super (length, width);

    }

    public void setLength(double length){
        this.length = length;
    }
    public void setWidth(double width){
        this.width = width;
    }

    public double getArea(){
        return width * length;
    }

    public double getPerimeter(){
        return 2 * length + 2 * width;
    }




}
