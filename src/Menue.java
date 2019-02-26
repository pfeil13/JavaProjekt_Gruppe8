import java.io.*;
import java.util.*;

class Menue {

    public static void intro(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Herzlich Willkommen zu unserem Quiz.");
        System.out.println("Verrate uns doch noch deinen Namen: ");
        String name = scanner.next();
        Menue.main(args, name);
    }

    public static void main(String[] args, String name) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hallo " + name + ", was möchtest du machen? \n Quiz starten(1)  Hilfe(2)");
        int auswahl;

        do {
            auswahl = scanner.nextInt();

            if (auswahl == 1) {

                System.out.println("Welches Themengebiet möchtest du bearbeiten? \n Geographie(1) \n Sport(2) \n zurück(3)");
                int eingabe = scanner.nextInt();
                if (eingabe == 1) {
                    FragenSampler.main(name, args, eingabe);
                } else if (eingabe == 2) {
                    FragenSampler.main(name,args, eingabe);
                } else if (eingabe == 3)
                {
                    Menue.main(args,name);
                }


            } else if (auswahl == 2) {
                Hilfe.main(name,args);
            } else {
                System.out.println("Bitte geben sie 1 oder 2 ein!");

            }
        } while (auswahl != 1 || auswahl != 2);
    }
}