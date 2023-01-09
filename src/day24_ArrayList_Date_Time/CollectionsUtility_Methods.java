package day24_ArrayList_Date_Time;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsUtility_Methods {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Java","Java","Java","C#","Ruby","Swift","Swift","Java"));

        System.out.println(names);

        Collections.replaceAll(names,"Java","Python"); // doesn't ignore the case
        System.out.println(names);

        // to ignore case sensitivity we could use a loop

        for(int i =0; i<names.size();i++){
        if(names.get(i).equalsIgnoreCase("Java")){
            names.set(i,"Python");
        }
        }

        System.out.println("-----------------------------------------------");

ArrayList<Integer> list = new ArrayList<>();
list.addAll(Arrays.asList(10,20,20,30,40,40,50,50,50,50,50,60,50,50,50));
int count = Collections.frequency(list,50);
        System.out.println(count);



        System.out.println("-----------------------------------------------");


        ArrayList<String> words = new ArrayList<>();
        words.addAll(Arrays.asList("Java","Java","Java","C#","Ruby","Swift","Swift","Java"));

int countJava = Collections.frequency(words,"Java");

        System.out.println("countJava = " + countJava);

        System.out.println("-----------------------------------------------------");


        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(10,20,20,30,40,40,50,50,50,50,50,60,50,50,50));

for (Integer each:numbers){
    if (Collections.frequency(numbers,each)==1){  // if the frequency of element is 1
        System.out.println(each);
    }
}



    }
}
