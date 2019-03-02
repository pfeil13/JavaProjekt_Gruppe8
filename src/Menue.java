import java.io.*;
import java.util.*;

class Menue {

    public static void intro(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Herzlich Willkommen zu unserem Quiz.");
        System.out.println("Verrate uns doch noch deinen Namen: ");
        String name;
        name = scanner.nextLine();
        Menue.main(args, name);
    }

    public static void main(String[] args, String name) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hallo " + name + ", was möchtest du machen? \n Quiz starten(1) \n Frageneditor(2) \n Hilfe(3)");
        int input;
        int numberOfQuestions = 0;

        do {
            input = scanner.nextInt();

            if (input == 1) {
                System.out.println("Welches Themengebiet möchtest du bearbeiten? \n Geographie(1) \n Sport(2) \n Geschichte(3) \n Zufallsmodus(4) \n Nutzerfragen(5) \n zurück(6)");
                int userInput = scanner.nextInt();
                if (userInput == 1) {
                    System.out.println("Wie viele Fragen möchtest du beantworten, " + name + "?");
                    numberOfQuestions = scanner.nextInt();
                    if (numberOfQuestions == 25) {
                        System.out.println("Gut, es werden alle Fragen des Katalogs gestellt!");
                        FragenSampler.main(name, args, userInput, numberOfQuestions);
                    } else if (numberOfQuestions > 25) {
                        System.out.println("So viele Fragen gibt es in diesem Katalog nicht! Es werden daher einfach alle 25 gestellt!");
                        FragenSampler.main(name, args, userInput, numberOfQuestions);
                    } else if (numberOfQuestions < 25) {
                        System.out.println("Gut, es werden " + numberOfQuestions + " Fragen gestellt.");
                        FragenSampler.main(name, args, userInput, numberOfQuestions);
                    }
                } else if (userInput == 2) {
                    System.out.println("Wie viele Fragen möchtest du beantworten, " + name + "?");
                    numberOfQuestions = scanner.nextInt();
                    if (numberOfQuestions == 25) {
                        System.out.println("Gut, es werden alle Fragen des Katalogs gestellt!");
                        FragenSampler.main(name, args, userInput, numberOfQuestions);
                    } else if (numberOfQuestions > 25) {
                        System.out.println("So viele Fragen gibt es in diesem Katalog nicht! Es werden daher einfach alle 25 gestellt!");
                        FragenSampler.main(name, args, userInput, numberOfQuestions);
                    } else if (numberOfQuestions < 25) {
                        System.out.println("Gut, es werden " + numberOfQuestions + " Fragen gestellt.");
                        FragenSampler.main(name, args, userInput, numberOfQuestions);
                    }

                } else if (userInput == 3) {
                    System.out.println("Wie viele Fragen möchtest du beantworten, " + name + "?");
                    numberOfQuestions = scanner.nextInt();
                    if (numberOfQuestions == 25) {
                        System.out.println("Gut, es werden alle Fragen des Katalogs gestellt!");
                        FragenSampler.main(name, args, userInput, numberOfQuestions);
                    } else if (numberOfQuestions > 25) {
                        System.out.println("So viele Fragen gibt es in diesem Katalog nicht! Es werden daher einfach alle 25 gestellt!");
                        FragenSampler.main(name, args, userInput, numberOfQuestions);
                    } else if (numberOfQuestions < 25) {
                        System.out.println("Gut, es werden " + numberOfQuestions + " Fragen gestellt.");
                        FragenSampler.main(name, args, userInput, numberOfQuestions);
                    }
                } else if (userInput == 4) {

                    System.out.println("Nun werden 25 Fragen aus zufälligen Themengebieten gewählt.");
                    numberOfQuestions = 25;
                    Randomizer.main(args, name, numberOfQuestions);


                } else if (userInput == 5) {

                        String path ="src/user_catalog.txt";
                        FileReader fr = new FileReader(path);
                        BufferedReader br = new BufferedReader(fr);
                        int countLines = 0;
                        while ( br.readLine() != null ) {//Zählt beschriftete Zeilen
                            countLines++;
                        }
                        int existingQuestions = countLines/6;//berechnet wie viele Fragen da sind


                    if (countLines==0){
                        System.out.println("Sorry, momentan sind keine Fragen im Katalog.");
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
                    }else {
                        System.out.println("Momentan sind/ist " + existingQuestions+" Frage/n im Katalog");
                        System.out.println("Wie viele Fragen möchtest du beantworten, " + name + "?");
                        numberOfQuestions = scanner.nextInt();
                        if (numberOfQuestions <= existingQuestions) {
                            System.out.println("Gut, es werden "+numberOfQuestions+" Fragen des Katalogs gestellt!");
                            FragenSampler.main(name, args, userInput, numberOfQuestions);
                        } else if (numberOfQuestions > existingQuestions ) {
                            System.out.println("So viele Fragen gibt es in diesem Katalog nicht! Es werden daher einfach alle " + existingQuestions + " gestellt!");
                            FragenSampler.main(name, args, userInput, numberOfQuestions);
                        }
                    }


                } else if (userInput == 6) {
                    Menue.main(args, name);
                }


            } else if (input == 2) {
                WriteCatalog.main(args,name);
            } else if (input == 3) {
                Hilfe.main(name, args);
            } else {
                System.out.println("Treffe bitte eine korrekte Menüauswahl");
            }
        } while (input != 1 || input != 2 || input != 3);
    }
}