package Java;

public  class triagle_factorial {
    public static int triangle(int n) {
        int sum = 1;

        for(int i = 1; i < n; i++){
            sum += i + 1;
        }

        return sum;
    }
}
