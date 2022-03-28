package practical_three;

public class Lambda {

    void isAlive(Animals animals, boolean air){
        if(animals.breath(air)) {
            System.out.println("Alive");
        } else {
            System.out.println("Dead");
        }
    }


public static void main(String... args) {

    var lambda = new Lambda();

    lambda.isAlive((air) -> air, true);

}
}