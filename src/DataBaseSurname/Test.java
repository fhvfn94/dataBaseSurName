package DataBaseSurname;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<People> people = List.of(
                new People("Kirill"),
                new People("Oleg"),
                new People("Jack"),
                new People("John")
        );

        ServiceSurname serviceSurname = new ServiceSurname();
        List<String> surnamesStartingWithJ = serviceSurname.getListSurnameStartingWithJ(people);

        System.out.println(surnamesStartingWithJ);
    }
}
