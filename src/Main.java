import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Poodaj Imie: ");
        String imie = scan.next();

        System.out.print("Poodaj Nazwisko: ");
        String nazwisko = scan.next();

        System.out.print("wiek: ");
        int wiek = scan.nextInt();

        System.out.print("Podaj nr indeksu: ");
        int nrIndexu = scan.nextInt();


        System.out.println("wiek: "+ wiek);

        System.out.printf("%s ,%s ", imie , nazwisko);
        System.out.println("wiek: "+ wiek);
        System.out.println("nr indeksu: "+nrIndexu);


        /*  zad.2 zadeklarować 2 zmienne typu int i wykonać na nich obliczenia arytmetyczn (+, -, *, /, %)
         *   wynik wyświetlić w konsoli programu
         */

        System.out.print("podaj pierwsza liczbe: ");
        int liczba1 = scan.nextInt();

        System.out.print("Podaj druga liczbe: ");
        int liczba2 = scan.nextInt();



        System.out.println(liczba1+liczba2);
        System.out.println(liczba1 - liczba2);
        System.out.println(liczba1 * liczba2);
        System.out.println(liczba2/liczba1);
        System.out.println(liczba1%liczba2);
        System.out.println(liczba1%liczba2);


    }
}
