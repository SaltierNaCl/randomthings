package Java;

public class reverseS {
    public static String reverse(String s){
        String f = "";
        for(int i = 0; i < s.length(); i++){
            f += s.charAt(s.length() - i - 1);
        }
        return f;
    }  
}
