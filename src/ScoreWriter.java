import java.util.*;
import java.io.*;

public class ScoreWriter {
    public static void main(String[] args, String name, int amountOfQuestions, int correct, int wrong) throws IOException {

        //FileWriter fw = new FileWriter("src/score");
        BufferedWriter bw = new BufferedWriter(
                new OutputStreamWriter(
                        new FileOutputStream("src/score", true)));

        bw.write(name + ": " + "Fragen beantwortet: " + amountOfQuestions + "  / " + "Korrekte Fragen: " + correct + " / " + "Falsche Fragen: " + wrong);
        bw.newLine();
        bw.close();


    }

    public static void readScore(String[] args, String name) throws IOException {
        FileReader fr = new FileReader("src/score");
        BufferedReader br = new BufferedReader(fr);

        String line = "";
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
        ScoreWriter.readScore(args, name);
        br.close();
    }
}

