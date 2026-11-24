abstract class Shape {
    String color;

    Shape(String color) {
        this.color = color;
    }

    String getColor() {
        return color;
    }

    abstract float getArea();
}

class Square extends Shape {
    float side;

    Square(String color, float side) {
        super(color);
        this.side = side;
    }

    void setSide(float side) {
        this.side = side;
    }

    @Override
    float getArea() {
        return side * side;
    }
}