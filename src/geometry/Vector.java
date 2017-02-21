package geometry;

import java.util.ArrayList;

public class Vector {
    public double x,y;

    public Vector(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Vector() {
        x=0;
        y=0;
    }

    public void sum(Vector v){
        x+=v.x;
        y+=v.y;
    }
    public Vector getMulted(double d){
        return new Vector(x*d,y*d);
    }

    public static Vector sum(ArrayList<Vector> summands){
        Vector s = new Vector();
        for (Vector summand : summands) {
            s.sum(summand);
        }
        return s;
    }
}
