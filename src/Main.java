import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int zmiennaInt = 7;
        System.out.println("zmienna int = " + zmiennaInt);
        /* ćw.2 */
        int zmienna1 = 16;
        String imie1 = "Piotr";
        double wiek = 27.11;
        boolean zmiennaBoolean = true;

        /*   zad.1 zadeklaruj i zainicjalizuj zmienne różnych typów i wyświetl w konsoli (im więcej tym lepiej ;) ) */
        System.out.println(imie1);
        System.out.println(zmienna1);
        System.out.println(wiek);
        System.out.print(zmiennaBoolean);

        /*
         *    zad.2 Napisz kod który będzie wykonywał operacje: dodawania, odejmowania,
         *    mnożenia, dziealenia i modulo na zmiennych:
         *    a) liczbaA i liczbaB, dowolne liczby calkowite (int),
         *    b) liczbaX i liczbaY, dowolne liczby zmiennoprzecinkowe (double)
         *  */


        //cw2

        int liczbaA = 7;
        int liczbaB = 10;

        double liczbaX = 12.5;
        double liczbaY = 20.3;


        System.out.println(liczbaA + liczbaB);
        System.out.println(liczbaA - liczbaB);
        System.out.println(liczbaA * liczbaB);
        System.out.println(liczbaA/liczbaB);
        System.out.println(liczbaB%liczbaA);

        System.out.println(liczbaX + liczbaY);
        System.out.println(liczbaX - liczbaY);
        System.out.println(liczbaX * liczbaY);
        System.out.println(liczbaY/liczbaX);
        System.out.println(liczbaY%liczbaX);


    }
}