public class Program {
    public static void main(String[] args) {
        // Exemplo Garbage Collector
        int x = 10;
        if (x > 0) {
            int y = 20;
        }
        System.out.println(x);
    }
}
