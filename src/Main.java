import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw.5 */

        /* zad.1 podziel swój wiek przez modulo 3 i jeśli twój wiek zwraca 0 wyświetl napis "Podzielny przez 3",
         * w innym wypadku "Niepodzielny przez 3" użyj kontrukcji if else
         * */

        int wiek = 29;
        if(wiek%3==0) {
            System.out.println("Podzielny przez 3");
        } else {
            System.out.println("Niepodzielny przez 3");
        }


        /* zad.2 użyj parametru trójargumentowego aby sprawdzić parzystośc nr. indeksu */

        int nrIndex = 56577;
        int czyParzysty = (nrIndex % 2 == 0) ? 0 : 1 ;
        System.out.println("3) Czy parzysty : " + czyParzysty);

        /* zad.3 wpisz z klawiatury liczbę zmiennoprzecinkową (użyj klasy Scanner z poprzednich ćwiczeń)
         * i stwórz konstrukcję else if z dowolnymi komunikatami */

        Scanner scan = new Scanner(System.in);
        System.out.print("Podaj ile masz złotych aby kupić coca cole za 5 zł: ");
        double kasa = scan.nextDouble();

        if (kasa < 5 )
        {
            System.out.println(" Zbyt malo pieniędzy na cole");
        }else if(kasa == 5) {
            System.out.println("Masz idealnie na jedna butelke coca coli");

        }else if (kasa > 5) {
            System.out.println("Możesz kupić więcej niż tylko butelke coca coli");
        }

    }
}
