import java.util.*;
import java.io.*;

public class WriteCatalog { //TODO: BUG! Er soll die vom Nutzer angegebenen Fragen untereinander speichern - nicht überschreiben!
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String eingabe;
        int anzahl;
        FileWriter fw = new FileWriter("src/user_catalog.txt");
        BufferedWriter bw = new BufferedWriter(fw);

        //FileReader fr = new FileReader("src/user_catalog.txt");
        //BufferedReader br = new BufferedReader(fr);

        System.out.println("Wie viele Fragen wollen Sie eingeben?");
        anzahl = scanner.nextInt();


        /*
        do {
            System.out.println("Du kannst maxmial 25 Fragen eingeben. Wie viel möchtest du eingeben: ");
            anzahl = scanner.nextInt();

            while (anzahl <= 25) { //TODO: BUG! "Frage eingeben" und "Antwort 1" werden aufeinmal ausgegeben!
                System.out.println("Geben Sie EINE Frage ein: ");
                eingabe = scanner.nextLine();
                bw.write(eingabe);
                bw.newLine();

                System.out.println("Geben Sie Antwortmöglichkeit 1 ein: ");
                eingabe = scanner.nextLine();
                bw.write("1) " + eingabe);
                bw.newLine();

                System.out.println("Geben Sie Antwortmöglichkeit 2 ein: ");
                eingabe = scanner.nextLine();
                bw.write("2) " + eingabe);
                bw.newLine();

                System.out.println("Geben Sie Antwortmöglichkeit 3 ein: ");
                eingabe = scanner.nextLine();
                bw.write("3) " + eingabe);
                bw.newLine();

                System.out.println("Geben Sie Antwortmöglichkeit 4 ein: ");
                eingabe = scanner.nextLine();
                bw.write("4) " + eingabe);
                bw.newLine();

                System.out.println("Nun geben Sie an, welche Antwortmöglichkeit die richtige ist: ");
                eingabe = scanner.nextLine();
                bw.write(eingabe);
                bw.newLine();
                bw.write("###");
            }
            bw.close();
        } while (anzahl > 25);*/
    }
}
