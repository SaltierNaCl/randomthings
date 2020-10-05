package Java;

public class phoneformat {
    public static String formatPhoneNumber(int[] nums) {
        String finalnumber = "(";
        
        for(int i = 0; i < 3; i++){
            finalnumber += nums[i];
        }
        finalnumber += ") ";

        for(int i = 3; i < 6; i++){
            finalnumber += nums[i];
        }
        finalnumber += "-";

        for(int i = 6; i < 10; i++){
            finalnumber += nums[i];
        }

        return finalnumber;
	}
}
