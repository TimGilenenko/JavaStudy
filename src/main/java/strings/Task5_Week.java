package strings;

public class Task5_Week {

    public static void main(String[] args) {
        System.out.println(price("Неділя"));
    }

    public static String price(String str) {
        if (str == null) {
            return null;
        }

        String res = "";

        if(str == "Субота" || str == "Неділя"){
            res = "Сьоголні вихідний";
        } else {
            res = "Сьогодні робочий день";
        }

        return res;
    }
}
