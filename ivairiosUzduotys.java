import java.util.*;

public class Main {
    public static void main(String[] args) {
    
        //Suskaičiuoti, kiek stringe raidžių a, b, c, A, B, C

        String tekstas = "labasClabasA";
        int tinkamosRaides = 0;
        for (int i = 0; i < tekstas.length(); i++) {
            if (tekstas.charAt(i) >= 97 && tekstas.charAt(i) <= 99 || tekstas.charAt(i) >= 65 && tekstas.charAt(i) <= 67) {
                tinkamosRaides++;
            }
        }
        System.out.println(tinkamosRaides);
        
        
        //Turime keturženklį skaičių, pvz.: 7135. Atskirkite visus skaitmenis į atskirus kintamuosius.
        
        int keturzenklis = 7135;

        int pirmasSkaitmuo = keturzenklis / 1000;
        int antrasSkaitmuo = keturzenklis % 1000 / 100;
        int treciasSkaitmuo = keturzenklis % 1000 % 100 / 10;
        int ketvirtasSkaitmuo = keturzenklis % 1000 % 100 % 10;

        System.out.println(pirmasSkaitmuo + " " + antrasSkaitmuo + " " + treciasSkaitmuo + " " + ketvirtasSkaitmuo);
        
        
        //Panaudodami masyvą arba listą atvaizduojame 100 vnt. atsitiktinai sugeneruotų skaičių
        //nuo 1 iki 1000, kurie dalinasi iš 4.

        List<Integer> skaiciuSarasas = new ArrayList<>();
        int ivestasSkaicius;

        while (skaiciuSarasas.size() < 100) {
            ivestasSkaicius = sugeneruokAtsitiktiniSveikaSkaiciuReziuose(1, 1000);
            if (ivestasSkaicius % 4 == 0) {
                skaiciuSarasas.add(ivestasSkaicius);
            }
        }
        System.out.println(skaiciuSarasas);
        
        
        //Prašome įvesti du skaičius. Abu skaičiai privalo būti dviženkliai.
        //Spausdiname visus skaičius tarp jų pagal tokią sąlygą: jeigu skaičius dalinasi iš 3, praleidžiame sekantį skaičių.

        System.out.println("Iveskite pirma dvizenkli skaiciu");
        int pirmasSkaicius = scanner.nextInt();
        while (pirmasSkaicius < 10 || pirmasSkaicius > 99) {
            System.out.println("Iveskite dvizenkli skaiciu");
            pirmasSkaicius = scanner.nextInt();
        }

        System.out.println("Iveskite antra dvizenkli skaiciu");
        int antrasSkaicius = scanner.nextInt();
        while (antrasSkaicius < 10 || antrasSkaicius > 99) {
            System.out.println("Iveskite dvizenkli skaiciu");
            antrasSkaicius = scanner.nextInt();
        }

        for (int i = pirmasSkaicius; i <= antrasSkaicius; i++) {
            System.out.print(i + " ");
            if (i % 3 == 0) {
                i++;
            }
        }
        
        
        //Turime masyvą iš 4 elementų(1, 5, 7, 10 ). Surasti skaičius, kurių suma yra lygi 12 bei
        //atspausdinti tų skaičių indeksus(šiuo atveju turėtų būti 1 ir 2 ).

        int[] masyvas = {1, 5, 7, 10};
        int skaiciuSuma;
        int reikiamaSuma = 12;

        for (int i = 0; i < masyvas.length; i++) {
            for (int j = masyvas.length - 1; j > i; j--) {
                skaiciuSuma = masyvas[i] + masyvas[j];
                if (skaiciuSuma == reikiamaSuma) {
                    System.out.println(i + " " + j);
                }
            }
        }
   }
   
   
   //Sukurti metodą, kuri skaitytų sveikus skaičius nuo 0 iki 10 iki tol, kol bus įvestas -1 ir tada
   //atspausdintų kiek kokių skaičių buvo įvesta.

    public static void skaitykSkaiciusIrAtspausdinkKiekKokiu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Iveskite skaiciu nuo 0 iki 10, arba, jei norite baigti, iveskite -1:");

        List<Integer> skaiciai = new ArrayList<Integer>();
        int skaicius = scanner.nextInt();
        if (skaicius != -1 && skaicius > -1 && skaicius < 10) {
            skaiciai.add(skaicius);
        }

        while (skaicius != -1) {
            skaicius = scanner.nextInt();
            if (skaicius > -1 && skaicius < 10) {
                skaiciai.add(skaicius);
            }
        }

        for (int i = 0; i <= 10; i++) {
            System.out.println(i + ": " + Collections.frequency(skaiciai, i));
        }

        System.out.println(skaiciai);
    }
    
    
    public static int sugeneruokAtsitiktiniSveikaSkaiciuReziuose(int min, int max) {
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }
}
