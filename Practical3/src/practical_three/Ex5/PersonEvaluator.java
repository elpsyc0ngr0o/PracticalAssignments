package practical_three.Ex5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

    public class PersonEvaluator {
        public List<Person> persons;

        public PersonEvaluator(List<Person> persons) {
            this.persons = persons;
        }

        void findAndPrint(){
            persons.stream()
                    .filter(person -> person.name.startsWith("P"))
                    .forEach(System.out::println);
        }

        void groupAndPrint(){
            persons.stream()
                    .filter(person -> person.age > 18)
                    .forEach(System.out::println);
        }

        void groupByAge(){
            persons.stream()
                    .sorted(Comparator.comparingInt(s -> s.age))
                    .forEach(System.out::println);
        }

        void getAverageAge(){
            int n = persons.size();
            List<Integer> sumAge = new ArrayList<>();
            for (int i=0;i<n;i++){
                sumAge.add(persons.get(i).age);
            }
            int sum = sumAge.stream()
                    .reduce(0, Integer::sum);
            double avg = (sum + 0.00) /n;
            System.out.println("Average age = " + avg);
        }

    }
