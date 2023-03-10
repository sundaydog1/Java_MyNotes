package day40_Collections;

import java.util.*;

public class IterablePractice {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.addAll(Arrays.asList(
                "Ahmed", "ahmed", "aHmEd", "John", "Ercon", "Daniel", "Mustafa", "Mohammed", "Ahmed", "ahmed", "Yuliia", "Chris"
        ));

Iterator <String> it = names.iterator();

while(it.hasNext()){ // if has methods returns true, it means the loop can get executed
String each = it.next();
if(each.equalsIgnoreCase("ahmed")){
    it.remove();
}
}
        System.out.println(names);

        System.out.println("-----------------------------------");

        List<String> names2 = new ArrayList<>();
        names2.addAll(Arrays.asList(
                "Ahmed", "ahmed", "aHmEd", "John", "Ercon", "Daniel", "Mustafa", "Mohammed", "Ahmed", "ahmed", "Yuliia", "Chris"
        ));
names2.removeIf(p->p.equalsIgnoreCase("ahmed"));
        System.out.println(names2);

        System.out.println("---------------------------------------");


        List<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7,8,9));

        // find the nth largest number

        int n = 5;


        for (int i = 0; i <n-1 ; i++) {
            numbers.removeIf(p-> p==Collections.max(numbers));

        }
int max = Collections.max(numbers);


    }
}
