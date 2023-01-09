package day27_AccessModifiers;
/*
 Create a class named Circle:

		Attributes:
			radius, diameter, pi

		Add a constructor that can set All the fields (instances)

		Actions:
			calcArea(): returns the area of Circle
			calcPerimeter(): returns the perimeter of Circle
			printPi(): displays PI value
			toString(): displays the radius, diameter, pi, area and perimeter
			 of the circle when the object of circle is passed in the print statement
 */
public class Circle {
    public double radius,diameter;
    public static double pi =3.14;

    public Circle (double radius){
        this.radius = radius;
        diameter = 2*radius;

    }

    public double calcArea(){
        return radius*radius*pi;
    }



}
