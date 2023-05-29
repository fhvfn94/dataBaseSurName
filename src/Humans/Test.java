package Humans;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        List<Human> humans = List.of(
                new Human(20, "Bill", "Moscow", "qwer"),
/*                new Human(19, "Frank", "Odessa"),
                new Human(20, "Adam", "Moscow"),
                new Human(29, "Piter", "Moscow"),
                new Human(27, "Jordan", "Moscow"),*/
                new Human(25, null, "Moscow", "ryyj")
        );
        ServiceInt serviceInts = new Service();
        List<String> peopleFromMoscow = serviceInts.getListPeopleFromMoscow(humans);
        System.out.println(peopleFromMoscow);
    }
}
