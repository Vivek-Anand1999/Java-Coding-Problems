public class sumOfnNumber {
    public static void main(String[] args) {
        int val = 3;
        int result = sumOfN(3);
        System.out.println(result);
    }

    public static int sumOfN(int value) {
        int sum = 0;
        int i = 1;
        while (i < value) {
            sum += value;
            i++;
        }
        return sum;
    }
}
