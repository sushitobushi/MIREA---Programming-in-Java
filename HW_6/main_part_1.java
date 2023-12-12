// Абстрактный класс, описывающий мебель
import java.util.ArrayList;
abstract class Furniture {
    protected String name;
    protected String material;
    protected int price;

    public Furniture(String name, String material, int price) {
        this.name = name;
        this.material = material;
        this.price = price;
    }

    public abstract void getInfo();
}

// Класс, описывающий стул
class Chair extends Furniture {
    protected int legs;

    public Chair(String name, String material, int price, int legs) {
        super(name, material, price);
        this.legs = legs;
    }

    public void getInfo() {
        System.out.println( name + ", материал: " + material + ", количество ножек: " + legs + ", цена: " + price + " рублей.");
    }
}

// Класс, описывающий стол
class Table extends Furniture {
    protected int length;
    protected int width;

    public Table(String name, String material, int price, int length, int width) {
        super(name, material, price);
        this.length = length;
        this.width = width;
    }

    public void getInfo() {
        System.out.println( name + ", материал: " + material + ", размеры: " + length + "x" + width + ", цена: " + price + " рублей.");
    }
}

// Класс, описывающий магазин мебели
class FurnitureShop {
    private ArrayList<Furniture> furnitureList;

    public FurnitureShop() {
        furnitureList = new ArrayList<Furniture>();
    }

    public void addFurniture(Furniture furniture) {
        furnitureList.add(furniture);
    }

    public void showFurniture() {
        for (Furniture furniture : furnitureList) {
            furniture.getInfo();
        }
    }
}

// Тестирование работы классов
public class main_part_1 {
    public static void main(String[] args) {
        FurnitureShop shop = new FurnitureShop();

        Chair chair = new Chair("Стул", "Дерево", 1000, 4);
        Table table = new Table("Стол", "Стекло", 5000, 120, 80);

        shop.addFurniture(chair);
        shop.addFurniture(table);

        shop.showFurniture();
    }
}