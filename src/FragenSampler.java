import java.io.*;
import java.util.*;

class FragenSampler {

    public static void main(String name, String[] args, int eingabe) throws IOException {

        String begin = "src/fragen_";
        String endung = ".txt";
        String path="";

        //Zuweisung für den FileReader
        if (eingabe == 1)
        {
            //Pfad
            path = begin+"geographie"+endung;
        } else if (eingabe == 2)
        {
            //Pfad
            path = begin+"sport"+endung;
        }

        FileReader fr = new FileReader(path);
        BufferedReader br = new BufferedReader(fr);
        String zeile_x = "0";
        int richtig = 0;
        int falsch = 0;
        int anzahlfragen = 0;
        int auswahl;
        Scanner scanner = new Scanner(System.in);


        //Fragen werden ausgewählt (je nach "path") und ausgegeben, sowie ausgewertet.

        while (!zeile_x.equals("###")) {
            zeile_x = br.readLine();
            if (zeile_x.equals("###")) {
                anzahlfragen = richtig + falsch;

                do {
                    System.out.println("\n" + name + " du hast von " + anzahlfragen + " Fragen " + richtig + " Fragen korrekt beantwortet.\n");
                    System.out.println("Was möchtest du jetzt tun?\n \n Dieses Themengebiet erneut bearbeiten(1) \n Zurück zum Menü(2)");
                    //Scanner scanner = new Scanner(System.in);
                    auswahl = scanner.nextInt();
                    if (auswahl == 1) {
                        FragenSampler.main(name,args,eingabe);
                    } else if (auswahl == 2) {
                        Menue.main(args,name);
                    }
                } while (auswahl != 1 || auswahl != 2);

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

            System.out.print("Deine Antwort: ");
            String eingabeantwort = scanner.next();


            if (eingabeantwort.equals(antwort)) {
                System.out.println("Das ist richtig!");
                richtig++;
            } else if (!eingabeantwort.equals(antwort)) {
                System.out.println("Das ist leider falsch.");
                falsch++;
            }
        }

        br.close();
    }


}