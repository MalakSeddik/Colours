
public class TestProgram {
    public static void main(String[] args) {
        GeometricObject[] objects = new GeometricObject[5];
        objects[0] = new Square(5);
        objects[1] = new Square(3, "blue", true);
        objects[2] = new Square(7, "green", false);
        objects[3] = new Square(4);
        objects[4] = new Square(6, "red", true);

        for (int i = 0; i < objects.length; i++) {
            System.out.println("Object " + (i+1) + ":");
            System.out.println("Area: " + objects[i].getArea());
            if (objects[i] instanceof Colorable) {
                ((Colorable) objects[i]).howToColor();
            }
            System.out.println("---------------------------");
        }
    }
}