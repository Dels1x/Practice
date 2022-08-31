import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What shape you want to be drawn?");
        String desiredShape = scanner.nextLine();
        Shape shape;

        if(desiredShape.toLowerCase(Locale.ROOT).equals("triangle")) {
            shape = new Triangle();
        }
        else {
            shape = new Square(50, 50);
        }

        shape.draw();
    }
}