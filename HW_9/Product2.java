interface Priceable {
    double getPrice();
}

class Product implements Priceable {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}

class Service implements Priceable {
    private String name;
    private double hourlyRate;
    private int durationInHours;

    public Service(String name, double hourlyRate, int durationInHours) {
        this.name = name;
        this.hourlyRate = hourlyRate;
        this.durationInHours = durationInHours;
    }

    public double getPrice() {
        return hourlyRate * durationInHours;
    }
}

public class Product2 {
    public static void main(String[] args) {
        Priceable product = new Product("Phone", 499.99);
        System.out.println("Product price: $" + product.getPrice());

        Priceable service = new Service("Plumbing", 50.0, 2);
        System.out.println("Service price: $" + service.getPrice());
    }
}
