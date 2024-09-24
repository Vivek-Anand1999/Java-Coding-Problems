package Array;

public class findElement {
    public static void main(String[] args){
        int[] arr = {3,4,6,2,8,9};
        int key = 9;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == key){
                System.out.println("found at "+ i);
            }
        }
    }
}
