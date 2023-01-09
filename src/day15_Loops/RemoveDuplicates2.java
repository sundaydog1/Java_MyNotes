package day15_Loops;

import javax.swing.*;

/*
Write a program that can remove the duplicated characters from a string
				Ex:
					str = "aabbbcccc"
					output:
						abc
 */
//                  Second Solution
public class RemoveDuplicates2 {

    public static void main(String[] args) {


String str = "xyzxyzxyz";
String result ="";

        for (int i = 0; i <str.length() ; i++) { // if the character is already contained in new string
           if (result.contains(""+str.charAt(i))){ // skip it
               continue;
           }
            result+=str.charAt(i);

        }

        System.out.println("________________________________________________");

 // find the sum of all the even numbers between 50~100
        for (int i = 50; i<101;i++) {
            if (i % 2 == 0) {
            }
            System.out.print(i+" ");
        }
        System.out.println();


        // 50,52,54,56......100

        for (int i =50;i<101; i+=2) { // if you increase i by 2 it will also get you even numbers

            System.out.print(i + " ");
        }
      //

        for (int i =50;i<101;i++){
            if(i%2!=0){  // if i is odd
                continue; //skip it
            }
            System.out.print(i +" ");
        }






        }

}
