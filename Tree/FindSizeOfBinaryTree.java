public class FindSizeOfBinaryTree
{
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        root.left.left.left = new Node(8);
        System.out.println(findSize(root));
    }
    public static int findSize(Node root){

        if(root == null) {
        return 0;
        }
        return findSize(root.left)+findSize(root.right)+1;
    }
}
