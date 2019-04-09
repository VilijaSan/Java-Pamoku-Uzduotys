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
}
