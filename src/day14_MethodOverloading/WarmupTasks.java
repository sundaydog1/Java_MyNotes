package day14_MethodOverloading;

public class WarmupTasks {
    public static String combine (String str1, String str2){
        String result;

        if (str1.endsWith(""+str2.charAt(0))) {
            result = str1 + str2.substring(1);
        }else{
            result= str1+str2;
        }


        return result;
    }

    // 2nd variant

    public static String combine2 (String str1, String str2 ){
        String result;

        if (str1.charAt(str1.length()-1) == str2.charAt(0)){
            result = str1+str2.substring(1);
        }else{
            result = str1+str2;
        }
        return result;


    }

    public static void main(String[] args) {
     String str3 =    combine("Banana","Apple");
        System.out.println(str3);



    }



    public static int sumOf2IntegerNumbers(int n1, int n2){
        return n1+n2;
    }

public static int sumOf3IntegerNumbers (int n1 , int n2, int n3){
     //   return n1+n2+n3;
    return sumOf2IntegerNumbers(n1,n2)+n3;
}
public static int sumOf4IntegerNumbers (int n1, int n2, int n3, int n4){
     //   return sumOf3IntegerNumbers(n1,n2,n3)+n4;  // these are all valid ways to write this method
  //  return sumOf2IntegerNumbers(n1,n2)+sumOf2IntegerNumbers(n3,n4);
    return sumOf2IntegerNumbers(sumOf3IntegerNumbers(n1,n2,n3),n4);

}

}
