package Java;

public class countinghashplus {
    public static int[] hashPlusCount(String s) {
        int hash_count = 0;
        int plus_count = 0;
        
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '#'){
                hash_count++;
            }else{
                plus_count++;
            }
        }
        int[] combo = {hash_count, plus_count};
        return combo;
	}
}
