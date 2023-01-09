package day27_AccessModifiers;

public class InstanceInitializationBlock {

    public String name;
    public int age;


    {
        name = "James"; // James will be given by default as  a name to every object
        age = 20; // default age will be 20
    }


    public static void main(String[] args) {

        InstanceInitializationBlock obj1 = new InstanceInitializationBlock();
        InstanceInitializationBlock obj2 = new InstanceInitializationBlock();

        System.out.println(obj1.name);  //James
        System.out.println(obj2.name); //James

    }
}
