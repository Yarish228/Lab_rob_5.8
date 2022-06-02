package One;

public class Main {
    public static void main(String[] args) {
        int n = 30;
        if (n > 50) {
            if (n < 100) {
                System.out.println("Число " + n + " є на проміжку (50;100)");
            }
        }
        if (n < 50) {
            System.out.println("Число " + n + " відсутнє на проміжку (50;100)");
        }
        if (n > 100) {
            System.out.println("Число " + n + " відсутнє на проміжку (50;100)");
        }
    }
}