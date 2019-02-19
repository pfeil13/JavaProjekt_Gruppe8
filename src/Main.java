import java.io.*;
import java.io.IOException;
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




class Menue
{
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
            auswahl=scanner.nextInt();

            if (auswahl == 1)
            {

                System.out.println("Welches Themengebiet möchtest du bearbeiten? \n Geographie(1)  zurück(2)");
                int eingabe = scanner.nextInt();
                if (eingabe == 1)
                {
                   FragenGeo.main(args);
                }else if (eingabe ==2)
                {
                    Menue.menue(name,args);
                }


            } else if (auswahl == 2)
            {
                Hilfe.main(name, args);
            } else
            {
                System.out.println("Bitte geben sie 1 oder 2 ein!");

            }
        } while(auswahl!=1 || auswahl!=2);
    }

}



class Hilfe
{
    public static void main(String name, String[] args) throws IOException
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
        Menue.menue(name,args);
    } else if (option != 1)

        System.out.println("Diese Option ist nicht verfügbar!");
        Hilfe.main(name,args);
        breader.close();
    }
}


class FragenGeo

{
    public static void main(String[] args) throws IOException
    {
        FileReader fr = new FileReader("src/geo_fragen2.txt");
        BufferedReader br = new BufferedReader(fr);

        String zeile1 = br.readLine();
        System.out.println(zeile1);
        String zeile2 = br.readLine();
        System.out.println(zeile2);
        String zeile3 = br.readLine();
        System.out.println(zeile3);
        String zeile4 = br.readLine();
        System.out.println(zeile4);
        String zeile5 = br.readLine();
        System.out.println(zeile5);
        String str_antwort = br.readLine();
        Integer int_antwort = Integer.valueOf(str_antwort);

        //System.out.println("Musterlösung: " + int_antwort); Nur zur Kontrolle

        System.out.println("Deine Antwort: ");
        Scanner scanner = new Scanner(System.in);
        String str_eingabe = scanner.nextLine();
        Integer int_eingabe = Integer.valueOf(str_eingabe);

        if (int_eingabe == int_antwort)
        {
            System.out.println("Das war die richtige Antwort!");
        }else if (int_eingabe != int_antwort){
            System.out.println("Das war leider falsch!");
        }

        br.close();
    }
}









/*


class AusgabeFragenGeo
{
    public static void main(String[] args) {
        Questions ausgabe = new Questions();
        for (GeoFragen question : ausgabe.getQuestions()) {
            System.out.println(question);
        }
    }
}

class AusgabeFragenGeo
{
    public static void main(String[] args) {
        Questions ausgabe = new Questions();
        for (GeoFragen question : ausgabe.getQuestions()) {
            System.out.println(question);
        }
    }
}


class AusgabeFragenGeo
{
    public static void main(String[] args) {
        Questions ausgabe = new Questions();
        for (GeoFragen question: ausgabe.getQuestions())
        {
            System.out.println(question);
        }
    }
}

class FragenGeo

{
    public static void main(String[] args) throws IOException
    {
        FileReader fr = new FileReader("src/geo_fragen2.txt");
        BufferedReader br = new BufferedReader(fr);

        String zeile1 = br.readLine();
        System.out.println(zeile1);
        String zeile2 = br.readLine();
        System.out.println(zeile2);
        String zeile3 = br.readLine();
        System.out.println(zeile3);
        String zeile4 = br.readLine();
        System.out.println(zeile4);
        String zeile5 = br.readLine();
        System.out.println(zeile5);
        String antwort = br.readLine();

        br.close();
    }
}

class FragenGeo2
{
    public static void main(String[] args) throws IOException
    {
        FileReader fr = new FileReader("src/geo_fragen2.txt");
        BufferedReader br = new BufferedReader(fr);


            for (int l = 1; l < 6; l++) {

                String zeile = br.readLine();
                System.out.println(zeile);
                String antwort = br.readLine();
                System.out.println("Antwort: " + antwort);
            }


        }


    }

*/