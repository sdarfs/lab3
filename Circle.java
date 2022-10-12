import java.util.Scanner;

public class Circle {
    private Point center;
    private float radius;

    public float getRadius() {
        return radius;
    }
    
    public boolean init(Point center, float radius){
        if (center == null && radius <= 0) return false;

        this.center = center;
        this.radius = radius;

        return  true;
    }

    public boolean input(){
        Scanner scanner = new Scanner(System.in);
        Point center = new Point();
        float radius;
        if (center.input() && scanner.hasNextFloat()) 
            return this.init(center, scanner.nextFloat());

        return false;
    }

    public void output(){
        System.out.printf("\n\nRadius = %f", this.getRadius());
        System.out.printf("\nArea = %f", this.area());
    }


    public float area(){
        return (float) (this.radius * this.radius * 3.1415926535);
    }

}