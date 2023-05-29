package Humans;

import java.util.List;
import java.util.stream.Collectors;

public class Service implements ServiceInt {
    @Override
    public List<String> getListPeopleFromMoscow(List<Human> humans) {
        return humans.stream()
                .filter(it -> it.getAge() >= 18
                        && it.getAge() <= 27
                        && it.getCity() == "Moscow"
                        && it.getName() != null
                )
                .map(it -> it.getName() + " " + it.getSurname())
                .collect(Collectors.toList());
    }

}
