import java.io.*;
import java.util.*;

public class Hilfe {

    public static void main(String name, String[] args) throws IOException {
        FileReader fr = new FileReader("src/anleitung");
        BufferedReader br = new BufferedReader(fr);

        String line = "";

        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }

        System.out.println();
        System.out.println("Deine weiteren Optionen. Bitte eine der Optionen eingeben und mit Enter bestätigen.");
        System.out.println("(1) zurück");
        Scanner userInput = new Scanner(System.in);
        int option = userInput.nextInt();

        if (option == 1) {
            Menue.main(args,name);
        } else if (option != 1)

            System.out.println("Diese Option ist nicht verfügbar!");
        Hilfe.main(name,args);
        br.close();
    }

}
