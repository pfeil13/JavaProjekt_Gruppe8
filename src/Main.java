import java.io.*;
import java.io.IOException;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Menue.menue();//Menüaufruf



    }
}


class Menue
{
    public static void menue()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Herzlich Willkommen zu unserem Quiz.");
        System.out.println("Verrate uns doch noch deinen Namen: ");
        String name= scanner.next();

        System.out.println("Hallo "+name+", was möchtest du machen? \n Quiz starten(1)  Tipps/Hilfe(2)  Themengebiete(3)");
        int auswahl=scanner.nextInt();

        if (auswahl==1)
        {
            Quiz.quiz();
        }
        else if(auswahl==2)
        {
            Hilfe.hilfe();
        }
        else
        {
            Themengebiete.themengebiete();
        }
    }

}

class Quiz
{
    public static void quiz()
    {
       System.out.println("Test");
    }
}

class Hilfe{
    public static void hilfe()
    {
        System.out.println("Test");
    }
}

class Themengebiete{
    public static void themengebiete()
    {
        System.out.println("Test");
    }
}

class Fragen
{
    public static void main(String[] args) throws IOException
    {

        FileReader fr = new FileReader("src/fragenallg.txt");
        BufferedReader br = new BufferedReader(fr);

        String zeile1 = br.readLine();
        System.out.println(zeile1);

        br.close();

    }
}