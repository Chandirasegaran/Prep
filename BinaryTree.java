public class BinaryTree{
    Node root;
    class Node{
        int data;
        Node left, right;
        public Node(int d){
            data=d;
            left=null;
            right=null;
        }
    }
    public BinaryTree(int d){
        root=new Node(d);
    }
    public void insertLeft(Node r, int d){
        Node newNode = new Node(d);
        r.left=newNode;
    }
    public void insertRight(Node r, int d){
        Node newNode = new Node(d);
        r.right=newNode;
    }

    public void preOrder(Node root){
        if(root!=null){
            System.out.print(root.data+" ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }
    public void inOrder(Node root){
        if(root!=null){
            inOrder(root.left);
            System.out.print(root.data+" ");
            inOrder(root.right);
        }
    }
    public void postOrder(Node root){
        if(root!=null){
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data+" ");
        }
    }
    public static void main(String[] args) {
        System.out.println("Binary Tree");
        BinaryTree tree = new BinaryTree(1);       
        tree.insertLeft(tree.root, 2); 
        tree.insertRight(tree.root, 3);
        tree.insertLeft(tree.root.left, 4); 
        tree.insertLeft(tree.root.right, 5);
        tree.insertLeft(tree.root.right.left, 7);
        tree.insertRight(tree.root.right.left, 8);
        tree.insertRight(tree.root.right, 6);

        tree.preOrder(tree.root);
        System.out.println();
        tree.inOrder(tree.root);
        System.out.println();
        tree.postOrder(tree.root);

    }
}