import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Menue.menue(args);//Menüaufruf
    }
}

class Menue {

    public static void menue(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Herzlich Willkommen zu unserem Quiz."); //TODO: Auslagern der Namensfeststellung, damit man nicht immer den Namen neu eingeben muss, sobald man beim Themengebiet auf "zurück" geht. Damit will man ja nur das Menü neu aufrufen und nicht nochmal seinen Namen eingeben!
        System.out.println("Verrate uns doch noch deinen Namen: ");
        String username = scanner.next();

        System.out.println("Hallo " + username + ", was möchtest du machen? \n Quiz starten(1)  Hilfe(2)");
        int auswahl;

        do {
            auswahl = scanner.nextInt();

            if (auswahl == 1) {

                System.out.println("Welches Themengebiet möchtest du bearbeiten? \n Geographie(1)  zurück(2)");
                int eingabe = scanner.nextInt();
                if (eingabe == 1) {
                    FragenGeo.main(args);
                } else if (eingabe == 2) {
                    Menue.menue(args);
                }


            } else if (auswahl == 2) {
                Hilfe.main(args);
            } else {
                System.out.println("Bitte geben sie 1 oder 2 ein!");

            }
        } while (auswahl != 1 || auswahl != 2);
    }

}

//Die Fragen der einzelnen Themenbereiche (Themenquiz)

class FragenGeo {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("src/geo_fragen2.txt");
        BufferedReader br = new BufferedReader(fr);
        String zeile_x = "0";
        int richtig = 0;
        int falsch = 0;
        int anzahlfragen = 0;
        Scanner scanner = new Scanner(System.in);

        while (!zeile_x.equals("###")) {
            zeile_x = br.readLine();
            if (zeile_x.equals("###"))
            {
                anzahlfragen=richtig+falsch;
                System.out.println("Du hast von " + anzahlfragen + " Fragen " + richtig + " Fragen korrekt beantwortet.");
                System.out.println("");
                System.out.println("Was möchtest du jetzt tun? \n Dieses Themengebiet erneut bearbeiten(1) \n Zurück zur Auswahl(2)");
                Scanner eingabe = new Scanner(System.in);
                int auswahl = eingabe.nextInt();

                if (auswahl == 1)
                {
                    FragenGeo.main(args);
                }else if(auswahl==2)
                {
                    Menue.menue(args);
                }
                //break;
            }
            System.out.println("");
            System.out.println(zeile_x);
            zeile_x = br.readLine();
            System.out.println(zeile_x);
            zeile_x = br.readLine();
            System.out.println(zeile_x);
            zeile_x = br.readLine();
            System.out.println(zeile_x);
            zeile_x = br.readLine();
            System.out.println(zeile_x);
            String antwort = br.readLine();

            System.out.println("Deine Antwort: ");
            String eingabe = scanner.nextLine();

            if (eingabe.equals(antwort)) {
                System.out.println("Das ist richtig!");
                richtig++;
            } else if (eingabe.equals("")) {
                System.out.println("Keine Antwort ist auch eine Antwort. Diese Frage ist falsch beantwortet.");
                falsch++;
            } else if (!eingabe.equals(antwort))
            {
                System.out.println("Das ist leider falsch.");
                falsch++;
            }
        }

        br.close();
    }
}

// Die Anleitung
class Hilfe {
    public static void main(String[] args) throws IOException {
        FileReader freader = new FileReader("src/anleitung");
        BufferedReader breader = new BufferedReader(freader);

        String zeile = "";

        while ((zeile = breader.readLine()) != null) {
            System.out.println(zeile);
        }

        System.out.println("");
        System.out.println("Deine weiteren Optionen. Bitte eine der Optionen eingeben und mit Enter bestätigen.");
        System.out.println("(1) zurück");
        Scanner eingabe = new Scanner(System.in);
        int option = eingabe.nextInt();

        if (option == 1) {
            Menue.menue(args);
        } else if (option != 1)

            System.out.println("Diese Option ist nicht verfügbar!");
        Hilfe.main(args);
        breader.close();
    }
}