package physics;

import geometry.Point;
import geometry.Shape;
import geometry.Vector;

import java.util.ArrayList;

public class PhysicalObject {
    protected Point position;
    protected double mass;
    protected Vector speed, acceleration;
    protected ArrayList<Force> forces;
    protected Force summaryForce;
    protected Shape form;
    protected Point center;
    protected double rotation;
    protected double rotationSpeed;

    public PhysicalObject(double mass, Shape form, Point center) {
        this.mass = mass;
        this.form = form;
        this.center = center;
    }

    public PhysicalObject(double mass) {
        this.mass = mass;
    }

    public void tick(double seconds){
        summaryForce=Vector.sum(forces);
        speed.sum(acceleration.getMulted(seconds));
        position.sum(speed.getMulted(seconds));


    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public Vector getSpeed() {
        return speed;
    }

    public void setSpeed(Vector speed) {
        this.speed = speed;
    }

    public Vector getAcceleration() {
        return acceleration;
    }

    public void setAcceleration(Vector acceleration) {
        this.acceleration = acceleration;
    }

    public Shape getForm() {
        return form;
    }

    public void setForm(Shape form) {
        this.form = form;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public double getRotation() {
        return rotation;
    }

    public void setRotation(double rotation) {
        this.rotation = rotation;
    }

    public double getRotationSpeed() {
        return rotationSpeed;
    }

    public void setRotationSpeed(double rotationSpeed) {
        this.rotationSpeed = rotationSpeed;
    }





}
