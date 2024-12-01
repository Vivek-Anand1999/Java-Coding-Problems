package Array.leetcodestrack;

public class Sqt {
    public static void main(String[] args) {
        int x = 8;
        sqt(x);
    }

    public static int sqt(int x) {
        int low = 0;
        int high = x;
        while (low <= high) {
            int mid = (low + high) / 2;
            if((mid*mid) == x){
                return mid;
            }
        }
        return 0;
    }
}
