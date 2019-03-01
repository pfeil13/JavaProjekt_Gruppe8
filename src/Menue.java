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
        int numberOfQuestions;

        do {
            input = scanner.nextInt();

            if (input == 1) {
                System.out.println("Welches Themengebiet möchtest du bearbeiten? \n Geographie(1) \n Sport(2) \n Geschichte(3) \n Zufallsmodus(4) \n Nutzerfragen(5) \n zurück(6)");
                int userChoice = scanner.nextInt();
                if (userChoice == 1) {
                    System.out.println("Wie viele Fragen möchtest du beantworten, " + name + "?");
                    numberOfQuestions = scanner.nextInt();
                    if (numberOfQuestions == 25) {
                        System.out.println("Gut, es werden alle Fragen des Katalogs gestellt!");
                        FragenSampler.main(name, args, userChoice, numberOfQuestions);
                    } else if (numberOfQuestions > 25) {
                        System.out.println("So viele Fragen gibt es in diesem Katalog nicht! Es werden daher einfach alle 25 gestellt!");
                        FragenSampler.main(name, args, userChoice, numberOfQuestions);
                    } else if (numberOfQuestions < 25) {
                        System.out.println("Gut, es werden " + numberOfQuestions + " Fragen gestellt.");
                        FragenSampler.main(name, args, userChoice, numberOfQuestions);
                    }
                } else if (userChoice == 2) {
                    System.out.println("Wie viele Fragen möchtest du beantworten, " + name + "?");
                    numberOfQuestions = scanner.nextInt();
                    if (numberOfQuestions == 25) {
                        System.out.println("Gut, es werden alle Fragen des Katalogs gestellt!");
                        FragenSampler.main(name, args, userChoice, numberOfQuestions);
                    } else if (numberOfQuestions > 25) {
                        System.out.println("So viele Fragen gibt es in diesem Katalog nicht! Es werden daher einfach alle 25 gestellt!");
                        FragenSampler.main(name, args, userChoice, numberOfQuestions);
                    } else if (numberOfQuestions < 25) {
                        System.out.println("Gut, es werden " + numberOfQuestions + " Fragen gestellt.");
                        FragenSampler.main(name, args, userChoice, numberOfQuestions);
                    }

                } else if (userChoice == 3) {
                    System.out.println("Wie viele Fragen möchtest du beantworten, " + name + "?");
                    numberOfQuestions = scanner.nextInt();
                    if (numberOfQuestions == 25) {
                        System.out.println("Gut, es werden alle Fragen des Katalogs gestellt!");
                        FragenSampler.main(name, args, userChoice, numberOfQuestions);
                    } else if (numberOfQuestions > 25) {
                        System.out.println("So viele Fragen gibt es in diesem Katalog nicht! Es werden daher einfach alle 25 gestellt!");
                        FragenSampler.main(name, args, userChoice, numberOfQuestions);
                    } else if (numberOfQuestions < 25) {
                        System.out.println("Gut, es werden " + numberOfQuestions + " Fragen gestellt.");
                        FragenSampler.main(name, args, userChoice, numberOfQuestions);
                    }
                } else if (userChoice == 4) {

                    //TODO: Zufallsmodus

                } else if (userChoice == 5) {
                    System.out.println("Wie viele Fragen möchtest du beantworten, " + name + "?");
                    numberOfQuestions = scanner.nextInt();
                    if (numberOfQuestions == 25) { //TODO: Er sollte die Anzahl der Nutzerfragen zählen. 25 ist Beispielwert.
                        System.out.println("Gut, es werden alle Fragen des Katalogs gestellt!");
                        FragenSampler.main(name, args, userChoice, numberOfQuestions);
                    } else if (numberOfQuestions != 25) {
                        System.out.println("Gut, es werden alle Fragen des Katalogs gestellt!");
                        FragenSampler.main(name, args, userChoice, numberOfQuestions);
                    }
                } else if (userChoice == 6) {
                    Menue.main(args, name);
                }


            } else if (input == 2) {
                WriteCatalog.main(args,name);
            } else if (input == 3) {
                Hilfe.main(name, args);
            } else {
                System.out.println("Bitte geben sie 1, 2 oder 3 ein!");
            }
        } while (input != 1 || input != 2 || input != 3);
    }
}