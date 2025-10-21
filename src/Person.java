public class Person {
    private String name;
    private String surname;
    private Sex gender;

    public Person(String surname, String name, Sex gender) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public String toString() {
        return surname + " " + name; // просто возвращаем поля класса
    }
}
