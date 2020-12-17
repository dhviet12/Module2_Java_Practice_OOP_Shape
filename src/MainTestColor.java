public class MainTestColor {
    public static void main(String[] args) {
        Shape[] shapes =new Shape[4];
        shapes[0]=new Square(10);
        shapes[1]=new Square(20);
        shapes[2]=new Rectangle(40,60);
        shapes[3]=new Rectangle(22,50);
        for (Shape shape:shapes
        ) {
            System.out.println(shape.toString());
            if (shape instanceof Colorable){
                ((Colorable) shape).howtoColor();
            }
        }
    }
}
