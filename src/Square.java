public class Square extends Shape{
    double a;
    double b;

    Square(double a, double b) {
        this.a = a;
        this.b = b;
    }

    double getPerimeter() {
        return this.a + this.b;
    }

    double getArea() {
        return this.a * this.b;
    }

    void draw() {
        System.out.println("Square was drawn!");
    }

    void erase() {
        System.out.println("Square was erased!");
    }
}
