import java.io.*;
import java.io.IOException;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Menue.menue(args);//Menüaufruf



    }
}


class Menue
{

    public static void menue(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Herzlich Willkommen zu unserem Quiz.");
        System.out.println("Verrate uns doch noch deinen Namen: ");
        String name= scanner.next();

        System.out.println("Hallo "+name+", was möchtest du machen? \n Quiz starten(1)  Tipps/Hilfe(2)  Themengebiete(3)");
        int auswahl=scanner.nextInt();

        if (auswahl==1)//Hier wird zur passenden Methode weitergeleitet
        {
            Quiz.main(String);
        }
        else if(auswahl==2)
        {
            Hilfe.hilfe(name);
        }
        else
        {
            Themengebiete.themengebiete(name);
        }
    }

}



class Hilfe{
    public static void hilfe(String name)
    {
        System.out.println("Brauchst du Hilfe "+name+"?");

    }
}

class Themengebiete{
    public static void themengebiete(String name)
    {
        System.out.println("Test");
    }
}

