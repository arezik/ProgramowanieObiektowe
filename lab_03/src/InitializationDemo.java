public class InitializationDemo {
    static String staticField = "1. Pole";
    String instanceField = "4. Pole";

    static {
        System.out.println("2. Blok");
    }

    {
        System.out.println("3. Blok");
    }

    public InitializationDemo() {
        System.out.println("5. Konstruktor ");
    }
}
