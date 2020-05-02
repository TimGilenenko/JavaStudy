package strings;

public class Task1_InvertString {

    public static void main(String[] args) {
        System.out.println(invertString0("123"));
        System.out.println(invertString1("123456"));
    }

    public static String invertString0(String str0) {
        if (str0 == null) {
            return null;
        }

        String res = "";

        for(int i = 0;i <= str0.length() - 1;i++){
            res = str0.substring(i,i + 1) + res;
        }
        str0 = res;
        return str0;
    }

    public static String invertString1(String str1) {
        if (str1 == null) {
            return null;
        }

        String res = "";

        for(int i = str1.length() - 1;i >= 0;i--){
            res = res + str1.charAt(i);
        }
        str1 = res;
        return str1;
    }
}
