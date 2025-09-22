import java.util.Random;
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

        //instrukcja warunkowa
        if(wylosowanaLiczba == zgadywanaLiczba){
            System.out.println("Brawo");
        }else{
            System.out.println("Moze nastepnym razem");
        }
        int roznica;
        if(wylosowanaLiczba>zgadywanaLiczba){
            roznica = wylosowanaLiczba - zgadywanaLiczba;
        }else{
            roznica = zgadywanaLiczba - wylosowanaLiczba;
        }
        //wyrazenie warunkowe -> zwraca wartosc
        roznica = zgadywanaLiczba > wylosowanaLiczba? zgadywanaLiczba - wylosowanaLiczba : wylosowanaLiczba - zgadywanaLiczba;
        roznica = roznica/10; //dzielenie całkowite -> wynik całkowite bo dzielimy dwie liczby całkowite

        //instrukcja wyboru
        switch (roznica){
            case 0:
                System.out.println("bardzo blisko");
                break;
            case 1:
                System.out.println("dosc blisko");
                break;
            case 3:
                System.out.println("nie najgorzej");
                break;
            default:
                System.out.println("Sprobuj innym razem");
        }

        //wyrazenie switch
        //zwraca wartosc
        System.out.println(
                switch (roznica){
                    case 0 -> "Bardzo blisko";
                    case 1 -> "dosc blisko";
                    case 2 -> "nie najgorzej";
                    default -> "sprobuj innym razem";
                }
        );
        //zgadywanie 10 razy
        Random random = new Random();
        wylosowanaLiczba = random.nextInt(1,101);

        for (int i = 0; i < 10; i++) {
            //dla każdego
            System.out.println("Zgadnij liczbe");
            zgadywanaLiczba = scanner.nextInt();
            if(zgadywanaLiczba == wylosowanaLiczba){
                System.out.println("Gratulacje, to jest ta liczba");
                break;
            }
            if(zgadywanaLiczba>wylosowanaLiczba){
                System.out.println("Wpisano za duzo");
            }else{
                System.out.println("Wpisano za malo");

            }
        }
        //zgadnij licbze ->
        //dopóki nie zgadniesz to krązymy w pętli
        wylosowanaLiczba = random.nextInt(1,101);
        System.out.println("Uwaga, losowanie nowej liczby z zakresu 1,100");
        System.out.println("Podaj liczbę");
        zgadywanaLiczba = scanner.nextInt();
        while (wylosowanaLiczba != zgadywanaLiczba){
            if(zgadywanaLiczba>wylosowanaLiczba){
                System.out.println("Wpisano za duzo");
            }else{
                System.out.println("Wpisano za malo");
            }
            System.out.println("Podaj liczbę");
            zgadywanaLiczba = scanner.nextInt();
        }
        System.out.println("Kolejna gra, losujemy nową liczbę");
        wylosowanaLiczba = random.nextInt(1,101);
        //dry = dont repeat yourself
        do{
            System.out.println("Podaj liczbę");
            zgadywanaLiczba = scanner.nextInt();
            if(zgadywanaLiczba != wylosowanaLiczba){
                if(zgadywanaLiczba>wylosowanaLiczba){
                    System.out.println("Wpisano za duzo");
                }else{
                    System.out.println("Wpisano za malo");
                }
            }

        } while (zgadywanaLiczba != wylosowanaLiczba);

    }
}