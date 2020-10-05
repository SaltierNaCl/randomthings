package Java;

public class repeat {
    public static String doubleChar(String s){
        String f = "";
        for(int i = 0; i < s.length(); i++){
            f += s.charAt(i);
            f += s.charAt(i);
        }
        return f;
        
    }   
    public static String repeat_2(String str, int n) {
		String f = "";
        for(int i = 0; i < str.length(); i++){
            for(int j = 0; j < n; j++){
                f += str.charAt(i);
            }
        }
        return f;
	}      
}
