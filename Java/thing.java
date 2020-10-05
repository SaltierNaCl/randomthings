package Java;

import java.util.ArrayList;
import java.util.Random;

public class thing {
    public static Random r = new Random();
    public static void main(final String[] args) {
        println("thingggg");
        for(Object i : range(5)) {
            println(randomNumber(500,1000) + "" + i);
        }
    }

    public static Object[] range(final int s) {
        ArrayList<Integer> al = new ArrayList<Integer>();
		for(int i = 0; i < s; i++) {
			al.add(i);
		}
		return al.toArray();
    }
    
    public static void print(Object s){
        System.out.print(s);
    }

    public static void println(Object s){
        System.out.println(s);
    }

    public static int randomNumber(int n1, int n2) {
        int t = r.nextInt(n2 - n1);
        return t + n1;
    }
}
