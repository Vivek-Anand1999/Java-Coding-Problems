package Array;

import java.util.Arrays;

public class findMissingNumber {
    public static void main (String [] args){
        int []array = {1,2,6,8,9,12};
        int [] emptyArray = new int [6];
        int startIndexOfSecondArray = 0;
        int startIndex = 0;
        int count = 0;
        while(startIndex<array.length){
            count++;
            if(array[startIndex]==count){
                startIndex++;
            }
            else{
                emptyArray[startIndexOfSecondArray] = count;
                startIndexOfSecondArray++;
            }
        }
        System.out.println(Arrays.toString(emptyArray));
        int lengthOfCurrentArray = array.length;
        int lastValueOfCurrentArray = array[lengthOfCurrentArray-1];
        int totalNumberCanBe = (lastValueOfCurrentArray * (lastValueOfCurrentArray + 1)) / 2;
        System.out.println(totalNumberCanBe);
        int totalMissingNumber = totalNumberCanBe-lengthOfCurrentArray;
        System.out.println(totalMissingNumber);

    }
}
