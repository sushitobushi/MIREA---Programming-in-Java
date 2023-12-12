abstract class Shape {
    private String Color;
    private boolean Filled;

    Shape() {}

    Shape(String color, boolean filled) {
        Color = color;
        Filled = filled;
    }

    String getColor() {
        return Color;
    }

    void setColor(String color) {
        Color = color;
    }
    boolean isFilled() {
        return Filled;
    }
    void setFilled(boolean filled) {
        Filled = filled;
    }

    double getArea() {
        return 0.0;
    }

    double getPerimeter() {
        return 0.0;
    }

    public String toString() {
        return "Shape object: is filled: " + Filled + ", color: " + Color;
    }
}