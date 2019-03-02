import java.io.*;
import java.util.*;

class FragenSampler {

    public static void main(String name, String[] args, int userInput, int numberOfQuestions) throws IOException {

        String begin = "src/fragen_";
        String beginUM = "src/";
        String ending = ".txt";
        String path = "";

        //Zuweisung für den FileReader
        if (userInput == 1) {
            //Pfad
            path = begin + "geographie" + ending;
        } else if (userInput == 2) {
            //Pfad
            path = begin + "sport" + ending;
        } else if (userInput == 3) {
            //Pfad
            path = begin + "geschichte" + ending;
        } else if (userInput == 4) {

        } else if (userInput == 5) {
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


            if (line_x.equals("") || numberOfQuestions == 0) {
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

