package day31_ProtectedAccessModifier_MethodOverriding.animal_methodOverriding;

public class Cat extends Animal{

    public Cat(String name, String breed, char gender, int age, String size, String color, boolean isNiceCat) {
        super(name, breed, gender, age, size, color);
      setNiceCat(isNiceCat);
    }

    private boolean isNiceCat;

    public boolean isNiceCat() {
        return isNiceCat;
    }

    public void setNiceCat(boolean niceCat) {
        isNiceCat = niceCat;
    }

    @Override
    public void eat(){
        System.out.println("Cat "+ getName()+" is eating cat food");
    }

    @Override
    public void sleep() {
        System.out.println("Cat sleeps 12 hours a day");

    }

    public void scratch(){
        System.out.println("Cat "+ getName()+" is scratching");
    }

    @Override
    public String toString() {
        return super.toString().replace("}","")+
                ", NIce cat='"+isNiceCat+'\''+
                '}';

    }
}
