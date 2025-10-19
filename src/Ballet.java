public class Ballet extends MusicalShow {
    private Person choreographer;

    public Ballet(String title, int duration, Director director, Person musicAuthor, String librettoText, Person choreographer) {
        super(title, duration, director, musicAuthor, librettoText); // Передаем параметры в конструктор Show
        this.choreographer = choreographer; // Инициализируем новое поле
    }
    @Override
    public void printActors() {
        System.out.println("Балет  - " + getTitle());
        System.out.println("   Cписок актеров:");
        for (Actor actor : getListOfActors()) {
            System.out.println("     " + actor);
        }
    }

}
