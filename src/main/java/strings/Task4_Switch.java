package strings;

public class Task4_Switch {

    public static void main(String[] args) {
        System.out.println(price(1));
    }

    public static String price(Integer integer) {
        if (integer == null) {
            return null;
        }

        String res = "";

        switch (integer) {
            case 1:
                res = "Великий";
                break;
            case 2:
                res = "Вказівний";
                break;
            case 3:
                res = "Середній";
                break;
            case 4:
                res = "Безіменний";
                break;
            case 5:
                res = "Мізинець";
                break;
            default:
                res = "У людини 5 пальців";
        }

        return res;
    }
}

























