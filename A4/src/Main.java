import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.attribute.UserDefinedFileAttributeView;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        BinarySearchTree users = new BinarySearchTree();
        Scanner input = new Scanner(System.in);
        users.insert(new User("aimee", "student at UCT"));
        users.insert(new User("234", "CEO of being cool"));
        users.insert(new User("erin", "tall girl"));
        users.insert(new User("maxine", "cute girl"));
        System.out.println("-----------------------------------------------------------------");
        System.out.println("\t\t # WELCOME TO TOKTIK!! #");
        System.out.println("-----------------------------------------------------------------");
        System.out.println("Choose an action from the menu:");
        System.out.println("");
        System.out.println(
                "\t1. Find the profile description for a given account\n\t2. List all accounts\n\t3. Create an account\n\t4. Delete an account\n\t5. Display all posts for a single account\n\t6. Add a new post for an account\n\t7. Load a file of actions from disk and process this\n\t8. Quit");
        System.out.println("");
        System.out.println("Enter your choice:");
        int choice = input.nextInt();
        System.out.println("");

        while (choice != 8) {
            switch (choice) {
                case 1:
                    input.nextLine();
                    System.out.println("Enter the account name:");
                    String names = input.next();
                    BinaryTreeNode search = users.UserExists(users, names);
                    if (search == null) {
                        System.out.println("Account name does not exist.");
                        System.out.println("");

                    } else {
                        System.out.println("\t>The profile description is: \"" + search.data.Description + "\"");
                        System.out.println("");
                    }

                    break;

                case 2:
                    System.out.println("\t-------------------------------------");
                    System.out.println("\tLISTING ALL THE ACCOUNTS:");
                    System.out.println("\t-------------------------------------");
                    users.inOrder();
                    System.out.println("");
                    break;
                case 3:
                    input.nextLine();
                    System.out.println("Enter an account name:");
                    String Name = input.next();
                    BinaryTreeNode check = users.UserExists(users, Name);
                    if (check == null) {
                        System.out.println("Provide a profile description:");
                        input.nextLine();
                        String description = input.nextLine();
                        User newAccount = new User(Name, description);
                        users.insert(newAccount);
                        System.out.println("\t>Account has been created!");
                        System.out.println("");
                    } else {
                        System.out.println("\t>Username already exists. Please select a different one.");
                        System.out.println("");
                    }
                    break;
                case 4:
                    System.out.println("Enter the account name which you would like to delete:");
                    String del = input.next();
                    BinaryTreeNode exists = users.UserExists(users, del);
                    if (exists == null) {
                        System.out.println("\t>Account name does not exist");
                        System.out.println("");

                    } else {
                        users.delete(new User(del));
                        System.out.println("\t>Account has been deleted");
                        System.out.println("");
                    }
                    break;
                case 5:
                    System.out.println("Enter an account name:");
                    String postsName = input.next();
                    BinaryTreeNode checking = users.UserExists(users, postsName);
                    if (checking == null) {
                        System.out.println("\t>Account name does not exit.");
                        System.out.println("");

                    } else {
                        User temp1 = new User(postsName);
                        temp1 = users.find(temp1).data;
                        Collections.reverse(temp1.posts);
                        System.out.println("\t-------------------------------------");
                        System.out.println("\t|LIST OF POSTS FROM " + postsName + "\t\t|");
                        System.out.println("\t-------------------------------------");
                        for (int i = 0; i < temp1.posts.size(); i++) {
                            System.out.println("\t" + temp1.posts.get(i).toString());
                            System.out.println("\t-------------------------------------");
                        }
                        System.out.println("");
                    }
                    break;
                case 6:
                    input.nextLine();
                    System.out.println("Enter an account name:");
                    String postName = input.next();
                    User temp2 = new User(postName);
                    temp2 = users.find(temp2).data;
                    System.out.println("Would you like to post a video? y/n");
                    String ans = input.next();
                    if (ans.toUpperCase().equals("Y")) {
                        System.out.println("Enter the video file name");
                        String vid = input.next();
                        System.out.println("Enter a Title");
                        input.nextLine();
                        String descrip = input.nextLine();
                        temp2.posts.add(new Post(descrip, vid));
                    } else {
                        System.out.println("Enter a comment");
                        input.nextLine();
                        String com = input.nextLine();
                        temp2.posts.add(new Post(com));
                    }
                    break;

                case 7:
                    String route = "C:/Users/Aimee Simons/Desktop/2023/Lectures/Semester 1/CSC2001F/Assignments/CSC2001F_A4/CSC2001F/dataset.txt";
                    String li = Line(route);
                    int space = li.indexOf(" ");
                    System.out.println(li.substring(0, space));
                    // if (li.substring(0, space - 1).toUpperCase() == "ADD") {
                    // String newString = li.substring(space);

                    // }
                default:
                    System.out.println("Invalid input. Please try again.");
                    break;

            }
            System.out.println("Choose an action from the menu:");
            System.out.println("");
            System.out.println(
                    "\t1. Find the profile description for a given account\n\t2. List all accounts\n\t3. Create an account\n\t4. Delete an account\n\t5. Display all posts for a single account\n\t6. Add a new post for an account\n\t7. Load a file of actions from disk and process this\n\t8. Quit");
            System.out.println("");
            System.out.println("Enter your choice:");
            choice = input.nextInt();
            System.out.println("");
        }
        System.out.println("-----------------------------------------------------------------");
        System.out.println("\t\t # THANK YOU FOR USING TOKTIK!! #");
        System.out.println("-----------------------------------------------------------------");
    }

    private static String Line(String route) {
        List<String> l;
        try {
            l = Files.readAllLines(Paths.get(route));
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
        Random random = new Random();
        return l.get(random.nextInt(l.size()));
    }

}
