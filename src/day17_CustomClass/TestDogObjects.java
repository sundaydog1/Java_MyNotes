package day17_CustomClass;

public class TestDogObjects {
    public static void main(String[] args) {

       Dog dog1 =new Dog();

       dog1.name="Max";
       dog1.breed="Husky";
       dog1.gender='M';
       dog1.age=4;
       dog1.size="Large";
       dog1.color="Gray";

       dog1.eat();
        System.out.println(dog1); // it will run but will give a hashcode, as toString Method in the class is missing
        // toString Method is needed when we want to display an object




Dog dog2 = new Dog();
dog2.name = "Loki";
dog2.breed = "poodle";
dog2.color = "peach";
dog2.size = "small";
dog2.gender = 'M';
dog2.age = 1;
        System.out.println(dog1);
        System.out.println(dog2);


        Dog dog3 = new Dog();
        dog3.setInfo("Jesse","Schnauzer",'F',8,"small","black and silver");
        System.out.println(dog3);


        Dog dog4 = new Dog();
        dog4.setInfo("Mia","sherpei",'F',8,"medium","blue");
        System.out.println(dog4);

        dog3.eat(); // only Jesse is eating, no other objects
dog2.sleep(); // only Loki is sleeping, no other dogs
    }










}
