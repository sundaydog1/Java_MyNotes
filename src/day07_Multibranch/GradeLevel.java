package day07_Multibranch;

/*
An integer variable named gradeLevel is declared and given, Write a
program to determine and print which school type someone is in.
(Only if the given number is a valid number, then print the school type.
Otherwise print Invalid)

Ex:

gradeLevel = 2

output:

Elementary School
The grade level and types are:
1 ~ 5: Elementary school
6 ~ 8: Middle school
9 ~ 12: High school
13 ~ 16: College
17 ~ 18: Grad School
assume that the number is 1-18
 */
public class GradeLevel {
    public static void main(String[] args) {
int gradeLevel = 17;
String result = "";
if (gradeLevel <=5){ // if it's false it means gradelevel >=6
    result = "Elementary School";
}else if (gradeLevel <=8){
    result = "Middle School";
} else if (gradeLevel<=12) {
    result = "High School";
} else if (gradeLevel <=16) {
    result = "College";
}else{
    result = "Grad School";
}
        System.out.println(result);

    }




}
