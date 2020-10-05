package Java;

public class fibbonacistring {

    public static void main(String[] args ){
        String[] str = {"e","a"};
        System.out.println(generate(5, str));
    }

    public static String generate(int n, String[] s) {
        if(n == 1){
            return "invalid";
        }
        String first = s[0];
        s[0] = s[1];
        s[1] = s[1] + first;
        n--;
        if(n > 2){
            return generate(n, s);
        }else{
            return s[1];
        }
      }
}
