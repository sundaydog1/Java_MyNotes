package day15_Loops;

public class ContinueStatement {
    public static void main(String[] args) {

        for(int i =1; i<6; i++){
           if (i==4){ // when i will be 4, it will get skipped amd jump to 5
               continue; // won't print 4
           }

            System.out.println(i);
        }

        System.out.println("--------------------------------------");

        for (int i =10;i<21; i++) {
            System.out.println(i);
            if (i % 2 == 0) { // if i is even
                continue; // skips the current iteration
            }
            System.out.println(i);
        }
        System.out.println("------------------------------");

        for (char i='A'; i<='G';i++){
          // if we want to skip some characters we can create two separate if-conditions
       /*     if (i=='B') {// B will be skipped
                continue;
                }
            if(i=='E'){ // E will be skipped
                continue;
                }
         */
            // or we can use OR logic
            if (i=='B'|| i=='E') {
                continue;
            }
            System.out.println(i);
        }




    }


















}
