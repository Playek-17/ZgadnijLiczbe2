import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //wypisz wszystkie liczby dwucyfrowe parzyste
        System.out.println("Liczby dwucyfrowe parzyste: ");
        for(int i = 10; i < 100; i = i + 2){
            System.out.print(i+ " ");
        }
        System.out.println();

        //zapytaj uzytkownika ile chce gwiazdek i tyle mu wypisz

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ile chcesz gwiazdek?");
        int liczbaGwiazdek = scanner.nextInt();
        for (int i = 0; i < liczbaGwiazdek; i++){
            System.out.print("* ");
        }
        System.out.println();

        //popros uzytkownika o zero i wczytuj liczby tak dlugo az bedzie zero
        int liczbaWpisana;
        do{
            System.out.println("Podaj zero");
            liczbaWpisana = scanner.nextInt();
        } while(liczbaWpisana !=0);

        //obliz sume wszystkich liczb od a do b
        //a i b wczytane z klawiatury
        int liczbaA;
        int liczbaB;
        int wynik = 0;
        System.out.println("Podaj liczbeA");
        liczbaA = scanner.nextInt();
        System.out.println("Podaj liczbeB");
        liczbaB = scanner.nextInt();

        if(liczbaA < liczbaB){
            for(int i = liczbaA; i <= liczbaB; i++){
                wynik = wynik + i;

            }
        }else{
            for(int i = liczbaA; i >= liczbaB; i--){
                wynik = wynik + i;

            }
        }

        System.out.println(wynik);

    }
}
