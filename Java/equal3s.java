package Java;

public class equal3s {
    public static void main(String[] args){
        System.out.println(equal(1, 3, 3));
    }

    public static int equal(int a, int b, int c) {
        int count = 0;
        if(a == b){
            count += 1;
        }
        if(a == c){
            count += 1;
        }
        if(b == c){
            count += 1;
        }
        if(count == 1){
            return 2;
        }else
        if(count >= 2){
            return 3;
        }else{
            return 0;
        }
    }
}
