package Java;

public class textToNum {
    public static void main(String[] args){

        System.out.println(textToNu("653-TRY-THIS"));
    }


    private static String textToNu(String thing) {
        String s = thing;
        String converted = "";
        for(int i = 0; i < s.length(); i++){
            if(Character.isDigit(s.charAt(i)) || s.charAt(i) == '-' || s.charAt(i) == '(' || s.charAt(i) == ')'){
                converted += s.charAt(i);
            }else if(Character.isAlphabetic(s.charAt(i))){
                char l = s.charAt(i);
                if(l == 'A' || l == 'B' || l == 'C'){
                    converted += 2;
                }else if(l == 'D' || l == 'E' || l == 'F'){
                    converted += 3;
                }else if(l == 'G' || l == 'H' || l == 'I'){
                    converted += 4;
                }else if(l == 'J' || l == 'K' || l == 'L'){
                    converted += 5;
                }else if(l == 'M' || l == 'N' || l == 'O'){
                    converted += 6;
                }else if(l == 'P' || l == 'Q' || l == 'R' || l == 'S'){
                    converted += 7;
                }else if(l == 'T' || l == 'U' || l == 'V'){
                    converted += 8;
                }else if(l == 'W' || l == 'X' || l == 'Y' || l == 'Z'){
                    converted += 9;
                }
            }
        }
        return converted;

    }

}
