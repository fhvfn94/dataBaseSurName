import DataBaseSurname.People;
import DataBaseSurname.ServiceSurname;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Теперь я не могу понять, как я могу
//        создать людей и применить метод getListSurname

        List<People> people = List.of(
                new People("Kirill"),
                new People("Oleg"),
                new People("Jack")
        );
        ServiceSurname serviceSurname = new ServiceSurname();

        List<People> startJ = new ArrayList<>(serviceSurname.getListSurname(people));








    }

}