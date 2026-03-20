import java.util.ArrayList;
import java.util.List;

public class Train_App {

    public static void main(String[] args) {

        // Welcome Message
        System.out.println("===================================");
        System.out.println("=== Train Consist Management App ===");
        System.out.println("===================================");

        // Initialize empty train consist
        List<String> trainConsist = new ArrayList<>();

        // Display initial state
        System.out.println("\nTrain initialized successfully...");
        System.out.println("Initial Bogie Count : " + trainConsist.size());
        System.out.println("Current Train Consist : " + trainConsist);

        // System ready message
        System.out.println("\nSystem ready for operations...");
    }
}