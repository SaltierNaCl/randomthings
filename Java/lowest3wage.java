package Java;

public class lowest3wage {
    public static int programmers(int one, int two, int three) {
        int diff = 0;
        int max = 0;
        int min = 0;
        // Max
        if(one > two && one > three){
            max = one;
        }else
        if(one < two && two > three){
            max = two;
        }else
        if(one < three && two < three){
            max = three;
        }
        // Min
        if(one < two && one < three){
            min = one;
        }else
        if(one > two && two < three){
            min = two;
        }else
        if(one > three && two < three){
            min = three;
        }
        
        
        diff = max-min;
        return diff;
    }
}
