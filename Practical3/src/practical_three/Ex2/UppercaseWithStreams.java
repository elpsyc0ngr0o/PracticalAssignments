package practical_three.Ex2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UppercaseWithStreams {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("a1", "c3", "a2", "a3","b3", "b2", "c1", "c2","b1");

        List<String> result = list.stream().map(String::toUpperCase).collect(Collectors.toList());

        System.out.println(result);
    }

}
