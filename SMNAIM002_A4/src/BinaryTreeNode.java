/**
 * This class defines a singular tree node in a Binary Tree and its attributes
 */
public class BinaryTreeNode {
    User data;// The data being saved at each node of type User
    BinaryTreeNode left;// left child node
    BinaryTreeNode right;// right child node

    /**
     * This is the constructor for BinaryTreeNode. Here, a specific node in the
     * Binary Search Tree is created. Its attributes are initialised with data of
     * type User, and a left and right child of type BinaryTreeNode
     * 
     * @param d the User object.
     * @param l the left node.
     * @param r the right node.
     */
    public BinaryTreeNode(User d, BinaryTreeNode l, BinaryTreeNode r) {
        data = d;
        left = l;
        right = r;
    }

    /**
     * This method returns the left child node of the current node
     * 
     * @return the left node.
     */
    BinaryTreeNode getLeft() {
        return left;
    }

    /**
     * This method returns the right child node of the current node
     * 
     * @return the right node.
     */
    BinaryTreeNode getRight() {
        return right;
    }

}
