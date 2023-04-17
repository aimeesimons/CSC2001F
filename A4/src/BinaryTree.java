/**
 * This class defines the structure and methods of a Binary Tree.
 */
public class BinaryTree {
   BinaryTreeNode root;// creating the root node
   int count = 0;

   /**
    * This constructor of BinaryTree initialises the root node as being null.
    */
   public BinaryTree() {
      root = null;
   }

   /**
    * This method returns the height of the BinaryTree.
    * 
    * @return the height of the tree.
    */
   public int getHeight() {
      return getHeight(root);
   }

   /**
    * This method returns the height of the BinaryTree and moves recursively down
    * the tree to determine its height.
    * 
    * @return the height of the tree.
    */
   public int getHeight(BinaryTreeNode node) {
      if (node == null)
         return -1;
      else
         return 1 + Math.max(getHeight(node.getLeft()), getHeight(node.getRight()));
   }

   /**
    * This method returns the size of the BinaryTree.
    * 
    * @return the size of the tree.
    */
   public int getSize() {
      return getSize(root);
   }

   /**
    * This method returns the size of the BinaryTree and moves recursively down
    * the tree to determine its size.
    * 
    * @return the size of the tree.
    */
   public int getSize(BinaryTreeNode node) {
      if (node == null)
         return 0;
      else
         return 1 + getSize(node.getLeft()) + getSize(node.getRight());
   }

   /**
    * The visit method allows us to access each node. This method
    * prints out the data of the current node.
    * 
    * @param node the current node being visited.
    */
   public void visit(BinaryTreeNode node) {
      System.out.println("\t" + node.data.toString());
   }

   /**
    * preOrder traversal is when the program vists the node before visiting its
    * children nodes.
    */
   public void preOrder() {
      preOrder(root);
   }

   /**
    * preOrder traversal is when the program vists the node before visiting its
    * children nodes. The order in which the children nodes are visited is
    * convetionally the left child node and then the right child node.
    * 
    * @param node the current node being visited.
    */
   public void preOrder(BinaryTreeNode node) {
      if (node != null) {
         visit(node);
         preOrder(node.getLeft());
         preOrder(node.getRight());
      }
   }

   /**
    * postOrder traversal is when the program visits node of visiting the childen
    * nodes.
    */
   public void postOrder() {
      postOrder(root);
   }

   /**
    * postOrder traversal is when the program visits node of visiting the childen
    * nodes. The order in which the children nodes are visited is
    * convetionally the left child node and then the right child node.
    * 
    * @param node the current node being visited.
    */
   public void postOrder(BinaryTreeNode node) {
      if (node != null) {
         postOrder(node.getLeft());
         postOrder(node.getRight());
         visit(node);
      }
   }

   /**
    * inOrder traversal is when the program visits the node after the left child
    * but before the left child.
    */
   public void inOrder() {
      inOrder(root);
   }

   /**
    * inOrder traversal is when the program visits the node after the left child
    * but before the left child.
    * 
    * @param node the current node being visited.
    */
   public void inOrder(BinaryTreeNode node) {
      if (node != null) {
         inOrder(node.getLeft());
         visit(node);
         count += 1;

         inOrder(node.getRight());
      }
   }

}
