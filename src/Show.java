import java.util.ArrayList;

public class Show {
    private String title;
    private int duration;
    private ArrayList<Actor> listOfActors; // Объявляем список актёров
    private Director director;

    public Show(String title, int duration, Director director) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        listOfActors = new ArrayList<>();
    }

    public int findIndexByLastName(String surname) {
        for (int i = 0; i < listOfActors.size(); i++) {
            if (listOfActors.get(i).getSurname().equals(surname)) {
                return i;
            }
        }
        return -1; // Возвращаем -1, если актёр не найден
    }

    public void addActor(Actor actor) {
        if (!listOfActors.contains(actor)) {
            listOfActors.add(actor);
        } else {
            System.out.println("Актёр уже находится в списке.");
        }
    }

    public ArrayList<Actor> getListOfActors() {
        return listOfActors;
    }

    public String getTitle() {
        return title;
    }

    public void replaceActorBySurname(Actor newActor, String surnameToReplace) {
        int indexOld = findIndexByLastName(surnameToReplace);

        if (!listOfActors.contains(newActor)) {
            if (indexOld != -1) {
                listOfActors.set(indexOld, newActor);
                System.out.println("Актёр успешно заменён.");
            } else {
                System.out.println("Актёр не найден в списке.");
            }
        } else {
            System.out.println("Актёр уже находится в списке.");
        }

    }

    public void printActors() {
        System.out.println("Спектакль  - " + title);
        System.out.println("   Cписок актеров:");
        for (Actor actor : listOfActors) {
            System.out.println("     " + actor);
        }
    }

    public void printDirectot() {
        System.out.println("Режисер - " + director);
    }

}

