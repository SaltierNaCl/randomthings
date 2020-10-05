package Java;

public class maxminarraydif{

    public static int differenceMaxMin(int[] arr) {
        
        int max = 0;
        int min = 10000000;
        for(int i = 0; i < arr.length; i++){

            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i] < min){
                min = arr[i];
            }

        }
        
        return max - min;
    }
}