public class JavaMethods {
    public static void main(String[] args) {
        helloWorld();
        helloSloba();
        //printHello("Olga");
        //printHello("Roman");
        getSum(5, 5);
        getSum(1, 2);
        getSum(3.5, 4.5);
        printNameAndAge("Sloba", 25);
        printNameAndAge("Marko", 35);
        getSum(3, 4, 5);
        System.out.println(square(2));
    }

    private static void helloWorld () {
        System.out.println("Hello, world!");
    }
    private static void helloSloba () {
        System.out.println("Hello, Sloba!");
    }
    //private static void printHello (String name) {
    //    System.out.println("Hello, " + name);
    //}
    private static void getSum (int a, int b) {
        int sum = a + b;
        System.out.println(sum);
    }
    private static void printNameAndAge (String name, int age) {
        System.out.println(name + " is " + age + " years old.");
    }
    private static void getSum (double a, double b) {
        double sum = a + b;
        System.out.println(sum);
    }
    private static void getSum (int a, int b, int c) {
        int sum = a + b + c;
        System.out.println(sum);
    }
    private static int square(int number) {
        int square = number * number;
        return square;
    }
}
