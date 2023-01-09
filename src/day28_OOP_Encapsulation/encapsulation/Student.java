package day28_OOP_Encapsulation.encapsulation;

public class Student {

    private int age;
private String name;

    public String getName() {
        if(name==null) { // if check if the object exists. by ==null, we say it doesn't exist
            System.err.println("Name has not been set");
            System.exit(1);
        }
        return name;
    }

    public void setName(String name) {
boolean hasDigit = false;  // a name is not supposed to have any digits in it
for(char each: name.toCharArray()){
    if(Character.isDigit(each)){
        hasDigit = true;
        break; // will exit the loop as soon as a digit will be found
    }
}
        if(hasDigit){ // if a digit occurs in the name , the error message will be displayed
            System.err.println("Invalid name : "+name);
            System.exit(1); // and the program will be terminated, so the name won't be set
        }
        this.name = name;
    }

    public int getAge(){ // only reads and returns the private data

        if(age==0){
            System.err.println("Age has not been set");
            System.exit(1);
        }

        return age;
    }

    public void setAge( int age){ // only Modifies the private data

        if(age<1|| age>100){ // if the age is invalid
            System.err.println("Invalid age");
            // return; // exiting the method
            System.exit(1); // terminates the entire program when the condition is true
        }


        this.age =age;
    }


}
