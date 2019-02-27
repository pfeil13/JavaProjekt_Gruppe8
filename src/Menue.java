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
        System.out.println("Hallo " + name + ", was möchtest du machen? \n Quiz starten(1) \n Frageneditor(2) \n Hilfe(3)");
        int auswahl;
        int anzahl;

        do {
            auswahl = scanner.nextInt();

            if (auswahl == 1) {
                System.out.println("Welches Themengebiet möchtest du bearbeiten? \n Geographie(1) \n Sport(2) \n Zufallsmodus(3) \n zurück(4)");
                int eingabe = scanner.nextInt();
                if (eingabe == 1) {
                    System.out.println("Wie viele Fragen möchtest du beantworten, " + name + "?");
                    anzahl = scanner.nextInt();
                    if (anzahl == 25) {
                        System.out.println("Gut, es werden alle Fragen des Katalogs gestellt!");
                        FragenSampler.main(name, args, eingabe, anzahl);
                    } else if (anzahl > 25) {
                        System.out.println("So viele Fragen gibt es in diesem Katalog nicht! Es werden daher einfach alle 25 gestellt!");
                        FragenSampler.main(name, args, eingabe, anzahl);
                    } else if (anzahl < 25) {
                        System.out.println("Gut, es werden " + anzahl + " Fragen gestellt.");
                        FragenSampler.main(name, args, eingabe, anzahl);
                    }
                } else if (eingabe == 2) {
                    System.out.println("Wie viele Fragen möchtest du beantworten, " + name + "?");
                    anzahl = scanner.nextInt();
                    if (anzahl == 25) {
                        System.out.println("Gut, es werden alle Fragen des Katalogs gestellt!");
                        FragenSampler.main(name, args, eingabe, anzahl);
                    } else if (anzahl > 25) {
                        System.out.println("So viele Fragen gibt es in diesem Katalog nicht! Es werden daher einfach alle 25 gestellt!");
                        FragenSampler.main(name, args, eingabe, anzahl);
                    } else if (anzahl < 25) {
                        System.out.println("Gut, es werden " + anzahl + " Fragen gestellt.");
                        FragenSampler.main(name, args, eingabe, anzahl);
                    }

                } else if (eingabe == 3) {

                    //Zufallsmodus
                    //TODO: Zufallsmodus

                    /*
                    if (eingabe == 1) {
                    System.out.println("Wie viele Fragen möchtest du beantworten, " + name + "?");
                    anzahl = scanner.nextInt();
                    if (anzahl == 25) {
                        System.out.println("Gut, es werden alle Fragen des Katalogs gestellt!");
                        FragenSampler.main(name, args, eingabe, anzahl);
                    } else if (anzahl > 25) {
                        System.out.println("So viele Fragen gibt es in diesem Katalog nicht! Es werden daher einfach alle 25 gestellt!");
                        FragenSampler.main(name, args, eingabe, anzahl);
                    } else if (anzahl < 25) {
                        System.out.println("Gut, es werden " + anzahl + " Fragen gestellt.");
                        FragenSampler.main(name, args, eingabe, anzahl);
                    }
                }*/

                } else if (eingabe == 4) {
                    Menue.main(args, name);
                }


            } else if (auswahl == 2) {
                //Frageneditor
            } else if (auswahl == 3) {
                Hilfe.main(name, args);
            } else {
                System.out.println("Bitte geben sie 1 oder 2 ein!");
            }
        } while (auswahl != 1 || auswahl != 2);
    }
}