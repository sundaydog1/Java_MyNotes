package day34_Interface.animalTask;

public interface Playable {

    boolean isFriendly=true; // static and final, public is the only
    // accepted access modifier and applied by default
/*
    public static void main(String[] args) {
        System.out.println(isFriendly);
    }

    default void method1(){ // will be treated as instance method in a subclass when inherited

    }
*/
  void play();
  }



