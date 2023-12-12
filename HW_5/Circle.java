class Circle extends Shape {
    protected double radius;

    Circle() {
        super.setColor("blue");
        super.setFilled(false);
        this.radius = 1;
    }

    Circle(double radius) {
        super.setColor("blue");
        super.setFilled(false);
        this.radius = radius;
    }
    Circle(double radius, String color, boolean filled) {
        super.setColor(color);
        super.setFilled(filled);
        this.radius = radius;
    }
    public double getRadius() {
        return this.radius;
    }
    public void SetRadius(double radius) {
        if (radius > 0) {
            this.radius = radius;
        } else {
        }
    }

    @Override
    double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    @Override
    double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        return "Shape: circle, radius: " + this.radius;
    }
}