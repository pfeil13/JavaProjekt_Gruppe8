import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

class Hilfe {
    public static void main(String name, String[] args) throws IOException {
        FileReader fr = new FileReader("src/anleitung");
        BufferedReader br = new BufferedReader(fr);
        String line;
        //Solange die 'line' - also gegenwärtige Zeile NICHT 'null' ist, wird der Dokumenteninhalt ausgegeben.
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        //Standart-Menü-Auswahl
        System.out.println();
        System.out.println("Deine weiteren Optionen. Bitte eine der Optionen eingeben und mit Enter bestätigen.");
        System.out.println("(1) zurück");
        Scanner userInput = new Scanner(System.in);
        int option = userInput.nextInt();

        if (option == 1) {
            Menue.main(args, name);
        } else if (option != 1)
            System.out.println("Diese Option ist nicht verfügbar!");


        Hilfe.main(name, args);
        br.close();
    }

}
