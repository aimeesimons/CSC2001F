
public class BinaryTreeNode {
    User data;
    BinaryTreeNode left;
    BinaryTreeNode right;

    public BinaryTreeNode(User d, BinaryTreeNode l, BinaryTreeNode r) {
        data = d;
        left = l;
        right = r;
    }

    BinaryTreeNode getLeft() {
        return left;
    }

    BinaryTreeNode getRight() {
        return right;
    }

}
