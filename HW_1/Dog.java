public class Dog {
    private String name;
    private int age;

    public Dog(String n, int a) {
        name = n;
        age = a;
    }

    public Dog(String n) {
        name = n;
        age = 1;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String toString() {
        return this.name + ", age " + this.age;
    }

    public void intoHumanAge() {
        System.out.println(name + "'s age in human is " + age * 7 + " years.");
    }
}