package interfaces;


import java.util.Scanner;

public class MainMenu {
    public static void main(String[] args) {
        greetings("buddy");
        System.out.println("""
                1 - Start new game
                2 - Load game
                3 - See describtion
                4 - authors
                """);
        Scanner scan = new Scanner(System.in);
        try {
            int choice = scan.nextInt();
            switch (choice) {
                case (1) -> System.out.println();
                case (2) -> System.out.println("fdf");
            }
        } catch (Exception e) {
            System.out.println("Idi nahui");
        }

    }

    static void greetings(String text) {
        System.out.println("Welcome to the club, " + text + "!");
    }
}
