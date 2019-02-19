import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

class FragenGeo {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("src/fragen_geographie.txt");
        BufferedReader br = new BufferedReader(fr);
        String zeile_x = "0";
        int richtig = 0;
        int falsch = 0;
        int anzahlfragen = 0;
        int auswahl;
        Scanner scanner = new Scanner(System.in);

        while (!zeile_x.equals("###")) {
            zeile_x = br.readLine();
            if (zeile_x.equals("###"))
            {
                anzahlfragen=richtig+falsch;

                do{
                    System.out.println("Du hast von " + anzahlfragen + " Fragen " + richtig + " Fragen korrekt beantwortet.\n");
                    System.out.println("Was möchtest du jetzt tun?\n \n Dieses Themengebiet erneut bearbeiten(1) \n Zurück zur Auswahl(2)");
                    Scanner eingabe = new Scanner(System.in);
                    auswahl = eingabe.nextInt();
                    if (auswahl == 1)
                    {
                        FragenGeo.main(args);
                    }else if (auswahl == 2)
                    {
                        Menue.menue(args);
                    }
                }while(auswahl!=1 || auswahl!=2);

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
            String eingabe = scanner.next();


            if (eingabe.equals(antwort)) {
                System.out.println("Das ist richtig!");
                richtig++;
            }  else if (!eingabe.equals(antwort))
            {
                System.out.println("Das ist leider falsch.");
                falsch++;
            }
        }

        br.close();
    }
}