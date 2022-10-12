public class Main {

    public static void main(String[] args) {

        Point firstPoint =  new Point();
        Point secondPoint = new Point();
        System.out.print("Enter the coordinates of the first point: ");
        firstPoint.input();
        System.out.print("Enter the coordinates of the second point: ");
        secondPoint.input();

        System.out.print("\nThe coordinates of the first point: ");
        firstPoint.output();
        System.out.print("\nThe coordinates of the second point: ");
        secondPoint.output();
        System.out.printf("\nDistance between them: %f", firstPoint.distance(secondPoint));

        Line line = new Line();
        System.out.print("\nEnter the coordinates of the start and the end of the line: ");
        line.input();

        System.out.print("\nCoordinates of the line");
        line.output();

        Triangle triangle = new Triangle();
        System.out.print("\nEnter the coordinates of the first, the second and the third points: ");
        triangle.input();
        triangle.output();

        Square square = new Square();
        System.out.print("\nEnter the coordinates of the first, the second, the third and the fourth points: ");
        square.input();
        square.output();

        Circle circle = new Circle();
        System.out.print("\nEnter the coordinates of the center and the radius: ");
        circle.input();
        circle.output();
    }

}