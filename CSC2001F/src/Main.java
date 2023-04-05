import java.util.Collections;
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
                    String AccountName = input.next();
                    User comp_User = new User(AccountName);
                    comp_User = users.find(comp_User).data;
                    if (comp_User == null) {
                        System.out.println("Account does not exist");
                    } else {
                        System.out.println("The profile description is: " + comp_User.Description);
                    }

                    break;
                case 2:
                    System.out.println("Listing all the accounts");
                    users.postOrder();
                    break;
                case 3:
                    System.out.println("Enter an account name:");
                    String Name = input.next();
                    System.out.println("Privide a profile description:");
                    String description = input.nextLine();
                    User newAccount = new User(Name, description);
                    users.insert(newAccount);
                    System.out.println("Account has been created!");
                    break;
                case 4:
                    System.out.println("Enter the account name which you would like to delete:");
                    String del = input.next();
                    User temp = new User(del);
                    users.delete(temp);
                    System.out.println("Account has been deleted");
                    break;
                case 5:
                    System.out.println("Enter an account name:");
                    String postName = input.next();
                    User temp1 = new User(postName);
                    temp1 = users.find(temp1).data;
                    Collections.reverse(temp1.posts);
                    for (int i = 0; i < temp1.posts.size(); i++) {
                        System.out.println(temp1.posts.get(i).toString());
                    }
                    break;
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
