package DataBaseSurname;

import java.util.List;
import java.util.stream.Collectors;

public class ServiceSurname {
    public static List<String> getListSurnameStartingWithJ(List<People> surnameList) {
        return surnameList.stream()
                .filter(person -> person.getSurname().startsWith("J"))
                .map(person -> person.getSurname())
                .collect(Collectors.toList());
    }

}
