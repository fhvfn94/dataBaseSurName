package DataBaseSurname;

public class People {
    public String getSurname;
    //    Я создал класс people с приватной переменной типа стринг surname.
//    Там же создал конструктор и гетеры и сетеры
    private String surname;

    public People(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
