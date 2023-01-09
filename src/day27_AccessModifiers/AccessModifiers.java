package day27_AccessModifiers;

public class AccessModifiers {

    public static int publicDate =200;

    protected static int protectedDate=300;

    static int defaultDate=400;  // default access modifier

    private static int privateData =500;





    public static void main(String[] args) {
        System.out.println(publicDate); // available withing the same class
        System.out.println(protectedDate);//  protected is available within the same class
        System.out.println(defaultDate); // default is accessible withing the same class
        System.out.println(privateData); // private is ONLY accessible within the same class

new AccessModifiers();








    }
}




