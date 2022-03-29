package practical_three.Ex5;

import java.util.ArrayList;
import java.util.List;

public class PersonProcessingWithStream {
    public static void main(String[] args) {

        List<Person> attribute = new ArrayList<Person>();
        attribute.add(new Person("Max", 28));
        attribute.add(new Person("Peter", 22));
        attribute.add(new Person("Anna", 28));
        attribute.add(new Person("Lilianna", 16));
        attribute.add(new Person("Pamela", 13));
        attribute.add(new Person("David", 22));

        PersonEvaluator personEvaluator = new PersonEvaluator(attribute);
        System.out.println("\n" + "Name starting from P : ");

        personEvaluator.findAndPrint();
        System.out.println("\n" + "Older than 18 : ");

        personEvaluator.groupAndPrint();
        System.out.println("\n" + "Group by age : ");

        personEvaluator.groupByAge();
        System.out.println("\n");

        personEvaluator.getAverageAge();

    }
}
