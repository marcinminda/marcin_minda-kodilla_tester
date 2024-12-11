public class LeapYear {
    public static void main(String[] args) {
        int rok = 2024;

        System.out.println("Czy rok ");
        System.out.println(rok);
        System.out.println("jest przestepny?");
        System.out.println(takNie(rok));
    }


    public static boolean czyPrzestepny(int rok) {
        if (rok % 4 == 0) {
            if (rok % 100 == 0) {
                return rok % 400 == 0;
            } else {
                return true;
            }
        }
        return false;
    }

    // Metoda zwracająca "tak" lub "nie"
    public static String takNie(int rok) {
        if (czyPrzestepny(rok)) {
            return "tak";
        } else {
            return "nie";
        }
    }
}
