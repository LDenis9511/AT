package homework_9;

import java.util.LinkedList;

public class Animals {
    private LinkedList<String> animals = new LinkedList<>();

    public void setAnimals(String animals) {
        this.animals.addFirst(animals);
    }

    public void delAnimals() {
        this.animals.removeLast();
    }

    public LinkedList<String> getAnimals() {
        return animals;
    }
}