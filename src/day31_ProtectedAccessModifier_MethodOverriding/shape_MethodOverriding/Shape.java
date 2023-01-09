package day31_ProtectedAccessModifier_MethodOverriding.shape_MethodOverriding;

public class Shape {

    private String name;

    public Shape(){
        setName(getClass().getSimpleName()); // default constructor that allows us
        // to set the name of the shape with a class name
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

public double area(){
        return 0; // we just set it to default value
}
public double perimeter(){
        return 0;
}
public void draw(){
    System.out.println("Drawing a "+ getClass().getSimpleName()+" : ");
}

    @Override
    public String toString() {
        return "Shape{" +
                "name='" + name + '\'' +
                ", area='" + area() + '\'' +
                ", perimeter='" + perimeter()+ '\'' +
                '}';
    }
}
