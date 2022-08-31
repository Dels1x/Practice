public class Cube extends Square {
    int c;
    Cube(int a, int b, int c) {
        super(a, b);
        this.c = c;
    }

    int getPerimeter() {
        return this.a + this.b + this.c;
    }

    int getArea() {
        return this.a * this.b * this.c;
    }
}
