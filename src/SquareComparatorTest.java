import java.util.Arrays;
import java.util.Comparator;

public class SquareComparatorTest {
    public static void main(String[] args) {
        Square[] mySquares = {new Square(), new Square(15), new Square(5)};
        System.out.println("Pre-sorted");
        for (Square square : mySquares)
            System.out.println(square);
        Comparator squareComparator = new SquareComparator();
        Arrays.sort(mySquares,squareComparator);
        System.out.println("After-sorted");
        for (Square square: mySquares){
            System.out.println(square);
        }



    }
}
