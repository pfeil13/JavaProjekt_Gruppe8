import java.io.*;
import java.io.IOException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        Menue.menue(args);//Menüaufruf



    }
}


class Menue
{

    public static void menue(String[] args) throws IOException
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Herzlich Willkommen zu unserem Quiz.");
        System.out.println("Verrate uns doch noch deinen Namen: ");
        String name= scanner.next();

        System.out.println("Hallo "+name+", was möchtest du machen? \n Quiz starten(1)  Hilfe(2)");
        int auswahl;

        do {
            auswahl=scanner.nextInt();
            if (auswahl == 1)//Hier wird zur passenden Methode weitergeleitet
            {
                System.out.println("Hallo");// Todo:auf Quiz Methode verweisen, sobald fertig
            } else if (auswahl == 2)
            {
                Hilfe.main(args);
            } else
            {
                System.out.println("Bitte geben sie 1 oder 2 ein!");

            }
        } while(auswahl!=1 || auswahl!=2);
    }

}



class Hilfe
{
    public static void main(String[] args) throws IOException
    {
        FileReader freader = new FileReader("src/anleitung");
        BufferedReader breader = new BufferedReader(freader);

        String zeile = "";

        while( (zeile = breader.readLine()) != null )
        {
            System.out.println(zeile);
        }

        System.out.println("");
        System.out.println("Deine weiteren Optionen. Bitte eine der Optionen eingeben und mit Enter bestätigen.");
        System.out.println("(1) zurück");
        Scanner eingabe = new Scanner(System.in);
        int option= eingabe.nextInt();

        if (option == 1) {
        Menue.menue(args);
    } else if (option != 1)

        System.out.println("Diese Option ist nicht verfügbar!");
        Hilfe.main(args);
        breader.close();
    }
}




