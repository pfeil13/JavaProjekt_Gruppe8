import java.io.*;
import java.util.*;

public class Hilfe {

    public static void main(String name, String[] args) throws IOException {
        FileReader freader = new FileReader("src/anleitung");
        BufferedReader breader = new BufferedReader(freader);

        String zeile = "";

        while ((zeile = breader.readLine()) != null) {
            System.out.println(zeile);
        }

        System.out.println("");
        System.out.println("Deine weiteren Optionen. Bitte eine der Optionen eingeben und mit Enter bestätigen.");
        System.out.println("(1) zurück");
        Scanner eingabe = new Scanner(System.in);
        int option = eingabe.nextInt();

        if (option == 1) {
            Menue.main(args,name);
        } else if (option != 1)

            System.out.println("Diese Option ist nicht verfügbar!");
        Hilfe.main(name,args);
        breader.close();
    }

}
