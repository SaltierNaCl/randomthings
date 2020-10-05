package Java;

public class logarithmBrute {
    public static int solveForExp(int a, int b) {
        int power = 0;

        while(b != Math.pow(a, power)){
            power++;
        }

        return power;
    }
}
