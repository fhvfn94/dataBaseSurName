package DataBaseSurname;

import java.util.List;

public interface ServiceInt {
//    Я создал интерфейс

    //    Я создал интерфейс и класс ServiceSurname
    //    сделал публичный метод который
    //    возвращает строковый лист фамилий, которые начинаются на J
    List<String> getListSurnameStartingWithJ(List<People> surnameList);
}
