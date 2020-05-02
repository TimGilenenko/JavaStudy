package strings;

public class Task3_Price {

    public static void main(String[] args) {
        System.out.println(price(999));
    }

    public static String price(Integer integer) {
        if (integer == null) {
            return null;
        }

        String res = "";

        if (integer < 1000) {
            res = "ціна нормальна";
        } else {
            res = "Ціна висока";
        }

        return res;
    }
}
