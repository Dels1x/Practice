public class Square {
    int a;
    int b;

    Square(int a, int b) {
        this.a = a;
        this.b = b;
    }

    int getPerimeter() {
        return this.a + this.b;
    }

    int getArea() {
        return this.a * this.b;
    }
}
