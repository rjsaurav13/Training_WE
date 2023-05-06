import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserLoginSystem {
    private static final String CSV_FILE_PATH = "users.csv";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the User Login System");

        while (true) {
            System.out.println("\nPlease select an option:");
            System.out.println("1. Login");
            System.out.println("2. Signup");
            System.out.println("3. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline left-over

            switch (choice) {
                case 1:
                    login();
                    break;
                case 2:
                    signup();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }

    private static void login() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEnter your username:");
        String username = scanner.nextLine();

        System.out.println("Enter your password:");
        String password = scanner.nextLine();

        if (validateUser(username, password)) {
            System.out.println("Login successful.");
        } else {
            System.out.println("Invalid username or password, please try again.");
        }
    }

    private static boolean validateUser(String username, String password) {
        List<String[]> users = readUsersFromCSV();

        for (String[] user : users) {
            if (user[0].equals(username) && user[1].equals(password)) {
                return true;
            }
        }

        return false;
    }

    private static void signup() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEnter your username:");
        String username = scanner.nextLine();

        System.out.println("Enter your password:");
        String password = scanner.nextLine();

        if (createUser(username, password)) {
            System.out.println("Signup successful. You can now login.");
        } else {
            System.out.println("Username already exists, please try again with a different username.");
        }
    }

    private static boolean createUser(String username, String password) {
        List<String[]> users = readUsersFromCSV();

        for (String[] user : users) {
            if (user[0].equals(username)) {
                return false;
            }
        }

        try (FileWriter writer = new FileWriter(CSV_FILE_PATH, true)) {
            writer.append(String.join(",", username, password)).append("\n");
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
            return false;
        }

        return true;
    }

    private static List<String[]> readUsersFromCSV() {
        List<String[]> users = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(CSV_FILE_PATH))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] fields = line.split(",");
                users.add(fields);
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }

        return users;
    }
}
