import java.text.DecimalFormat;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        //Prašome vartotojo įdėti atsitiktinį kiekį pinigų, nuo 5 iki 10. Vartotojas įvesdamas skaičių įdeda monetas.
        //(Nominalai gali būti 0.01, 0.02, 0.05, 0.1, 0.2, 0.5, 1, 2 ). Monetas gali dėti tol, kol neįdėtaprašoma suma.
        // Jei įdėta nepakankamai - parašome kiek liko įdėti. Jei įdėta lygiai kiek reikia - parašome "Ačiū!".
        // Jei įdėta per daug - duodame grąžos.
        //P.S. Jei sumuojant gausis dideli skaičiai po kablelio ir nebus galimybės įdėti tiksliai tiek,
        //kad sistema parašytų "Ačiū!", tuomet visus skaičius esančius šiame uždavinyje
        //padauginame iš 100 ir visi kintamieji patampa int.
        

        int kiekPiniguIdeti = sugeneruokAtsitiktiniSveikaSkaiciuReziuose(5, 10);
        System.out.println("Idekite " + kiekPiniguIdeti + " pinigu");

        double piniguSuma = 0;
        double idetaMoneta;

        while (piniguSuma < kiekPiniguIdeti) {
            System.out.println("Dekite monetas:");
            idetaMoneta = scanner.nextDouble();
            if (idetaMoneta != 0.01 && idetaMoneta != 0.02  && idetaMoneta != 0.05 &&
                    idetaMoneta != 0.1 && idetaMoneta != 0.2 && idetaMoneta != 0.5 &&
                    idetaMoneta != 1 && idetaMoneta != 2) {
                System.out.println("Ideta netinkama moneta");
            } else {
                piniguSuma = piniguSuma + idetaMoneta;
            }

            DecimalFormat df = new DecimalFormat("#.##");
            if (piniguSuma < kiekPiniguIdeti) {
                System.out.println("Liko ideti: " + df.format(kiekPiniguIdeti - piniguSuma));
            } else if (piniguSuma == kiekPiniguIdeti) {
                System.out.println("Aciu!");
            } else {
                System.out.println("Jusu graza: " + df.format(piniguSuma - kiekPiniguIdeti));
            }
        }
    }


    public static int sugeneruokAtsitiktiniSveikaSkaiciuReziuose(int min, int max) {
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }
}
