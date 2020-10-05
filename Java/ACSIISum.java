package Java;

public class ACSIISum {
    public static boolean sameAscii(String a, String b) {
        int ASCVAL1 = 0;
        int ASCVAL2 = 0;

        for(int i = 0; i < a.length(); i++){
            ASCVAL1 += a.charAt(i);
        }

        for(int i = 0; i < b.length(); i++){
            ASCVAL2 += b.charAt(i);
        }
        if(ASCVAL1 == ASCVAL2){
            return true;
        }else{
            return false;
        }
    }
}
