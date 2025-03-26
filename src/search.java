import java.util.*;

public class search{
    public static void main(String[] args) {
        String[] items = {"Nikitha B", "Aasmi Kothari", "Ashutosh Ranjan", "John Abraham"};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter search string: ");
        String searchstring = scanner.nextLine();

        if (isvalidinput(searchstring)) {
            System.out.println("Valid input accepted");
            searchitem(items, searchstring);
        } else {
            System.out.println("Invalid input message");
        }

    }
    public static boolean isvalidinput(String input ){

        return !input.isEmpty() && input.matches("[a-zA-Z]+\\s+[a-zA-Z]+");


    }

    static void searchitem(String[] items, String search) {
        boolean found = false;
        for (String item : items) {
            if (item.toLowerCase().contains(search.toLowerCase())) {

                System.out.println("Found: " + item);
                found = true;
                sortitems(items);
                break;

            }

        }
        if (!found){
            System.out.println("No match found.");}
}
    static void sortitems(String[] items) {
        Arrays.sort(items);
        System.out.println("\nSorted Items:");
        for (String item : items) {
            System.out.println(item);
        }}




}