package day22_ArrayList;

public class MaxAndMinNumberInMultiDArray {
    public static void main(String[] args) {

int[][]array ={ {100,20,300}, {10,1000,50},{-200,400,0}};

int max = array[0][0]; // we assume that the very 1st element of the 1st array is the max number
int min = array[0][0]; // we assume that the very 1st element of the very 1st array is the minimum number

        // we don't have access to elements of Array directly, so at first we need to enter 1D array
        // and then we can get access to elements inside array
        for (int [] eachArray : array){ // we enter the big loop that rotates arrays inside of 2D Array
    for( int eachElement : eachArray){// the smaller loop rotates elements inside of array
        if(eachElement>max){
            max = eachElement;
        }
    }
        }

for ( int[] eachArray:array){
    for( int eachElement:eachArray){
        if (eachElement<min){
            min = eachElement;
        }
    }
}

        System.out.println("max = " + max);
        System.out.println("min = " + min);


    }
}
