package day19_Arrays_Intro;

import java.text.DecimalFormat;

public class DecimalFormatPractice {
    public static void main(String[] args) {
        DecimalFormat df= new DecimalFormat("0.00");
        double n1 = 10.58713; //==> 10.59

        System.out.println(df.format(n1));








    }
}
