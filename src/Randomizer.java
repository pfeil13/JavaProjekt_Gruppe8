import java.util.*;
import java.io.*;


public class Randomizer {
    public static void main(String[] args, String name, int numberOfQuestions) throws IOException {
        int generatedQuestions = 0;
        int x = 0;
        //Fragen Geographie
        FileWriter fwGeo = new FileWriter("src/fragen_geographie.txt");
        BufferedWriter bwGeo = new BufferedWriter(fwGeo);
        //Fragen Sport
        FileWriter fwSpo = new FileWriter("src/fragen_sport.txt");
        BufferedWriter bwSpo = new BufferedWriter(fwSpo);
        //Fragen Geschichte
        FileWriter fwHist = new FileWriter("src/fragen_geschichte.txt");
        BufferedWriter bwHist = new BufferedWriter(fwHist);


        int questionsGeo = (int) (Math.random() * 8 + 1);
        System.out.println(questionsGeo);
        int questionsSpo = (int) (Math.random() * 8 + 1);
        System.out.println(questionsSpo);
        int questionsHist = (int) (Math.random() * 8 + 1);
        System.out.println(questionsHist);

        generatedQuestions = questionsGeo + questionsHist + questionsSpo;

        x = numberOfQuestions - generatedQuestions; // x := fehlende Fragen


        System.out.println("Generierte Fragen: " + generatedQuestions);
        System.out.println("Noch fehlende Fragen: " + x);


        // int cat_geo = (int) (Math.random() * )


    }
}
