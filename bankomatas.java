import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    
    int pinigaiBankomate = 500;

        System.out.println("Iveskite PIN koda:");
        String kodas = scanner.next();
        int bandymuSkaicius = 1;
        while (!kodas.equals("testas") && bandymuSkaicius < 3) {
            System.out.println("Iveskite PIN koda:");
            kodas = scanner.next();
            bandymuSkaicius++;
        }

        if (bandymuSkaicius == 3) {
            System.out.println("Tris kartus neteisingai ivedete PIN. Saskaita uzblokuota.");
            return;
        }

        System.out.println("Sekmingai prisijungete!");

        System.out.println("Pasirinkite, ka norite daryti:\n1 - isgryninti pinigu, 2 - baigti darba");
        int pasirinkimas = scanner.nextInt();

        while (pinigaiBankomate >= 10) {
            if (pasirinkimas == 2) {
                System.out.println("Darbas baigtas");
                return;
            }
            else {
                System.out.println("Kiek pinigu norite issigryninti?");
                int pinigaiIssigryninimui = scanner.nextInt();
                while (pinigaiIssigryninimui > pinigaiBankomate) {
                    System.out.println("Bankomate nera tiek pinigu, pasirinkite mazesne suma.\nKiek pinigu norite issigryninti?");
                    pinigaiIssigryninimui = scanner.nextInt();
                }

                pinigaiBankomate = pinigaiBankomate - pinigaiIssigryninimui;
                System.out.println("Pinigai isgryninti");
            }

            System.out.println("Pasirinkite, ka norite daryti:\n1 - isgryninti pinigu, 2 - baigti darba");
            pasirinkimas = scanner.nextInt();
        }

        if (pinigaiBankomate < 10) {
            System.out.println("Bankomate nebera pinigu.");
            return;
        }
    }
}
