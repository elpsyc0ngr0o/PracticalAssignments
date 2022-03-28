package practical_three.Ex1;

import java.util.*;

public class ListProcessingWithStreams {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("a1", "c3", "a2", "a3", "b3", "b2", "c1", "c2", "b1");

        Optional<String> result = list.stream().findFirst();

        System.out.println(result);
    }
}
/**public class ListProcessingWithStreams {

        public static void main(String[] args) {
            List<String> myList = new ArrayList<>();

            myList.add("a1");
            myList.add("c3");
            myList.add("a2");
            myList.add("a3");
            myList.add("b3");
            myList.add("b2");
            myList.add("c1");
            myList.add("c2");
            myList.add("b1");


            String firstElement = ArrayList.stream().findFirst().get();
            System.out.println(firstElement);

            System.out.println(myList);




        }
    }

//var res = myList.stream()
//.filter((item -> !item.matches(regex))
//.map(item -> item.toUppercase(Locale.ROOT))
// .reduce ((i1,i2) -> ))
//.forEach(item -> System. out.println(item));



//System.out.println(res)**/

