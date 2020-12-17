public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle); // width 1 length 1
        /// resize
        rectangle.resize(5);
        System.out.println(rectangle);
    }
}
