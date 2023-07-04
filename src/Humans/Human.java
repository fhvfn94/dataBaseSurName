package Humans;
//Есть следующий класс описывающий человека. Класс Human с полями возраст (Integer), имя (String), город (String). Нужно возвратить List<String> где String это имена людей у которых возраст от 18 до 27 лет включительно и они из города Москва.
//До этого создать список из 6 человек с разными данными, чтобы можно было на этом списке протестировать.
public class Human {
    private Integer age;
    private String name;
    private String surname;
    private String city;

    public Human(Integer age, String name, String city, String surname) {
        this.age = age;
        this.name = name;
        this.surname = surname;
        this.city = city;
    }

    public Integer getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public String getSurname() {
        return surname;
    }
}
