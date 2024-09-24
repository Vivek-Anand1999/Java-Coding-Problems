package DataStructureAlo;

//! parent / super class
class Shape {

    public int length;
    public int width;

    public Shape(int length, int width) {
        setLength(length);
        setWidth(width);
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public int area() {
        return length * width;
    }

    public int perimeter() {
        return 2 * (length + width);
    }
}

// ! child / subClass
class Recatngel extends Shape {

    public int height;
    // length width

    public Recatngel(int length, int width, int height) {
        super(length, width);
        setHeight(height);
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public int dimension() {
        return length * width * height;
    }

}

class CoffeMachine {
    private static CoffeMachine coffeMachine = null;
    // private static CoffeMachine coffeMachine = new CoffeMachine();

    private CoffeMachine() {

    }

    public CoffeMachine getInstance() {
        if (coffeMachine == null) {
            return coffeMachine = new CoffeMachine();
        }
        return coffeMachine;
    }

}

// ! Main class
public class FifthDay {
    public static void main(String[] args) {
        Recatngel rectangele = new Recatngel(2, 8, 2);

        System.out.println("length = " + " " + rectangele.getLength());
        System.out.println("width = " + " " + rectangele.getWidth());
        System.out.println("Height = " + " " + rectangele.getHeight());
        System.out.println("Area = " + " " + rectangele.area());

        Shape shape = new Shape(8, 8);
        System.out.println("Area = " + " " + shape.area());

    }
}
