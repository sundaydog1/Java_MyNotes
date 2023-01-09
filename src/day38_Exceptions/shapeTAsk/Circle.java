package day38_Exceptions.shapeTAsk;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if(radius<=0){
            throw new InvalidShapeException("Radius of the circle can't be negative or zero");
        }
        this.radius = radius;
    }
}
