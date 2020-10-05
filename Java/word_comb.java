package Java;

public class word_comb {
    public static String getWord(String left, String right) {
        
        char[] left_char = left.toCharArray();

        left_char[0] = Character.toUpperCase(left_char[0]);

        left = String.copyValueOf(left_char);

        return left + right;
    }
    public static String nameShuffle(String s) {
        String[] split = s.split(" ");
        return split[1] + " " + split[0];
    }
    public static boolean checkPalindrome(String str) {
        char[] arr = str.toCharArray();
        for(int i = 0; i < str.length()/2; i++){
            if(arr[0] + i == arr[arr.length - 1] - i){
                continue;
            }else{
                return false;
            }
        }
        return true;
    }
    public static int leftDigit(String str) {
        char[] stra = str.toCharArray();
        int digit = 0;
		for(int i = 0; i < stra.length; i++){
            if(digit == 0){
                if(Character.isDigit(stra[i])){
                    digit = stra[i];
                    
                }
          }
        }
        return digit;
    }
}
