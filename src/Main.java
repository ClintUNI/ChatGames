import java.util.Scanner;

public class Main {
    final static Scanner scanner = new Scanner(System.in); // Do not change this line

    public static void main(String[] args) {
        greet();
        remindName();
        areYouHuman();
        howAreYouDoing();
        guessMeal();
        end();
    }//main end

    static void greet() {
        System.out.println("Hello! My name is " + "EGChat" + ".");
        System.out.println("I was created in " + "2023" + ".");
        System.out.println("Please, remind me your name.");
    }//greet end

    static void remindName() {
        String name = scanner.nextLine();
        System.out.println("What a great name you have, " + name + "!");
    }//remind name end

    static void areYouHuman() {
        System.out.println("Are you a human or a robot?");

        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.print("");
            String input = in.next();

            if (input.equalsIgnoreCase("human")) {
                System.out.println("Ah, finally fresh blood!");
                break;
            } else if (input.equalsIgnoreCase("robot")) {
                System.out.println("Sorry, I do not speak with imposters!");
                end();
            } else {
                System.out.println("Try again. Enter 'human' or 'robot'.");
            }
        }
    }


    static void howAreYouDoing() {
        System.out.println("Are you feeling good today? (yes/no)");

        while (true) {
            String userInput = scanner.next().toLowerCase();

            if (userInput.equals("yes")) {
                System.out.println("That is really good to hear!");
                break;
            } else if (userInput.equals("no")) {
                askQuestion();
                break;
            } else {
                System.out.println("Invalid input. Please enter 'yes' or 'no'.");
            }
        }
    }


    static void askQuestion()
    {
        System.out.println("How so?");

        scanner.nextLine();

        String reason = scanner.nextLine();
        System.out.println("That is so sad that happened" + reason + ", I hope it gets better!");
        guessMeal();
    }

    static void guessMeal() {
        System.out.println("What is your favorite meal?");
        scanner.nextLine();
        String meal = scanner.nextLine();
        System.out.println("So your favorite meal is " + meal + ", can you guess mine?");
        System.out.println("1. Burgers\n" +
                "2. Ants\n" +
                "3. Human logic\n");

        while (true) {
            System.out.print("Enter the number of your guess: ");
            if (scanner.hasNextInt()) {
                int num = scanner.nextInt();
                scanner.nextLine(); // Consume the newline character

                if (num == 3) {
                    System.out.println("You have guessed right!");
                    end();
                } else if (num == 1 || num == 2){
                    System.out.println("Try again");
                }
            } else {
                System.out.println("Invalid input. Please enter a number (1, 2, or 3).");
            }
        }
    }


    static void end()
    {
        System.out.println("Have a nice day!");
        System.exit(0);
    }//end end :)
}//class end