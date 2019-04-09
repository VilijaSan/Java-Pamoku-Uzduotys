//Žaidimui prasidėjus žaidėjas turi 100 pinigų, jo paklausiama ką jis nori daryti: 1 – žaisti, 2 –
//pasiimti turimus ar likusius pinigus ir baigti žaidimą/programą.
//Žaidėjui nusprendus žaisti jo paprašoma įvesti statymo sumą min – 5, max – 20 pinigų.
//Turi būti tikrinimas ar įvedėte teisingą sumą ir statymo suma minusuojasi iš turimų pinigų.
//Pastačius sumą prašoma įvesti skaičių nuo 1 iki 6, tuomet ridenamas kauliukas ir tikrinima ar
//atspėjote skaičių, jei atspėjote suma dauginasi iš 6.
//Žaidimas baigiamas tuomet kai žaidėjas nusprendžia pabaigti žaidimą arba baigiasi pinigai.

import java.util.*;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int turimiPinigai = 100;
        int maxSpejimas = 6;
        int minSpejimas = 1;
        int statymas;

        while (turimiPinigai >= 5) {
            System.out.println("Jus turite " + turimiPinigai);
            System.out.println("Ka norite daryti?");
            System.out.println("1 – žaisti, 2 – pasiimti turimus pinigus ir baigti žaidimą");
            int pasirinkimas = scanner.nextInt();

            if (pasirinkimas == 1) {
                System.out.println("Iveskite statymo suma (nuo 5 iki 20): ");
                statymas = scanner.nextInt();

                while (statymas < 5 || statymas > 20 || statymas > turimiPinigai) {
                    System.out.println("Pastatete neteisinga suma, arba neturite tiek pinigu");
                    System.out.println("Iveskite statymo suma (nuo 5 iki 20): ");
                    statymas = scanner.nextInt();
                }
            } else if (pasirinkimas == 2){
                System.out.println("Zaidimas baigtas, turite " + turimiPinigai);
                break;
            } else {
                System.out.println("Neteisingas pasirinkimas");
                continue;
            }

            turimiPinigai = turimiPinigai - statymas;

            System.out.println("Spekite skaiciu nuo 1 iki 6: ");
            int spejimas = scanner.nextInt();
            while (spejimas < 1 || spejimas > 6) {
                System.out.println("Kauliukas turi sesias sienas. Spekite skaiciu nuo 1 iki 6: ");
                spejimas = scanner.nextInt();
            }

            Random rand = new Random();
            int kauliukoIsridentasSkaicius = rand.nextInt((maxSpejimas - minSpejimas) + 1) + minSpejimas;
            System.out.println("Isridenote " + kauliukoIsridentasSkaicius);

            int laimetaSuma = 0;
            if (spejimas == kauliukoIsridentasSkaicius) {
                laimetaSuma = statymas * 6;
                System.out.println("Atspejote! :)");
            }
            else {
                System.out.println("Neatspejote :(");
            }

            turimiPinigai = turimiPinigai + laimetaSuma;

            if (turimiPinigai < 5) {
                System.out.println("Zaidimas baigtas, turite " + turimiPinigai);
            }
        }
    }
}
