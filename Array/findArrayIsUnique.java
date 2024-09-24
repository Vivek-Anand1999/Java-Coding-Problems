package Array;

public class findArrayIsUnique {
    public static void main(String[] args){
        int[] array = {20,10,30,40,50,40,60};
        boolean result = isUnique(array);
        if(result){
            System.out.println("Array is unique");
        }
        else{
            System.out.println("Array is not unique");
        }
    }
    public static boolean isUnique(int[] array){
        for (int i = 0; i < array.length; i++){
            for (int j = i+1; j < array.length; j++){
                if (array[i] == array[j]){
                    return false;
                }
            }
        }
        return true;
    }
}
