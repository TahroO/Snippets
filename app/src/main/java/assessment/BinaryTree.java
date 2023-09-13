package assessment;

public class BinaryTree {

    private Node root;

    class Node {
        protected int value;
        protected Node left;
        protected Node right;
        protected int count = 0;
    }

    public BinaryTree() {
        root = null;
    }

    protected void createNode(int value) {
        boolean inserting = true;
        Node newNode = new Node();
        newNode.value = value;
        if (root == null) {
            root = newNode;
            inserting = false;
        }
        Node actualNode = root;
        while (inserting) {
            if (value > actualNode.value && actualNode.right == null) {
                actualNode.right = newNode;
                inserting = false;
            } else if (value < actualNode.value && actualNode.left == null) {
                actualNode.left = newNode;
                inserting = false;
            } else if (value == actualNode.value) {
                actualNode.count++;
                inserting = false;
            }
        }
    }

    protected void printLeftTree() {
        if (root != null) {
            Node actualNode = root;
            while (actualNode.left != null) {
                System.out.println("[" + actualNode.value + "]");
                System.out.println("|");
                actualNode = actualNode.left;
            }
        }
    }
    public void addNode(int value) {
        createNode(value);
    }
    public void printLeftPart() {
        printLeftTree();
    }
}
