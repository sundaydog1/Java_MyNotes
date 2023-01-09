package day36_ReferenceTypeCasting;

public class Circle {
    private double radius;
    private final static double PI=3.14;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double area(){
        return radius*radius*PI;
    }
    public double perimeter(){
        return 2*radius*PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", area=" + area() +
                ", perimeter=" + perimeter() +
                '}';
    }


   @Override
    public boolean equals(Object obj) {

        if(!(obj instanceof Circle)){ // if the specified is not circle, then we should not compare
            System.err.println("Invalid Object");
            System.exit(1);
        }
        if(radius==((Circle)obj).radius){ // if the current circle's radius is equal to givern circle's radius
            return true;// then two circles are equal
        }
        return false; // otherwise return false
    }


}
