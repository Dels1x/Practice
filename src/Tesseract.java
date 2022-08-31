public class Tesseract extends Cube {
    int d;
    Tesseract(int a, int b, int c, int d) {
        super(a, b, c);
        this.d = d;
    }

    int getPerimeter() {
        return this.a + this.b + this.c + this.d;
    }

    int getArea() {
        return this.a * this.b * this.c * this.d;
    }
}
