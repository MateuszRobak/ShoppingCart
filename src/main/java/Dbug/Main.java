package Dbug;

public class Main {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        StringUtilities utils = new StringUtilities();
        while (sb.length() < 10){
            utils.addChar(sb,'a');
        }
        System.out.println(sb);
    }


}
