public class Tesseract extends Cube {
    double d;
    Tesseract(double a, double b, double c, double d) {
        super(a, b, c);
        this.d = d;
    }

    double getPerimeter() {
        return this.a + this.b + this.c + this.d;
    }

    double getArea() {
        return this.a * this.b * this.c * this.d;
    }
}
