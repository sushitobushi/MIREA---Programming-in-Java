// Абстрактный класс, описывающий посуду
abstract class Dish {
    protected String material; // материал, из которого сделана посуда
    protected int capacity; // вместимость посуды

    // Конструктор класса
    public Dish(String material, int capacity) {
        this.material = material;
        this.capacity = capacity;
    }

    // Геттеры для получения свойств посуды
    public String getMaterial() {
        return material;
    }

    public int getCapacity() {
        return capacity;
    }

    // Абстрактные методы для наполнения и мытья посуды
    public abstract void fill();
    public abstract void wash();
}

// Класс, описывающий чашку
class Cup extends Dish {
    private boolean handle; // наличие ручки у чашки

    // Конструктор класса
    public Cup(String material, int capacity, boolean handle) {
        super(material, capacity);
        this.handle = handle;
    }

    // Геттер для получения наличия ручки у чашки
    public boolean hasHandle() {
        return handle;
    }

    // Реализация методов для наполнения и мытья чашки
    @Override
    public void fill() {
        System.out.println("Cup is filled with liquid.");
    }

    @Override
    public void wash() {
        System.out.println("Cup is washed.");
    }
}

// Класс, описывающий тарелку
class Plate extends Dish {
    private boolean flat; // плоская ли тарелка

    // Конструктор класса
    public Plate(String material, int capacity, boolean flat) {
        super(material, capacity);
        this.flat = flat;
    }

    // Геттер для получения типа тарелки
    public boolean isFlat() {
        return flat;
    }

    // Реализация методов для наполнения и мытья тарелки
    @Override
    public void fill() {
        System.out.println("Plate is filled with food.");
    }

    @Override
    public void wash() {
        System.out.println("Plate is washed.");
    }
}
// Тестирование классов
public class main_part_3{
    public static void main(String[] args) {
        // Создание объектов чашки и тарелки
        Cup cup = new Cup("ceramic", 250, true);
        Plate plate = new Plate("glass", 500, false);

        // Вывод свойств созданных объектов
        System.out.println("Материал чашки: " + cup.getMaterial());
        System.out.println("Емкость чашки: " + cup.getCapacity());
        System.out.println("У чашки есть ручка: " + cup.hasHandle());

        System.out.println("Материал тарелки: " + plate.getMaterial());
        System.out.println("Емскость тарелки: " + plate.getCapacity());
        System.out.println("Плоскость тарелки: " + plate.isFlat());

        // Вызов методов для наполнения и мытья посуды
        cup.fill();
        cup.wash();

        plate.fill();
        plate.wash();
    }
}