package Java;

public class Xo {
    public static boolean getXO (String str) {
        int x_val = 0;
        int o_val = 0;
        str = str.toLowerCase();
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == 'x'){
                x_val++;
            }else if(str.charAt(i) == 'o'){
                o_val++;
            }
        }
        if(x_val == o_val){
            return true;
        }else{
            return false;
        }
    }
}
