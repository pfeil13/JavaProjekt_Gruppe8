import java.io.*;
import java.util.*;

public class Main {

    public static void main( String[] args) throws IOException {

        Scanner scanner =new Scanner(System.in);

        System.out.println("Herzlich Willkommen zu unserem Quiz.");
        System.out.println("Verrate uns doch noch deinen Namen: ");
        String name= scanner.next();
        //Menue.intro();
        Menue.menue(name, args);//Menüaufruf



    }
}
//TODO: Eigene Klasse für Menue (also eigenes "Klassendokument"!
class Menue {

    /*public static void intro() throws IOException {//Möglichkeit das intro auch aus der Main rauszubekommen?

        Scanner scanner =new Scanner(System.in);

        System.out.println("Herzlich Willkommen zu unserem Quiz.");
        System.out.println("Verrate uns doch noch deinen Namen: ");
        String name= scanner.next();


    }*/

    public static void menue(String name,String[] args) throws IOException
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hallo "+name+", was möchtest du machen? \n Quiz starten(1)  Hilfe(2)");
        int auswahl;

        do {
            auswahl = scanner.nextInt();

            if (auswahl == 1) {

                System.out.println("Welches Themengebiet möchtest du bearbeiten? \n Geographie(1)  zurück(2)");
                int eingabe = scanner.nextInt();
                if (eingabe == 1)
                {
                   FragenSampler.main(name, eingabe,args);
                }else if (eingabe ==2) {
                    Menue.menue(name,args);
                }


            } else if (auswahl == 2)
            {
                Hilfe.main(name, args);
            } else {
                System.out.println("Bitte geben sie 1 oder 2 ein!");

            }
        } while (auswahl != 1 || auswahl != 2);
    }

}