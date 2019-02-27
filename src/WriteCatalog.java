import java.util.*;
import java.io.*;

public class WriteCatalog { //TODO: BUG! Er soll die vom Nutzer angegebenen Fragen untereinander speichern - nicht überschreiben!
    public static void main(String[] args, String name) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int anzahl;
        FileWriter fw = new FileWriter("src/user_catalog.txt");
        BufferedWriter bw = new BufferedWriter(fw);

       // FileReader fr = new FileReader("src/user_catalog.txt");
        //BufferedReader br = new BufferedReader(fr);

        System.out.println("Wie viele Fragen wollen Sie eingeben?");
        do {
            anzahl = scanner.nextInt();
            if (anzahl <= 25){
                 WriteCatalog.writequestions(args, anzahl, bw);
            }else {
                System.out.println("Du kannst maxmial 25 Fragen eingeben. Wie viel möchtest du eingeben: ");
            }
        }while (anzahl>0);

       //WriteCatalog.back(args, name);
        System.out.println(" ");
        System.out.println("Deine weiteren Optionen. Bitte eine der Optionen eingeben und mit Enter bestätigen.");
        System.out.println("(1) zurück");
        Scanner scanner1 = new Scanner(System.in);
        int option = scanner1.nextInt();

        if (option == 1) {
            Menue.main(args, name);
        } else if (option != 1){
            System.out.println("Diese Option ist nicht verfügbar"+name+"!");
        }

    }



    public static void writequestions(String[] args, int anzahl, BufferedWriter bw) throws IOException {
             String eingabe;
                Scanner scann =new Scanner(System.in);
        while (1 <= anzahl) {
                System.out.println(" ");
                System.out.println("Geben Sie EINE Frage ein: ");
                eingabe = scann.nextLine();
                bw.write(eingabe);
                bw.newLine();

                System.out.println("Geben Sie Antwortmöglichkeit 1 ein: ");
                eingabe = scann.nextLine();
                bw.write("1) " + eingabe);
                bw.newLine();

                System.out.println("Geben Sie Antwortmöglichkeit 2 ein: ");
                eingabe = scann.nextLine();
                bw.write("2) " + eingabe);
                bw.newLine();

                System.out.println("Geben Sie Antwortmöglichkeit 3 ein: ");
                eingabe = scann.nextLine();
                bw.write("3) " + eingabe);
                bw.newLine();

                System.out.println("Geben Sie Antwortmöglichkeit 4 ein: ");
                eingabe = scann.nextLine();
                bw.write("4) " + eingabe);
                bw.newLine();

                System.out.println("Nun geben Sie an, welche Antwortmöglichkeit die richtige ist: ");
                eingabe = scann.nextLine();
                bw.write(eingabe);
                bw.newLine();

                anzahl--;
            }
            //bw.write("###");
            bw.close();

    }

     /*public static void back(String[] args, String name)throws IOException {
         System.out.println(" ");
         System.out.println("Deine weiteren Optionen. Bitte eine der Optionen eingeben und mit Enter bestätigen.");
         System.out.println("(1) zurück");
         Scanner scanner1 = new Scanner(System.in);
         int option = scanner1.nextInt();

         if (option == 1) {
             Menue.main(args, name);
         } else if (option != 1){
             System.out.println("Diese Option ist nicht verfügbar"+name+"!");
         }
     }*/
}

