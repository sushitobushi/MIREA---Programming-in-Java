public class testDog {
    public static void main(String[] args) {
        Dog d1 = new Dog("Mike", 2);
        Dog d2 = new Dog("Helen", 7);
        Dog d3 = new Dog("Bob");
        d3.setAge(1);

        System.out.println(d1);
        System.out.println(d1.getName());  // Fix here
        System.out.println(d2.getName());  // Fix here
        System.out.println(d3.getName());  // Fix here
    }
}