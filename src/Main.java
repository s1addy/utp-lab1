public class Main {
    public static void main(String[] args) {
        Adder adder = new Adder{};
        System.out.println(adder.add(1, 2));

        Substractor substactor = new Substractor();
        System.out.println(substactor.substract(6, 3));

    }
}
