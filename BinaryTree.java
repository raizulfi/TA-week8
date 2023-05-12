class Node {
    int data;
    Node left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }
}

 public class BinaryTree {
    Node root;

    public BinaryTree() {
        root = null;
    }

    public int maxValue(Node node) {
        if (node == null)
            return -1; 

        int max = node.data;
        int lmax = maxValue(node.left);
        int rmax = maxValue(node.right);
    
        if (lmax > max) max = lmax;
        if (rmax > max) max = rmax;
        return max;
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        tree.root = new Node(12);
        tree.root.left = new Node(12);
        tree.root.right = new Node(43);
        tree.root.left.left = new Node(43);
        tree.root.left.right = new Node(12);
        tree.root.right.left = new Node(15);
        tree.root.right.right = new Node(6);

        int mvalue = tree.maxValue(tree.root);
        System.out.println("Max value : " + mvalue + " ☜(ﾟヮﾟ☜)");
        
    }
}
