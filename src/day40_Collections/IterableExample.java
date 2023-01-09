package day40_Collections;

import java.util.*;

public class IterableExample {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,1,2,3,4,5,6,7,1,2,3,4,5,6,7));

    /*    for (Integer each : list) {
            if(each<5){
                list.remove(each);
            }
        }
*/

        System.out.println("-----------------------------------------");


        List<Integer> list2 = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,1,2,3,4,5,6,7,1,2,3,4,5,6,7));

Iterator <Integer> it = list2.iterator();

while(it.hasNext()){ // the number of iterations will depend on number of elements
  Integer each =   it.next();
  if(each<5){
      it.remove(); // remove method of iterator
  }
}

        System.out.println(list2);

        System.out.println("-----------------------------------------");


        List<Integer> list3 = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,1,2,3,4,5,6,7,1,2,3,4,5,6,7));

for(Iterator<Integer> i = list3.iterator(); i.hasNext();){
    Integer each = i.next();
    if(each<5){
        i.remove();
    }
}
        System.out.println(list3);
        System.out.println("-----------------------------------------------------");

        List<Integer> list4 = new ArrayList<>();
        list4.addAll(Arrays.asList(1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7));

        list4.removeIf( each -> each < 5);

        System.out.println(list4);


        System.out.println("-----------------------------------------------------");

        List<Integer> list5 = new LinkedList<>();
        list5.addAll(Arrays.asList(1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7));

        list5.removeIf( p -> p < 5);

        System.out.println(list5);


    }
}
