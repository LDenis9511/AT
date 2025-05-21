package homework_9;

public class homework_9_2 {
    public static void main(String[] args) {
        Animals animals = new Animals();
        animals.setAnimals("Корова");
        animals.setAnimals("Собака");
        animals.setAnimals("Кошкка");
        System.out.println(animals.getAnimals());
        animals.delAnimals();
        System.out.println(animals.getAnimals());
        animals.setAnimals("Коза");
        animals.setAnimals("Лев");
        System.out.println(animals.getAnimals());
    }
}

