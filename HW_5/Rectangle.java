class Rectangle extends Shape {
    protected double width;
    protected double length;

    Rectangle() {
        setColor("blue");
        setFilled(false);
    }

    Rectangle(double width, double length) {
        setColor("blue");
        setFilled(false);
        this.width = width;
        this.length = length;
    }

    Rectangle(double width, double length, String color, boolean filled) {
        setColor("blue");
        setFilled(false);
        this.width = width;
        this.length = length;
    }

    double getWidth() {
        return this.width;
    }

    void setWidth(double width) {
        if (width > 0) {
            this.width = width;
            System.out.println("Rectangle width setted as: " + this.width);
        } else {
            System.out.println("Rectangle width must be > 0");
        }
    }

    double getLength() {
        return this.length;
    }

    void setLength(double length) {
        if (length > 0) {
            this.length = length;
            System.out.println("Rectangle length setted as: " + this.length);
        } else {
            System.out.println("Rectangle length must be > 0");
        }
    }

    @Override
    double getArea() {
        return this.length * this.width;
    }

    @Override
    double getPerimeter() {
        return 2 * (this.length + this.width);
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        return "Shape: rectangle, length: " + this.length + ", width: " + this.width;
    }
}