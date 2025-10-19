public class Opera extends MusicalShow {
    private int choirSize;

    public Opera(String title, int duration, Director director, Person musicAuthor, String librettoText, int choirSize) {
        super(title, duration, director, musicAuthor, librettoText); // Передаем параметры в конструктор Show
        this.choirSize = choirSize; // Инициализируем новое поле
    }
    @Override
    public void printActors() {
        System.out.println("Опера  - " + getTitle());
        System.out.println("   Cписок актеров:");
        for (Actor actor : getListOfActors()) {
            System.out.println("     " + actor);
        }
    }

}