package Humans;

import java.util.List;
import java.util.stream.Collectors;

public class Service implements ServiceInt {
    @Override
    public List<String> getListPeopleFromMoscow(List<Human> humans) {
        return humans.stream()
                .filter(it -> it.getName() != null)
                .filter(it -> it.getAge() >= 18 && it.getAge() <= 27)
                .filter(it -> it.getCity() == "Moscow")
                .map(it -> it.getName())
                .collect(Collectors.toList());
    }

}
