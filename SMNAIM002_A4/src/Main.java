import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.attribute.UserDefinedFileAttributeView;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        BinarySearchTree users = new BinarySearchTree();// creating a BinarySearchTree object
        Scanner input = new Scanner(System.in);// initialising a scanner object
        System.out.println("-----------------------------------------------------------------");
        System.out.println("\t\t # WELCOME TO TOKTIK!! #");
        System.out.println("-----------------------------------------------------------------");
        boolean bool = true;
        while (bool) {
            try {
                System.out.println("Choose an action from the menu:");
                System.out.println("");
                System.out.println(
                        "\t1. Find the profile description for a given account\n\t2. List all accounts\n\t3. Create an account\n\t4. Delete an account\n\t5. Display all posts for a single account\n\t6. Add a new post for an account\n\t7. Load a file of actions from disk and process this\n\t8. Quit");
                System.out.println("");
                System.out.println("Enter your choice:");// Prompting the user to input a number
                int choice = input.nextInt();
                System.out.println("");

                switch (choice) {// switch statement
                    case 1:
                        input.nextLine();
                        System.out.println("Enter the account name:");
                        String names = input.next();
                        boolean search = users.UserExists(users, names);// checkong whether the user exists
                        if (search == false) {
                            System.out.println("\t>Account name does not exist.");
                            System.out.println("");

                        } else {
                            System.out.println("\t>The profile description is: \""
                                    + users.userfound(users, names).data.Description + "\"");// displaying the user
                                                                                             // description
                            System.out.println("");
                        }

                        break;

                    case 2:
                        System.out.println("\t-------------------------------------");
                        System.out.println("\tLISTING ALL THE ACCOUNTS:");
                        System.out.println("\t-------------------------------------");
                        users.inOrder();// using the inorder function to list the accounts.
                        System.out.println("");
                        break;
                    case 3:
                        input.nextLine();
                        System.out.println("Enter an account name:");
                        String Name = input.next();
                        boolean check = users.UserExists(users, Name);
                        if (check == false) {
                            System.out.println("Provide a profile description:");
                            input.nextLine();
                            String description = input.nextLine();
                            User newAccount = new User(Name, description);
                            users.insert(newAccount);// inserting a new User object into the binarySearchtree
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
                        boolean exists = users.UserExists(users, del);
                        if (exists == false) {
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
                        boolean checking = users.UserExists(users, postsName);
                        if (checking == false) {
                            System.out.println("\t>Account name does not exit.");
                            System.out.println("");

                        } else {
                            User temp1 = new User(postsName);
                            temp1 = users.find(temp1).data;
                            Collections.reverse(temp1.posts);
                            System.out.println("\t--------------------------------------------------------------");
                            System.out.println("\t|LIST OF POSTS FROM " + postsName);
                            System.out.println("\t--------------------------------------------------------------");
                            for (int i = 0; i < temp1.posts.size(); i++) {
                                System.out.println("\t" + temp1.posts.get(i).toString());
                                System.out.println(
                                        "\t--------------------------------------------------------------");
                            }
                            System.out.println("");
                        }
                        break;
                    case 6:
                        input.nextLine();
                        System.out.println("Enter an account name:");
                        String postName = input.next();
                        boolean checkTree = users.UserExists(users, postName);
                        if (checkTree == false) {
                            System.out.println("\t>Account name does not exist");
                            System.out.println("");

                        } else {
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
                                temp2.posts.add(new Post(descrip, vid));// Addinging a new post
                                System.out.println("\t>Post was created for " + postName);
                                System.out.println("");
                            } else {
                                System.out.println("Enter a comment");
                                input.nextLine();
                                String com = input.nextLine();
                                temp2.posts.add(new Post(com));// Adding a new post
                                System.out.println("\t>Post was created for " + postName);
                                System.out.println("");
                            }
                        }

                        break;

                    case 7:
                        String li = "";
                        List<String> line = Lines(
                                "dataset.txt");
                        for (int i = 0; i < line.size(); i++) {
                            li = line.get(i);
                            int space = li.indexOf(" ");
                            if (li.substring(0, space).toUpperCase().equals("ADD")) {
                                String newSentence = li.substring(space + 1);
                                space = newSentence.indexOf(" ");
                                String username = newSentence.substring(0, space);
                                newSentence = newSentence.substring(space + 1);
                                space = newSentence.indexOf(" ");
                                String nextWord = newSentence.substring(0, space);
                                if (nextWord.contains(".mpg")) {
                                    String nameofFile = nextWord;
                                    newSentence = newSentence.substring(space + 1);
                                    space = newSentence.indexOf(" ");
                                    String likes = newSentence.substring(0, space);
                                    space = newSentence.indexOf(" ");

                                    String descrip = newSentence.substring(space + 1);
                                    boolean checkNode = users.UserExists(users, username);
                                    if (checkNode == false) {
                                        System.out.println(
                                                "\t!Username does not exit and can therefore not add post!");

                                    } else {
                                        User temp = users.find(new User(username)).data;
                                        temp.addPost(descrip, nameofFile, likes);
                                        System.out.println("\t>Post was created for " + username);
                                    }

                                } else {
                                    String descrip = newSentence.substring(space + 1);
                                    boolean checkNode = users.UserExists(users, username);
                                    if (checkNode == false) {
                                        System.out.println(
                                                "\t!Username does not exit and can therefore not add post!");
                                    } else {
                                        User temp = users.find(new User(username)).data;
                                        temp.addPost(descrip, nextWord);
                                        System.out.println("\t>Post was created for " + username);

                                    }
                                }

                            } else if (li.substring(0, space).toUpperCase().equals("CREATE")) {
                                String newSentence = li.substring(space + 1);
                                space = newSentence.indexOf(" ");
                                String user_name = newSentence.substring(0, space);
                                boolean checker = users.UserExists(users, user_name);
                                if (checker == false) {
                                    String descript = newSentence.substring(space + 1);
                                    users.insert(new User(user_name, descript));
                                    System.out.println("\t>Account was created for " + user_name);
                                } else {
                                    System.out.println("Username already exists. Please input a unique username.");
                                }
                            }
                        }
                        break;
                    case 8:
                        System.out.println("-----------------------------------------------------------------");
                        System.out.println("\t\t # THANK YOU FOR USING TOKTIK!! #");
                        System.out.println("-----------------------------------------------------------------");
                        input.close();
                        bool = false;
                        break;

                    default:
                        System.out.println("Invalid input. Please try again.");
                        System.out.println("");
                        break;

                }

            } catch (InputMismatchException e) {
                System.out.println("Please enter a number between 1 and 8.");
                input.next();
                continue;
            }

        }

    }

    /**
     * This method takes in the path of a file. It then reads all the lines in the
     * file and saves them in a list.
     * 
     * @param route ,which is the relative path of the textfile
     * @return the lines in the textfile as a list
     */
    private static List<String> Lines(String route) {
        List<String> l;
        try {
            l = Files.readAllLines(Paths.get(route));// reading all the lines in the file
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
        return l;
    }

}
