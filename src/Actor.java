import java.util.Objects;
public class Actor extends Person {

    private int height;

    public Actor(String name, String surname, Sex gender, int height) {
        super(name, surname, gender);
        this.height = height;
    }

    @Override // переопределяем toString
    public String toString() {
        return getSurname() + " " + getName() + " рост " + this.height; // просто возвращаем поля класса
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Actor actor = (Actor) o;
        return Objects.equals(getName(), actor.getName()) &&
                Objects.equals(getSurname(), actor.getSurname()) &&
                Objects.equals(this.height, actor.height);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getSurname(), this.height);
    }

}