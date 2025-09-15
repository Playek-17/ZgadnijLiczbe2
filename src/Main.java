import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //tu program glowny
        System.out.println("Dzień dobry");

        //typy proste
        //pisane z malej litery, zmienne a nie obiekt -> nie mają pól i metod
        //typy calkowite
        byte liczba1 = 100;
        short liczba2 = 300;
        int liczba3 = 1234567;
        long liczba4 = 123456789;
        System.out.println("twoja liczba: "+liczba1);

        //typy zmiennoprzecinkowe, rzeczywiste, z ułamkiem
        float liczbaRzeczywista1 = 3.14f; //musi byc na koncu f
        double liczbaRzeczywista2 = 23.456789;
        System.out.println("Liczba rzeczywista: "+ liczbaRzeczywista2);

        //typ logiczny
        boolean czyPrawda = true; //moze byc tez false

        //typ znakowy
        char znak = 'a';

        /*
        Napisz program w ktorym wylosujesz liczbe z zakresu od 1 do 100
        Wpiszesz liczbe z klawiatury
        Powiesz czy ktoś zgadł wylosowaną liczbe
        */
        int wylosowanaLiczba = (int) (Math.random()*100)+1;
        System.out.println("Wylosowano: "+wylosowanaLiczba);

        //wczytywanie liczby z klawiatury
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe: ");
        int zgadywanaLiczba = scanner.nextInt();
        System.out.println("Wpisano: "+zgadywanaLiczba);


    }
}