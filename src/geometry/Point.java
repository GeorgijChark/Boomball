package geometry;

public class Point {
    public double x,y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void sum(Vector vector){
        x+=vector.x;
        y+=vector.y;
    }
}
