public class MainTestResize {
    public static void main(String[] args) {
        double random= Math.random()*100;
        Resizeable[] shape = new Resizeable[3];
        shape[0]= new Circle(3);
        shape[1]= new Rectangle(20,50);
        shape[2]= new Square(10);

        for (Resizeable resultChange: shape
             ) {
            resultChange.resize(random);
            System.out.println(resultChange);
        }
    }
}

