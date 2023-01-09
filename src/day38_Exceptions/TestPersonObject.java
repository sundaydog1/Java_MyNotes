package day38_Exceptions;

public class TestPersonObject {
    public static void main (String [] args){
        Person person1 = new Person ("Daniel",32,'K');
        System.out.println(person1);

        try {
            person1.setAge(-25);
        }catch(RuntimeException e){
           e.printStackTrace();
        }
        System.out.println(person1); // after we handle the exception in try/catch block,
        // the wrong data won't be assigned to the age of person1
    }
}
