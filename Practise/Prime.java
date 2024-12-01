import java.util.Arrays;

public class Prime {
    public static void main(String[] args) {
        int[] compositeNumber = {1, 2, 5, 6, 8, 11, 36, 25, 24, 19};
        int[] prime = prime(compositeNumber);
        System.out.println(Arrays.toString(prime));
    }

    public static int[] prime(int[] compositeNumber) {
        int index = 0;
        boolean isPrime = false;
        int[] prime = new int[10];
        if (compositeNumber.length == 0) {
            return new int[0];
        }
        for (int i = 0; i < compositeNumber.length; i++) {
            int num = compositeNumber[i];
            if (num <= 1) {
                continue;
            } else if (num == 2 || num == 3) {
                prime[index] = num;
                index++;
            } else if (num % 2 == 0 || num % 3 == 0) {
                continue;
            } else {
                isPrime = true;
                for (int j = 5; j * j <= num; j += 6) {
                    if (num % j == 0 || num % j + 2 == 0) {
                        isPrime = false;
                        continue;
                    }
                }
            }
            if (isPrime) {
                prime[index] = num;
                index++;
            }

        }
        return prime;
    }
}
