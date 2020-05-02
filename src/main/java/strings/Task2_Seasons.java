package strings;

public class Task2_Seasons {

    public static void main(String[] args) {
        System.out.println(seasons("autumn"));
    }

    public static String seasons(String str) {
        if (str == null) {
            return null;
        }

        String res = "";

        if (str == "summer") {
            res = "it's hot there";
        } else if (str == "autumn") {
            res = "it rains there";
        } else if (str == "winter") {
            res = "it's cold there";
        } else if (str == "spring") {
            res = "there are many flowers";
        }

        return res;
    }
}


