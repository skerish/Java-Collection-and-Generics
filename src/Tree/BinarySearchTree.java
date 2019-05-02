package Tree;

class Node{
    int data;
    Node left;
    Node right;
}

class Tree{

    public Node insert(Node root, int val){
        if(root == null){
            root = new Node();
            root.data = val;
        }
        else if(val < root.data){
            root.left = insert(root.left, val);
        }
        else {
            root.right = insert(root.right, val);
        }

        return root;
    }

    public void inorder(Node node){

        if(node == null){
            return;
        }
        inorder(node.left);
        System.out.print(node.data + " ");
        inorder(node.right);
    }

    public void preorder(Node node){

        if(node == null){
            return;
        }
        System.out.print(node.data + " ");
        preorder(node.left);
        preorder(node.right);
    }

    public void postorder(Node node){

        if(node == null){
            return;
        }
        postorder(node.left);
        postorder(node.right);
        System.out.println(node.data);
    }

}

public class BinarySearchTree {

    public static void main(String[] args) {

        Node root = null;
        Tree bst = new Tree();

        root = bst.insert(root, 8);
        root = bst.insert(root, 3);
        root = bst.insert(root, 6);
        root = bst.insert(root, 10);
        root = bst.insert(root, 4);
        root = bst.insert(root, 7);
        root = bst.insert(root, 1);
        root = bst.insert(root, 14);
        root = bst.insert(root, 13);

        bst.postorder(root);
    }
}
