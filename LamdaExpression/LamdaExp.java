package LamdaExpression;

import java.util.Arrays;

public class LamdaExp {
    public static void main(String[] args) {

        int[] array = { 1, 2, 3, 4, 5, 6 };
        Arrays.stream(array).forEach(x -> System.out.println(x));
    }
    public void hello(){
        System.out.println("helloworld");
    }
}
