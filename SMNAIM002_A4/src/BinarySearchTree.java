/**
 * This class extends the BinaryTree class and adds additional methods, so as to
 * define a BinarySearchTree, which is a specific type of BinaryTree. This is
 * where everything that is on the left of a node is less than that node and
 * anything on the right of a node is greater than that node.
 */
public class BinarySearchTree extends BinaryTree {

   /**
    * This method takes in a parameter of type User and tries to insert it into the
    * Binary Tree.
    * 
    * @param d the User object that needs to be inserted.
    */
   public void insert(User d) {
      if (root == null)
         root = new BinaryTreeNode(d, null, null);
      else
         insert(d, root);
   }

   /**
    * This method will compare the data of the user with each node and insert the
    * User into the Binary Tree
    * 
    * @param d    the User object that needs to be inserted.
    * @param node the current node
    */
   public void insert(User d, BinaryTreeNode node) {
      if (d.compareTo(node.data.account) <= 0) {
         if (node.left == null)
            node.left = new BinaryTreeNode(d, null, null);
         else
            insert(d, node.left);
      } else {
         if (node.right == null)
            node.right = new BinaryTreeNode(d, null, null);
         else
            insert(d, node.right);
      }
   }

   /**
    * This method will be called when wanting to find a specific account
    * 
    * @param d the User object that needs to be found.
    * @return the node
    */
   public BinaryTreeNode find(User d) {
      if (root == null)
         return null;
      else
         return find(d, root);
   }

   /**
    * This method will be called when wanting to find a specific account. Variable
    * {d} of type User will be compared with each node. If the User is equal to any
    * node, that node will be returned. If not, null will be returned.
    * 
    * @param d    the User object that needs to be found.
    * @param node which is compared to the data of {d}.
    * @return the node.
    */
   public BinaryTreeNode find(User d, BinaryTreeNode node) {
      if (d.compareTo(node.data.account) == 0)
         return node;
      else if (d.compareTo(node.data.account) < 0)
         return (node.left == null) ? null : find(d, node.left);
      else
         return (node.right == null) ? null : find(d, node.right);
   }

   /**
    * This method takes in a variable of type User and attempts to delete the user
    * from the BinarySearchTree
    * 
    * @param d Which is the User which is to be deleted.
    */
   public void delete(User d) {
      root = delete(d, root);
   }

   /**
    * This method will attempt to find a user and delete that user from the Tree,
    * while also restructuring the tree so that it still functions as a
    * BinarySearchTree.
    * 
    * @param d    User variable
    * @param node current node that we are comparing to.
    * @return the node, if the account exists, or null if not.
    */
   public BinaryTreeNode delete(User d, BinaryTreeNode node) {
      if (node == null)
         return null;
      if (d.compareTo(node.data.account) < 0)
         node.left = delete(d, node.left);
      else if (d.compareTo(node.data.account) > 0)
         node.right = delete(d, node.right);
      else if (node.left != null && node.right != null) {
         node.data = findMin(node.right).data;
         node.right = removeMin(node.right);
      } else if (node.left != null)
         node = node.left;
      else
         node = node.right;
      return node;
   }

   /**
    * This method returns the node with the minimum value
    * 
    * @param node which is currently being visited.
    * @return the node
    */
   public BinaryTreeNode findMin(BinaryTreeNode node) {
      if (node != null)
         while (node.left != null)
            node = node.left;
      return node;
   }

   /**
    * This method removes the minimum value and replaces it.
    * 
    * @param node which is currently being visited.
    * @return the node
    */
   public BinaryTreeNode removeMin(BinaryTreeNode node) {
      if (node == null)
         return null;
      else if (node.left != null) {
         node.left = removeMin(node.left);
         return node;
      } else
         return node.right;
   }

   /**
    * This method determines whether an account exists or not. The .find method is
    * called, to determine whether the account is present in the tree.
    * 
    * @param tree     The BinarySearchTree that was initialised in the main method.
    * @param UserName the username which was provided via user input.
    * @return true or false depending on whether the user exists.
    */
   public boolean UserExists(BinarySearchTree tree, String UserName) {
      BinaryTreeNode check = tree.find(new User(UserName));
      if (check == null) {
         return false;
      } else {
         return true;

      }

   }

   /**
    * If the user is found to exist, this method is called to return the node.
    * 
    * @param tree     The BinarySearchTree that was initialised in the main method.
    * @param UserName the username which was provided via user input.
    * @return the node that the user was found at.
    */
   public BinaryTreeNode userfound(BinarySearchTree tree, String UserName) {
      return tree.find(new User(UserName));
   }

}
