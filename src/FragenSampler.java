import java.io.*;
import java.util.*;

class FragenSampler {

    public static void main(String name, String[] args, int eingabe, int anzahl) throws IOException {

        String begin = "src/fragen_";
        String endung = ".txt";
        String path = "";

        //Zuweisung für den FileReader
        if (eingabe == 1) {
            //Pfad
            path = begin + "geographie" + endung;
        } else if (eingabe == 2) {
            //Pfad
            path = begin + "sport" + endung;
        } else if (eingabe == 3) {
            //TODO: Zufallsmodus!!!
        }

        FileReader fr = new FileReader(path);
        BufferedReader br = new BufferedReader(fr);
        String zeile_x = "0";
        int richtig = 0;
        int falsch = 0;
        int anzahlfragen = 0;
        int auswahl;
        Scanner scanner = new Scanner(System.in);


        while (!zeile_x.equals("###")) {
            zeile_x = br.readLine();


            if (zeile_x.equals("###") || anzahl == 0) {
                anzahlfragen = richtig + falsch;

                do {
                    System.out.println(name + " du hast von " + anzahlfragen + " Fragen " + richtig + " Fragen korrekt beantwortet.\n");
                    System.out.println("Was möchtest du jetzt tun? \n Zurück zum Menü(1)");
                    auswahl = scanner.nextInt();

                    if (auswahl == 1) {
                        Menue.main(args, name);
                    }

                } while (auswahl != 1);
            }


            System.out.println();
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

            System.out.print("Deine Antwort: ");
            String eingabeantwort = scanner.next();


            if (eingabeantwort.equals(antwort)) {
                System.out.println("Das ist richtig!");
                richtig++;
                anzahl--;
            } else if (!eingabeantwort.equals(antwort)) {
                System.out.println("Das ist leider falsch.");
                falsch++;
                anzahl--;
            }
        }
        br.close();
    }
}

