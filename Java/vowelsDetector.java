package Java;

public class vowelsDetector {

    public static void main(String[] args){
        System.out.println(removeVowels("Hello Thing"));
    }

    public static int getCount(String str) {
        int vowelsCount = 0;
        str = str.toLowerCase();
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' ||str.charAt(i) == 'i' ||str.charAt(i) == 'o' ||str.charAt(i) == 'u'){
                vowelsCount++;
            }
        }
        
        return vowelsCount;
      }
    public static String removeVowels(String s) {
        
        String removed = "";

        for (char c : s.toLowerCase().toCharArray()) {
            if("aeiou".indexOf(c) == -1){
                removed+= c;
            }
        }        
        /* for(int i = 0; i < s.length(); i++){
            if(s.toLowerCase().charAt(i) == 'a' || s.toLowerCase().charAt(i) == 'e'
            || s.toLowerCase().charAt(i) == 'o' || s.toLowerCase().charAt(i) == 'i'
            || s.toLowerCase().charAt(i) == 'u'){
            }else{
                removed += s.charAt(i);
            }
        }  */

        return removed;
	}
}
