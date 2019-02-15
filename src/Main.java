import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Menüaufruf

        System.out.println("Herzlich Willkommen zu unserem Quiz.");
        System.out.println("Verrate uns doch noch deinen Namen: ");
    }
}

class Fragen
{
    public static void main(String[] args)
    {

        FileReader fr = new FileReader("test.txt");
        BufferedReader br = new BufferedReader(fr);

        String zeile1 = br.readLine();
        System.out.println(zeile1);

        br.close();

    }
}