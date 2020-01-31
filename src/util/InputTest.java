package util;

public class InputTest {
    public static void main(String[] args) {
        Input input = new Input();
        input.getDouble(77, 77.7);
        System.out.println(input.yesNo());
    }
}
