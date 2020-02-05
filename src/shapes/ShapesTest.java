package shapes;

public class ShapesTest {
    public static void main(String[] args){
        Measurable myShape = new Measurable() {
            @Override
            public double getPerimeter() {
                return 0;
            }

            @Override
            public double getArea() {
                return 0;
            }
        };
        System.out.println(myShape.getPerimeter());
        System.out.println(myShape.getArea());

////        Measurable myShape2 = new Square(double, double);
//        System.out.println(myShape2.getPerimeter());
//        System.out.println(myShape2.getArea());
    }
}