package day10_Scanner_String;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;
public class Read_files_with_scanner {
    public static void main(String[] args) throws IOException {
       Scanner scan = new Scanner (Path.of("src/day10_Scanner_String/Test.txt"));

        System.out.println(scan.next()); // to read word by word
        System.out.println(scan.nextLine()); // to read by line


        System.out.println(scan.hasNext()); // returns true or false. shows if there
                                            // any word to be read in the text document





    }





}
