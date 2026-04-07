public class Train_App {
    public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println("UC18 - Linear Search for Bogie ID");
        System.out.println("====================================\n");

        // Array of Bogie IDs
        String[] bogieIDs = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        System.out.println("Available Bogie IDs:\n");

        // Display all bogie IDs
        for (String id : bogieIDs) {
            System.out.println(id);
        }

        System.out.println();

        // Search key
        String searchKey = "BG309";

        boolean found = false;

        // Linear Search
        for (String id : bogieIDs) {
            if (id.equals(searchKey)) {
                found = true;
                break;
            }
        }

        // Result
        if (found) {
            System.out.println("Bogie " + searchKey + " found in train consist.");
        } else {
            System.out.println("Bogie " + searchKey + " not found in train consist.");
        }

        System.out.println("\nUC18 search completed...");
    }
}