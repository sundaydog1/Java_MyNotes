package day22_ArrayList;

public class WrapperClass_Methods {
    public static void main(String[] args) {

        String str ="20";
        System.out.println(str+1); // 201 <== "20"+1

        //parse method : returns primitive type, converts String to values

    Integer num1=    Integer.parseInt(str);  // to convert string to primitive  --- unboxing

        int num = Integer .parseInt(str);

        System.out.println(num=1); //21 <== 20+1

        // valueOf method :returns wrapper class object, converts String to wrapper class values

        Integer num2= Integer.valueOf(str); // converts String to wrapper class value
        System.out.println(num2);

        String str2 = "20.5";
        Double.parseDouble(str2);
        double num3 = Double.parseDouble (str2);// double
      Double num4=  Double.valueOf(str2); // double

        System.out.println("---------------------------------------");

        String v = "true"; // the boolean (true or false) has to be written in lower case in order to be converted to boolean
       boolean r1= Boolean.parseBoolean(v);
        Boolean r2 =Boolean.valueOf(v);

        System.out.println("===========================");

        char ch ='1';
       boolean isDigit= Character.isDigit(ch); // if the character 0~9 ==> true
        System.out.println("isDigit = " + isDigit);

        char ch1 = 'A';
      boolean isLetter=  Character.isLetter(ch1);// can be either lower or upper case
        System.out.println("isLetter = " + isLetter);

        boolean isLowerCase = Character.isLowerCase(ch1);
        boolean isUpperCase = Character.isUpperCase(ch1);
        System.out.println("isUpperCase = " + isUpperCase);
        System.out.println("isLowerCase = " + isLowerCase);

        Character.isLetterOrDigit(ch1); // will return true/false in case character is either a letter or a digit

        boolean isSpecialChar = !Character.isLetterOrDigit(ch1); // to determine if char is a special character
        System.out.println("isSpecialChar = " + isSpecialChar);

        System.out.println("-----------------------------------------");

        String string = "a1b2c3d4e5";
        int sum = 0;

        for (char each : string.toCharArray()){ // we gonna use for Each loop for array that we get from toCharArray method
                           // in this array we gonna check each character and try identify it as digit
            if(Character.isDigit(each)){ // if char is digit

            sum+=   Integer.parseInt(""+each); // we need to convert char to an int. parseInt method accepts string only
                // once it converted to int we can add to sum

            }
        }

        System.out.println("sum = " + sum);



    }












}
