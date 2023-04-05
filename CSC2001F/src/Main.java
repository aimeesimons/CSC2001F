import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        BinarySearchTree users = new BinarySearchTree();
        Scanner input = new Scanner(System.in);
        System.out.println("Choose an action from the menu:");
        System.out.println(
                "1. Find the profile description for a given account\n2. List all accounts\n3. Create an account\n4. Delete an account\n5. Display all posts for a single account\n6. Add a new post for an account\n7. Load a file of actions from disk and process this\n8. Quit");
        System.out.println("Enter your choice:");
        int choice = input.nextInt();

        while (choice != 8) {
            switch (choice) {
                case 1:
                    System.out.println("Enter the account name:");

                    System.out.println("The profile description is: ");
                    break;

                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
            }
            System.out.println("Choose an action from the menu:");
            System.out.println(
                    "1. Find the profile description for a given account\n2. List all accounts\n3. Create an account\n4. Delete an account\n5. Display all posts for a single account\n6. Add a new post for an account\n7. Load a file of actions from disk and process this\n8. Quit");
            System.out.println("Enter your choice:");
            choice = input.nextInt();
        }
        System.out.println("Bye!");
    }

}
