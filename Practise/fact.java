public class fact {
    public static void main(String[] args) {
        int input = 5;

        System.out.println(fac(5));
    }

    public static int fac(int n) {
        if (n == 1) {
            return 1;
        }
        int l = fac(n - 1);
        return l * n;
    }
}
