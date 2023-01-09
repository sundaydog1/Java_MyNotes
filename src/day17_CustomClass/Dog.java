package day17_CustomClass;

public class Dog {
    // we don't need to create main method in Custom Class

    public String name; // it's an instance variable
    public String breed;
    public char gender;
    public String size;
    public int age;
    public String color;


    public void eat (){
        System.out.println(name+ " is eating");
    }
    public void sleep(){
        System.out.println(name+ " is sleeping");
    }
/*
    public String toString(){ // a method to display Object . any print statement can be passed in this info
        return "Dog Name: "+name;
    }
*/
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", size='" + size + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", color='" + color + '\'' +
                '}';
    }

// this method can help us to set all the information of the dog at once
    public void setInfo(String name,String breed, char gender, int age, String size, String color){
     this.name  = name; // this keyword is used to call the instance variable name
        this.breed = breed;
        this.gender = gender;
        this.age=age;
        this.size = size;
        this.color=color;







    }
}
