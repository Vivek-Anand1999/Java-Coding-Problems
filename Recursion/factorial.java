package Recursion;

public class factorial {
    public static void main (String []args){
        int result = findFactorial(4);
        System.out.println(result);
    }
    static int findFactorial(int value){
        if(value==0){
            System.out.println("factorail not possible");
            return 1;
        }
        else{
            return value*findFactorial(value-1);
        }
    }
}
