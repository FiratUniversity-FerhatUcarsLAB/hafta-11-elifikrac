public class Exercise4_1 {

    // American format: Monday, July 22, 2019
    public static void printAmerican(String day, int date, String month, int year) {
        System.out.println(day + ", " + month + " " + date + ", " + year);
    }

    // European format: 22 July 2019, Monday
    public static void printEuropean(String day, int date, String month, int year) {
        System.out.println(date + " " + month + " " + year + ", " + day);
    }

    public static void main(String[] args) {
        // Burada sabit degerler kullandim; istersen Scanner ile kullanicidan da alabilirsin.
        String day = "Monday";
        String month = "July";
        int date = 22;
        int year = 2019;

        System.out.println("American format:");
        printAmerican(day, date, month, year);

        System.out.println("European format:");
        printEuropean(day, date, month, year);
    }
}
