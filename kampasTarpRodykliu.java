import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double kampas = paskaiciuokKampaTarpLaikrodzioRodykliu(12, 15);
        System.out.println(kampas);
    }

    public static double paskaiciuokKampaTarpLaikrodzioRodykliu(int valanda, int minutes) {
        Scanner scanner = new Scanner(System.in);
        while (valanda < 0 || valanda > 12) {
            System.out.println("Iveskite valandas (nuo 0 iki 12):");
            valanda = scanner.nextInt();
        }
        while (minutes < 0 || minutes > 60) {
            System.out.println("Iveskite minutes (nuo 0 iki 60):");
            minutes = scanner.nextInt();
        }

        double valandinesKampas = minutes * 0.5 + valanda * 30;
        double minutesKampas = minutes * 6;
        double kampas = valandinesKampas - minutesKampas;

        if (kampas < 0) {
            kampas = kampas * -1;
        }

        if (kampas > 180) {
            kampas = 360 - kampas;
        }

        return kampas;
    }
}
