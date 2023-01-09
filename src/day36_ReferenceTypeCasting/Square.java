package day36_ReferenceTypeCasting;

public class Square {
    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }


    public Square(double side) {
       setSide(side);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Square)){
            System.err.println("Invalid object");
            System.exit(1);
        }
        if( side==((Square)obj).side){
    return true;
        }
        return false;
    }
}
