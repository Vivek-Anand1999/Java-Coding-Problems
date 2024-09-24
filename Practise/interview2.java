public class interview2 {
    public static void main(String[] args) {
        fizzBuzz(15);
    }

    public static void fizzBuzz(int n) {
        int i = 1;
        if (n <= 0) {
            System.err.println("please use Number greater than 0");
        } else {
            while (i <= n) {
                if (i % 3 == 0 && i % 5 == 0) {
                    System.err.println("FizzBuzz");
                    i++;
                } else if (i % 3 == 0) {
                    System.err.println("Fizz");
                    i++;
                } else if (i % 5 == 0) {
                    System.err.println("Buzz");
                    i++;
                } else {
                    System.err.println(i);
                    i++;
                }
            }
        }
    }
}
