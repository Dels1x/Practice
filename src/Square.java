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
}
