public class Main {
    public static void main(String[] args) {
        int[] sales = {10, 20, 30, 40};
        SalesManager manager = new SalesManager(sales);
        System.out.println("Max:" + manager.max());
    }
}