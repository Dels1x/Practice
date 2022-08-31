public class Cube extends Square {
    double c;
    Cube(double a, double b, double c) {
        super(a, b);
        this.c = c;
    }

    double getPerimeter() {
        return this.a + this.b + this.c;
    }

    double getArea() {
        return this.a * this.b * this.c;
    }
}
