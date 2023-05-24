package DataBaseSurname;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ServiceSurname implements ServiceInt {
//    Я создал интерфейс и класс ServiceSurname
//    сделал публичный метод который
//    возвращает строковый лист фамилий, которые начинаются на J
    @Override
    public List<People> getListSurname(List<People> surname) {
        return surname.stream()
                .filter(it -> it.getSurname.startsWith("J"))
                .collect(Collectors.toList());
    }
}
