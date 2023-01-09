package day19_Arrays_Intro;

public class MInNumber {
    public static void main(String[] args) {
        int []numbers = {100,20,500,40,-10,30};

        int min = numbers[0]; // we make an assumption that the 1st number is the minimum number

        for (int i = 1; i < numbers.length; i++) { // index : 1,2,3,4,5 . we skip 0 index as we declared it as max
            if (numbers[i]<min){ // compares the element of the array with the current minimum number
                min =numbers[i]; // replace the current min number;
            }
        }
        System.out.println(min);
    }










}
