package day03_variables;

public class PrimitiveDataTypes_Intro {
    public static void main(String[] args) {

        //DataType VariableName = Data;

      /*
       byte a = "java"; //byte only accepts integer values (-128 -127)
       byte a = 11.5       byte doesnt accept decimals
       */
         byte a = 20;
        System.out.println(a);

        // price of the car $17500
      short p = 17500;
        System.out.println(p);

        // salary is $100000
        int s=100000;
        System.out.println(s);
        System.out.println(p+s);

        /*
                Variable names
           ~Variable name must be unique
           ~ Can use camel case or underscore or $
         */
        int salary_beforeTax$ = 12500;

        // ~Variable name can't start with number
         int Variable1 = 5;


         // ~ Variable name can not be Java reserved word


        int Variable = 5; // for full numbers
        double Variable2 = 4.5; // for decimals
        char Variable3 ='A'; // for single characters, always use ''
        boolean Variable4 = true; // for true/false statement
        String Variable5 ="Tatiana"; // for a string of text , always use ""



    }

}
