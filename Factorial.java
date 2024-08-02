public class Factorial {
    public static void main(String[] args) {
        int x = 6;
        int f = factorial(x);
        System.out.printf("Faktoriál čísla %d je: %d", x, f);
    }
    public static int factorial(int n) {
        int f = n;
        for (int i = n; i > 1; i--) {
            f = f*(i-1);
        }
        return f;
    }
}

