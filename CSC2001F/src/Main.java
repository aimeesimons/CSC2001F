import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.attribute.UserDefinedFileAttributeView;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        BinarySearchTree users = new BinarySearchTree();
        Scanner input = new Scanner(System.in);
        User aimee = new User("aimee", "small girl");

        users.insert(aimee);
        users.insert(new User("erin", "tall girl"));
        users.insert(new User("maxine", "cute girl"));

        // System.out.println(users.root.data);
        // }
        // users.inOrder();
        // BinaryTreeNode search = users.find(new User("aimee"));
        // if (search == null) {
        // System.out.println("Does not exist");

        // } else {
        // System.out.println("The profile description is : " +
        // search.data.Description);
        // }

        // System.out.println("Enter the account name:");
        // String AccountName = input.next();
        // User comp_User = new User(AccountName);
        // User temp_User = users.find(comp_User).data;
        // String deString = temp_User.Description;
        // if (comp_User == null) {
        // System.out.println("Account does not exist");
        // } else {
        // System.out.println("The profile description is: " + comp_User.Description);

        // System.out.println("Choose an action from the menu:");
        // System.out.println(
        // "1. Find the profile description for a given account\n2. List all
        // accounts\n3. Create an account\n4. Delete an account\n5. Display all posts
        // for a single account\n6. Add a new post for an account\n7. Load a file of
        // actions from disk and process this\n8. Quit");
        // System.out.println("Enter your choice:");
        // int choice = input.nextInt();

        // while (choice != 8) {
        // switch (choice) {
        // case 1:
        // System.out.println("Enter the account name:");
        // User tUser = new User();
        // tUser.setUser("aimee");
        // BinaryTreeNode search = users.find(tUser);
        // if (search == null) {
        // System.out.println("Does not exist");

        // } else {
        // System.out.println("The profile description is: " +
        // search.data.Description);
        // }
        // System.out.println(search);

        // break;

        // case 2:
        // System.out.println("Listing all the accounts");
        // users.postOrder();
        // break;
        // case 3:
        // System.out.println("Enter an account name:");
        // String Name = input.next();
        // System.out.println("Privide a profile description:");
        // String description = input.nextLine();
        // User newAccount = new User(Name, description);
        // users.insert(newAccount);
        // System.out.println("Account has been created!");
        // break;
        // case 4:
        // System.out.println("Enter the account name which you would like to delete:");
        // String del = input.next();
        // User temp = new User(del);
        // users.delete(temp);
        // System.out.println("Account has been deleted");
        // break;
        // case 5:
        // System.out.println("Enter an account name:");
        // String postsName = input.next();
        // User temp1 = new User(postsName);
        // temp1 = users.find(temp1).data;
        // Collections.reverse(temp1.posts);
        // for (int i = 0; i < temp1.posts.size(); i++) {
        // System.out.println(temp1.posts.get(i).toString());
        // }
        // break;
        // case 6:
        // System.out.println("Enter an account name:");
        // String postName = input.next();
        // User temp2 = new User(postName);
        // temp2 = users.find(temp2).data;
        // System.out.println("Would you like to post a video? y/n");
        // String ans = input.next().toUpperCase();
        // if (ans == "Y") {
        // System.out.println("Enter the video file name");
        // String vid = input.next();
        // System.out.println("Enter a Title");
        // String descrip = input.nextLine();
        // temp2.posts.add(new Post(descrip, vid));
        // } else {
        // System.out.println("Enter a comment");
        // String com = input.nextLine();
        // temp2.posts.add(new Post(com));
        // }
        // break;

        // case 7:
        // try {
        // File myObj = new File(
        // "C:/Users/Aimee Simons/Desktop/2023/Lectures/Semester
        // 1/CSC2001F/Assignments/CSC2001F_A4/CSC2001F/dataset.txt");
        // Scanner myReader = new Scanner(myObj);
        // while (myReader.hasNextLine()) {
        // String data = myReader.nextLine();
        // System.out.println(data);
        // }
        // myReader.close();
        // } catch (FileNotFoundException e) {
        // System.out.println("An error occurred.");
        // e.printStackTrace();
        // }
        // }
        // System.out.println("Choose an action from the menu:");
        // System.out.println(
        // "1. Find the profile description for a given account\n2. List all
        // accounts\n3. Create an account\n4. Delete an account\n5. Display all posts
        // for a single account\n6. Add a new post for an account\n7. Load a file of
        // actions from disk and process this\n8. Quit");
        // System.out.println("Enter your choice:");
        // choice = input.nextInt();
        // }
        // System.out.println("Bye!");
    }

}
