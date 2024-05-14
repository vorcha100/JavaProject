public class Homework5 {
    public static void main(String[] args) {
        getAverage(5, 10, 15);
        System.out.println(getAverage2(10, 20, 30));
    }
    private static void getAverage(int a, int b, int c) {
        int average = (a + b + c) / 3;
        System.out.println(average);
    }
    private static int getAverage2(int d, int e, int f) {
        return (d + e + f)/3;
    }
}
