import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Shape> arrayList = new ArrayList<>();
        ArrayList<Cube> arrayList1 = new ArrayList<>();

        Cube cube = new Cube(50, 50, 50);

        arrayList.add(cube);

        arrayList.get(0).draw();

        System.out.println(arrayList.get(0).getClass());

        Shape cube2 = new Cube(64, 64, 64);

        System.out.println(cube2.getClass());

        arrayList1.add((Cube) cube2);   // Shape object can't be added to Cube ArrayList, but it can be if we downcast it
                                        // to Cube, as Cube is child of Shape


    }
}
