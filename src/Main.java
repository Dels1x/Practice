public class Main {
    public static void main(String[] args) {

        Example example = new Example();
        Example example1 = new Example();

        System.out.println(example.integer);
        System.out.println(example.character);
        System.out.println(example.string);

        example.incrementBy(5);

        System.out.println(example1.integer);

        example1.incrementBy(6);

        System.out.println(Example.integer);
    }
}
