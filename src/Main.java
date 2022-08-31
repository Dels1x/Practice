public class Main {
    public static void main(String[] args) {
        Tesseract tesseract = new Tesseract(75, 90, 30, 60);
        Square square = new Square(75, 90);

        System.out.println(tesseract.getArea());
        System.out.println(square.getArea());

        Square tesseract1 = new Tesseract(75, 90, 30, 60.3);

        System.out.println(tesseract1.getArea());

        Shape circle = new Circle();

        circle.draw();

    }
}