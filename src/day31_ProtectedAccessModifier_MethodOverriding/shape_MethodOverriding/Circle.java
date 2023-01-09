package day31_ProtectedAccessModifier_MethodOverriding.shape_MethodOverriding;

public class Circle extends Shape {
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    //constructor
    public Circle(double radius) {
        setRadius(radius);
    }

    @Override
    public double area() {
        return radius*radius*3.14;
    }

    @Override
    public double perimeter() {
        return 2*radius*3.14;
    }

    @Override
    public void draw() {
        super.draw();
    }
    @Override
    public String toString() {
        return getClass().getSimpleName()+   "{" +
                "name='" + getName() + '\'' +
                ", radius='" + radius + '\'' +
                ", area='" + area() + '\'' +
                ", perimeter='" + perimeter()+ '\'' +
                '}';
    }






    }
