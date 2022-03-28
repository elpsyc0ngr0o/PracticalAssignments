package practical_three.Ex3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OutputB {public static void main(String[] args) {

    List<String> list = Arrays.asList("a1", "c3", "a2", "a3", "b3", "b2", "c1", "c2", "b1");

    List<String> result = list.stream().filter(s -> s.startsWith("b")).collect(Collectors.toList());

    System.out.println(result);

}
}
