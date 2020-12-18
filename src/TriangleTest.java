public class TriangleTest {
    public static void main(String[] args) {
        Shape myTriangle = new Triangle(50, 50, 90);
        System.out.println(myTriangle.toString());
        Triangle myTriangle2 = new Triangle();
        System.out.println(myTriangle2.toString());
        myTriangle2.setSide1(10);
        myTriangle2.setSide2(15);
        myTriangle2.setSide3(15);
        System.out.println(myTriangle2.toString());


    }
}
