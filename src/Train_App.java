import java.util.LinkedList;


public class Train_App {

    public static void main(String[] args) {

        System.out.println("=======================================");
        System.out.println("UC4 - Maintain Ordered Bogie IDs");
        System.out.println("=======================================\n");

        // Create LinkedList for train consist
        LinkedList<String> train = new LinkedList<>();

        // Add bogies
        train.add("Engine");
        train.add("Sleeper");
        train.add("AC");
        train.add("Cargo");
        train.add("Guard");

        System.out.println("Initial Train Consist:");
        System.out.println(train + "\n");

        // Insert Pantry Car at position 2
        train.add(2, "Pantry");

        System.out.println("After Adding Pantry Car at position 2:");
        System.out.println(train + "\n");

        // Remove first and last bogie
        train.removeFirst();
        train.removeLast();

        System.out.println("After Removing First and Last Bogie:");
        System.out.println(train + "\n");

        System.out.println("Final Ordered Train Consist:");
        System.out.println(train + "\n");

        System.out.println("UC4 operations completed successfully...");
    }
}