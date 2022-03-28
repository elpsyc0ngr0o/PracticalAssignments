package practical_three;

import java.util.*;
import java.util.stream.Collectors;

public class StreamExample {

            public static void main(String[] args) {
                List<Dog> dogs = new ArrayList<>();

                dogs.add(new Dog("A", 10));
                dogs.add(new Dog("B", 7));
                dogs.add(new Dog("C", 8));
                dogs.add(new Dog("D", 3));

                dogs.stream()
                        .filter(dog -> dog.age > 5)
                                .forEach(System.out::println);

                Set<String> set = new HashSet<>();

                set.add("Apple");
                set.add("Apple");
                set.add("Peaches");

                System.out.println(set);

                Map<String, String> map = new HashMap<>();

                map.put("class1","Java");
                map.put("class2","English");
                map.put("class3","Maths");
            }

            static void print(String st){
                System.out.println(st);
            }
        }
