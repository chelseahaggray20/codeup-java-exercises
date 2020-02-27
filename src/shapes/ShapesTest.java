package shapes;

public class ShapesTest {
    public static void main(String[] args){
        Rectangle box1 = new Rectangle(5,4);
        System.out.println(box1.getPerimeter());
        System.out.println(box1.getArea());

//        Rectangle box2 = new Square(5);
//        System.out.println(box2.getPerimeter());
//        System.out.println(box2.getArea());

        Measurable myShape;

        myShape = new Square(6.3);
        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());
//        myShape.getLength();
        System.out.println(myShape instanceof Square);
        System.out.println(myShape instanceof Measurable);

        myShape = new Rectangle(3.3, 5.5);
        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());
//        myShape.getLength();
        System.out.println(myShape instanceof Square);
    }
}
