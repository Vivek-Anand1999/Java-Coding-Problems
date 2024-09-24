package Array;

public class maxProductOfTwoInt {
    public static void main(String[] args){
        int[] array = {20,10,30,50,40,60};
        findMaxProduct(array);

    }
    public static void findMaxProduct(int[] array){
        int higestValueOfTwoElement = 0;
        int num1 = 0;
        int num2 = 0;
        for (int i = 0; i < array.length; i++){
            for (int j = i+1; j < array.length; j++){
                if(array[i] * array[j] > higestValueOfTwoElement){
                    higestValueOfTwoElement = array[i] * array[j];
                    num1 = array[i];
                    num2 = array[j];
                }else{
                    continue;
                }
            }
        }
        System.out.println(num1 + " and " + num2 + " = " +  higestValueOfTwoElement);
    }
}
