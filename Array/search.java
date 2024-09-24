package Array;

public class search {
    public static void main(String [] args){
        int [] array = {1,2,3,4,5,6};
        int [] array1 = {5,8,2,6,4,1};
        int result = seearch(array,6);
        System.out.println(result);

    }
    public static int seearch(int []arr, int value){
        for(int i=0; i<arr.length;i++){
            if(arr[i]==value){
                return i;
            }
            else{
                System.out.println("not found");
            }
        }
        return -1;
    }
}
