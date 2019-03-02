import java.util.*;
import java.io.*;

public class WriteCatalog {
    public static void main(String[] args, String name) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int numberOfQuestions;
        FileWriter fw = new FileWriter("src/user_catalog.txt");
        BufferedWriter bw = new BufferedWriter(fw);

        System.out.println("Wie viele Fragen wollen Sie eingeben?");

        numberOfQuestions = scanner.nextInt();
        if (numberOfQuestions <= 25) {
            WriteCatalog.writequestions(args, numberOfQuestions, bw);
        } else {
            System.out.println("Du kannst maxmial 25 Fragen eingeben. Wie viel möchtest du eingeben: ");
        }

        System.out.println(" ");
        System.out.println("Deine weiteren Optionen. Bitte eine der Optionen eingeben und mit Enter bestätigen.");
        System.out.println("(1) zurück");
        Scanner scanner1 = new Scanner(System.in);
        int option = scanner1.nextInt();

        if (option == 1) {
            Menue.main(args, name);
        } else if (option != 1) {
            System.out.println("Diese Option ist nicht verfügbar" + name + "!");
        }

    }


    public static void writequestions(String[] args, int counter, BufferedWriter bw) throws IOException {
        String input;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println(" ");
            System.out.println("Geben Sie EINE Frage ein: ");
            input = scanner.nextLine();
            bw.write(input);
            bw.newLine();

            System.out.println("Geben Sie Antwortmöglichkeit 1 ein: ");
            input = scanner.nextLine();
            bw.write("1) " + input);
            bw.newLine();

            System.out.println("Geben Sie Antwortmöglichkeit 2 ein: ");
            input = scanner.nextLine();
            bw.write("2) " + input);
            bw.newLine();

            System.out.println("Geben Sie Antwortmöglichkeit 3 ein: ");
            input = scanner.nextLine();
            bw.write("3) " + input);
            bw.newLine();

            System.out.println("Geben Sie Antwortmöglichkeit 4 ein: ");
            input = scanner.nextLine();
            bw.write("4) " + input);
            bw.newLine();

            System.out.println("Nun geben Sie an, welche Antwortmöglichkeit die richtige ist: ");
            input = scanner.nextLine();
            bw.write(input);
            bw.newLine();

            bw.write("###");

            counter--;
        } while (1 <= counter);
        bw.close();
    }
}

