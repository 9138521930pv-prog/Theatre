public class Theatre {
    public static void main(String[] args) {
        String textLibretto;
//Создание актеров
    Actor actor1 = new Actor("Иванов", "Иван", Sex.MALE, 182);
    Actor actor2 = new Actor("Петрова", "Ирина", Sex.FEMALE, 175);
    Actor actor3 = new Actor("Сидоровский", "Семен", Sex.MALE, 190);
    Actor actor4 = new Actor("Гениевй", "Степан", Sex.MALE, 191);
//Создание автора музыки для оперы
    Person musicAuthor = new Person("Авторский", "Степан", Sex.MALE);
//Создание хореографа
    Person choreographer = new Person("Селеванов", "Петр", Sex.MALE);
//Создание 2х режисеров
    Director director1 = new Director("Серафимов", "Матвей", Sex.MALE, 5);
    Director director2 = new Director("Ступина", "Елена", Sex.FEMALE, 7);
//Создание обычного спектакля
    Show show = new Show("Гроза", 60, director1);
//Добавление актеров в спектакль
    show.addActor(actor1);
    show.addActor(actor3);
//Создание балета
    textLibretto = "Здесь должно быть либретто балета";
    Ballet ballet = new Ballet("Лебединное озеро", 65, director2, musicAuthor, textLibretto,choreographer);
//Добавление актеров в спектакль
    ballet.addActor(actor2);
    ballet.addActor(actor3);
//Создание оперы
    textLibretto = "Здесь должно быть либретто оперы";
    Opera opera = new Opera("Опера", 71, director1, musicAuthor, textLibretto,10);
//Добавление актеров в спектакль
    opera.addActor(actor1);
    opera.addActor(actor2);

    System.out.println("Печать списка актеров спектакля");
    show.printActors();
    System.out.println("Печать списка актеров балета");
    ballet.printActors();
    System.out.println("Печать списка актеров оперы");
    opera.printActors();

    System.out.println("Замена актера в опере, меняем  Петрову на Сидоровский");
    opera.replaceActorBySurname(actor3, "Петрова");
    opera.printActors();
    System.out.println("Попытка замена актера которого нет в списке актеров  оперы, меняем  Петрову на Гениева");
    opera.replaceActorBySurname(actor4, "Петрова");

    //Печать либретто оперы;
    opera.printLibrettoText();
    //Печать либретто балета;
    ballet.printLibrettoText();
    }
}
