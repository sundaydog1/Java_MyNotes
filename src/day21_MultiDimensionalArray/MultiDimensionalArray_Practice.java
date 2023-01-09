package day21_MultiDimensionalArray;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MultiDimensionalArray_Practice {
    public static void main(String[] args) {


        String[] group1 = {"James", "Gabriel", "Michelle", "Bryan"};
        String[] group2 = {"Alena", "Kate", "Tatiana"};
        String[] group3 = {"Luis", "Eli", "Edwin", "Joseph", "Fernando"};
        String[] group4 = {"Michael", "Daniella"};

        String[][] groups = {group1, group2, group3, group4}; // length : 4


        for (int i = 0; i < groups.length; i++) {
        String [] eachgroup =groups[i] ;
            System.out.println(Arrays.toString(eachgroup));

            for (int j = 0; j < eachgroup.length; j++) {
                String eachStudent = eachgroup[j];
                System.out.println(eachStudent);
            }
        }

        System.out.println("--------------------------------");

        for (String[] eachGroup : groups) {
            System.out.println(Arrays.toString(eachGroup));

            for (String eachStudent : eachGroup) {
                System.out.println(eachStudent);
            }
        }

        System.out.println("--------------------------------");
// printing the groups in the reversed order, but keeping the elements of the group in the right order
        for (int i = groups.length - 1; i >= 0; i--) {
        String[] eachGroup=    groups [i];
            System.out.println(Arrays.toString(eachGroup));
            for (String eachStudent : eachGroup) {
                System.out.println(eachStudent);
            }
        }
        System.out.println(Arrays.toString(groups)); //it's gonna give us hashcode, beause toString method is used ONLY for printing single dimensional Arrays
        System.out.println(Arrays.deepToString(groups)); // deepToString method => to print Multi D arrays



int [][]arr201={ {1,2},{3,4,5} };
int [][] arr202 ={ {6,7,8,9}, {10,11},{12,13,14}};
int [][]arr203 ={{15,16,17,18}};

int [][][] arr3D = {arr201,arr202,arr203}; // length:3


        //[index of 2d array][index of 1d array] [index of elements];

        System.out.println(Arrays.deepToString(arr3D));
        System.out.println(Arrays.deepToString(arr3D[1])); //2nd 2Dimensional array;
        System.out.println(Arrays.toString(arr3D[0][1])); // 2nd 1D array in the first 2D array

        System.out.println("-------------------------------------");
        for (int i = 0; i < arr3D.length; i++) { // i : index of 2D array;
            int[][] each2DArray =arr3D[i];
            System.out.println(Arrays.deepToString(each2DArray));

            for (int j = 0; j < each2DArray.length; j++) { // j: is index of 1 dimensional array
                int [] each1DArray = each2DArray[j];
                System.out.println(Arrays.toString(each1DArray));

                for (int k = 0; k < each1DArray.length; k++) { //k: index of elements
                    int eachElement = each1DArray[k];
                    System.out.println(eachElement);

                }

            }


        }



    }














}
