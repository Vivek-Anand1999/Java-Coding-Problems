public class Fabonaci {
    public static void main(String[] args) {

        int first = 0;
        int second = 1;
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.print(first + " ");
            sum += first;
            int result = first + second;
            first = second;
            second = result;
        }
        System.out.println();
        System.out.println(sum);
        System.out.println("**************");
        int r = facb(10);
        System.out.println(r);
    }

    public static int facb(int n) {
        if (n <= 1) {
            return n;
        }
        return facb(n - 1) + facb(n - 2);
    }
}