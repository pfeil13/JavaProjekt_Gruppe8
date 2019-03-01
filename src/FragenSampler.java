import java.io.*;
import java.util.*;

class FragenSampler {

    public static void main(String name, String[] args, int userInput, int questionPool) throws IOException {

        String begin = "src/fragen_";
        String beginUM = "src/_";
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
            //TODO: Zufallsmodus!!!
        } else if (userInput == 5) {
            path = beginUM + "user_catalog" + ending; //UM stehht für UserMode
        }

        FileReader fr = new FileReader(path);
        BufferedReader br = new BufferedReader(fr);
        String line_x = "0";
        int correct = 0;
        int wrong = 0;
        int amountOfQuestions = 0;
        //int userInput;
        Scanner scanner = new Scanner(System.in);


        while (!line_x.equals("###")) {
            line_x = br.readLine();


            if (line_x.equals("###") || questionPool == 0) {
                amountOfQuestions = correct + wrong;

                do {
                    System.out.println(name + " du hast von " + amountOfQuestions + " Fragen " + correct + " Fragen korrekt beantwortet.\n");
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
                questionPool--;
            } else if (!userAnswer.equals(answer)) {
                System.out.println("Das ist leider falsch.");
                wrong++;
                questionPool--;
            }
        }
        br.close();
    }
}

