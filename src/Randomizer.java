import java.util.*;
import java.io.*;


public class Randomizer {
    public static void main(String[] args, String name, int numberOfQuestions) throws IOException {
        int generatedQuestions = 0;
        int x = 0;
        //Fragen Geographie
        FileReader frGeo = new FileReader("src/fragen_geographie.txt");
        BufferedReader brGeo = new BufferedReader(frGeo);
        //Fragen Sport
        FileReader frSpo = new FileReader("src/fragen_sport.txt");
        BufferedReader brSpo = new BufferedReader(frSpo);
        //Fragen Geschichte
        FileReader frHist = new FileReader("src/fragen_geschichte.txt");
        BufferedReader brHist = new BufferedReader(frHist);


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
