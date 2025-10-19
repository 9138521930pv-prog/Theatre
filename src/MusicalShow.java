public class MusicalShow extends Show {
    private Person musicAuthor;
    private String librettoText;

    public MusicalShow(String title, int duration, Director director, Person musicAuthor, String librettoText) {
        super(title, duration, director); // Передаем параметры в конструктор Show
        this.musicAuthor = musicAuthor; // Инициализируем новое поле
        this.librettoText = librettoText; // Инициализируем новое поле
    }

    public void printLibrettoText() {
        System.out.println("   Либретто спектакля  - " + this.getTitle());
        System.out.println("-----------------------------------------------");
        System.out.println(librettoText);
        System.out.println("-----------------------------------------------");
    }
}