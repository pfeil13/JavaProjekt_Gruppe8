import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

class FragenSampler {

    public static void main(String name, String[] args, int userInput, int numberOfQuestions) throws IOException {

        String begin = "src/fragen_";
        String beginUM = "src/";
        String ending = ".txt";
        String path = "";

        if (userInput == 1) {
            path = begin + "geographie" + ending;
        } else if (userInput == 2) {
            path = begin + "sport" + ending;
        } else if (userInput == 3) {
            path = begin + "geschichte" + ending;
        } else if (userInput == 4) {
            path = beginUM + "user_catalog" + ending; //UM steht für UserMode
        }
        FileReader fr = new FileReader(path);
        BufferedReader br = new BufferedReader(fr);
        String textmodule_correctQuestions = "";
        String textmodule_amountOfQuestions = "";
        String line_x = "0";
        int correct = 0;
        int wrong = 0;
        int amountOfQuestions;
        Scanner scanner = new Scanner(System.in);

        while (!line_x.equals("")) {
            line_x = br.readLine();

            if (numberOfQuestions == 0 || line_x.equals("###")) {
                amountOfQuestions = correct + wrong;
                do {
                    if (correct == 1) {
                        textmodule_correctQuestions = "Frage";
                    } else if (correct > 1) {
                        textmodule_correctQuestions = "Fragen";
                        textmodule_amountOfQuestions = "Fragen";
                    } else if (correct == 0) {
                        textmodule_correctQuestions = "Fragen";
                    }
                    if (amountOfQuestions > 1) {
                        textmodule_amountOfQuestions = "Fragen";
                    } else if (amountOfQuestions <= 1) {
                        textmodule_amountOfQuestions = "Frage";
                    }
                    System.out.println(name + " du hast von " + amountOfQuestions + " " + textmodule_amountOfQuestions + " " + correct + " " + textmodule_correctQuestions + " korrekt beantwortet.\n");

                    SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
                    String uhrzeit = sdf.format(new Date());

                    SimpleDateFormat sdf2 = new SimpleDateFormat("dd.MM.yyyy");
                    String datum = sdf2.format(new Date());

                    ScoreWriter.main(args, name, amountOfQuestions, correct, wrong, uhrzeit, datum);
                    System.out.println("Was möchtest du jetzt tun? \n Zurück zum Menü(1)");
                    userInput = scanner.nextInt();

                    if (userInput == 1) {
                        Menue.main(args, name);
                    }
                } while (userInput != 1);
            }

            System.out.println();
            System.out.println(line_x);
            line_x = br.readLine();
            System.out.println(line_x);
            line_x = br.readLine();
            System.out.println(line_x);
            line_x = br.readLine();
            System.out.println(line_x);
            line_x = br.readLine();
            System.out.println(line_x);
            String answer = br.readLine();

            System.out.print("Deine Antwort: ");
            String userAnswer = scanner.next();

            if (userAnswer.equals(answer)) {
                System.out.println("Das ist richtig!");
                correct++;
                numberOfQuestions--;
            } else if (!userAnswer.equals(answer)) {
                System.out.println("Das ist leider falsch.");
                wrong++;
                numberOfQuestions--;
            }
        }
        br.close();
    }
}

