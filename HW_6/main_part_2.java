


//Второе задание
abstract class Dog {
    protected String name;
    protected int age;
    private String breed;

    public Dog(String name, int age, String breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    public abstract void bark();

    public void run() {
        System.out.println(name + " бежит!");
    }

    public void sleep() {
        System.out.println(name + " спит.");
    }

    public String getBreed() {
        return breed;
    }
}

class Bulldog extends Dog {
    public Bulldog(String name, int age) {
        super(name, age, "Бульдог");
    }

    @Override
    public void bark() {
        System.out.println(name + " лает: Гав-гав!");
    }
}

public class main_part_2 {
    public static void main(String[] args) {
        Bulldog bulldog = new Bulldog("Буся", 3);
        bulldog.bark(); // Буся лает: Гав-гав!
        bulldog.run(); // Буся бежит!
        bulldog.sleep(); // Буся спит.
        System.out.println(bulldog.getBreed()); // Бульдог
    }
}