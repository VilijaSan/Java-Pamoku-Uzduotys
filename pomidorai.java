//Parašyti programą, kuri prašys vartotojo įvesti pomidorų kiekį nuo 1 iki 10. Tada bus sugeneruojamas
//vienas prinokęs pomidoras atsitiktinėje vietoje(naudojame Random).
//Nokstantys pomidorai prinokina šalia esantį pomidorą per 1 dieną.
//Kiek dienų prireiks norint sunokinti visus pomidorus?

import java.util.*;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Iveskite pomidoru kieki nuo 1 iki 10:");
        int pomidoruKiekis = new Scanner(System.in).nextInt();
        while (pomidoruKiekis < 1 || pomidoruKiekis > 10) {
            System.out.println("Iveskite pomidoru kieki nuo 1 iki 10:");
            pomidoruKiekis = new Scanner(System.in).nextInt();
        }

        int atsitiktinisPomidoras = sugeneruokAtsitiktiniSveikaSkaiciuReziuose(1, pomidoruKiekis);
        System.out.println("Pirmas sunoko " + atsitiktinisPomidoras + " pomidoras");

        int pomidoraiKairej = atsitiktinisPomidoras - 1;
        int pomidoraiDesinej = pomidoruKiekis - 1 - pomidoraiKairej;
        int dienos;

        if (pomidoraiKairej > pomidoraiDesinej) {
            dienos = pomidoraiKairej;
        } else if (pomidoraiDesinej > pomidoraiKairej) {
            dienos = pomidoraiDesinej;
        }
        else {
            dienos = pomidoraiKairej;
        }

        System.out.println("Reikes " + dienos + " dienu visiem pomidoram sunokti");
    }

    public static int sugeneruokAtsitiktiniSveikaSkaiciuReziuose(int min, int max) {
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }
}
