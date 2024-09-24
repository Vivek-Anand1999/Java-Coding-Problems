import java.util.Arrays;
public class insertingElementInArray {
    public static void main(String[] args){
        int[] array = new int [5];
        for(int i=0;i<array.length-1;i++){
            array[i] = i+1;
        }
        System.out.println(Arrays.toString(array));
        int element=0;
        for(int i=0;i<array.length;i++){
            if(array[i]>0){
                element++;
            }
            else{
                System.out.println("space available at " + i + " index");
            }
        }

        int insert = 8;
        for(int i=array.length-1;i>=0;i--){
            if (i!=0){
            array[i]=array[i-1];
            }
            else{
                array[i]=insert;
            }

        }
        System.out.println(Arrays.toString(array));
        for (int k=array.length-1;k>=0;k--){
            if(array[k]==0){

            }
        }
    }
}  
