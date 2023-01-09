package day13_CustomMethod;

public class ReturnMethods_Practice {
    public static void main(String[] args) {

        System.out.println(isEven(100));

int num = 200;
if (isOdd(num)){
    System.out.println((num+ " is odd"));
}else{
    System.out.println(num + " is even number");
}

    }

    public static boolean isOdd(int num){

        return  (num%2 !=0)? true:false;
    }
     public static boolean isEven (int num){
        return !isOdd(num);
     }

public static int max (int n1, int n2){
        // return n1>n2?n1:n2;
    if (n1>n2){
        return n1;
    }else{
        return n2;
    }

}

















}
