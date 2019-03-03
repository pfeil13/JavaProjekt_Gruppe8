import java.io.*;
import java.util.Scanner;

class PlayerWriter {
    public static void main(String name, int amountOfQuestions, int correct, int wrong, String uhrzeit, String datum) throws IOException {

        BufferedWriter bw = new BufferedWriter(
                new OutputStreamWriter(
                        new FileOutputStream("src/player.txt", true)));

        bw.write("(" + datum + " " + uhrzeit + ") " + name + ": " + "Fragen beantwortet: " + amountOfQuestions + "  - " + "Korrekte Fragen: " + correct + " - " + "Falsche Fragen: " + wrong);
        bw.newLine();
        bw.close();
    }

    public static void readScore(String[] args, String name) throws IOException {
        FileReader fr = new FileReader("src/player.txt");
        BufferedReader br = new BufferedReader(fr);

        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        System.out.println();
        System.out.println("Deine weiteren Optionen. Bitte eine der Optionen eingeben und mit Enter bestätigen.");
        System.out.println("(1) zurück");
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();
        if (userInput == 1) {
            Menue.main(args, name);
        } else if (userInput != 1)
            System.out.println("Diese Option ist nicht verfügbar!");
        PlayerWriter.readScore(args, name);
        br.close();
    }
}

