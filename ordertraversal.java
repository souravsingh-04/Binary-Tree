public class ordertraversal { public static class Node{
    int data;
    Node left;  // null
    Node right;  // null
    public Node(int data){
        this.data = data;
    }
}
public static void preorder(Node root){     // Root Left Right
    if(root == null){  // base case for recursion
        return;  
    }
    System.out.print(root.data+ " ");    // first , it print root data
    preorder(root.left);  // now , it will start for left (taking root.left as ROOT node)
    preorder(root.right); // now , it will start for right (taking root.right as ROOT node)
}
public static void inorder(Node root){  // Left Root Right
    if(root == null){
        return;
    }
    inorder(root.left);
    System.out.print(root.data+ " ");
    inorder(root.right);
}
public static void postorder(Node root){  // Left Right Root
    if(root == null){
        return;
    }
    postorder(root.left);
    postorder(root.right);
    System.out.print(root.data+ " ");

}
public static void nthlevel(Node root, int n){     // Root Left Right
    if(root == null){  // base case for recursion
        return;  
    }
    if(n==1) System.out.print(root.data+ " ");
    nthlevel(root.left, n-1);  // now , it will start for left (taking root.left as ROOT node)
    nthlevel(root.right, n-1); // now , it will start for right (taking root.right as ROOT node)
}
public static void main(String[] args) {
    Node root = new Node(1);  // root
    Node a = new Node(2);    // a
    Node b = new Node(3);   // b
    root.left = a;
    root.right = b;
    Node c = new Node(4); // c
    Node d = new Node(5); // d
    a.left = c;
    a.right = d;
    Node e = new Node(7); // e
    b.right = e;
    Node f = new Node(6); //f
    b.left = f;
    // preorder(root);
    // System.out.println();
    // inorder(root);
    // System.out.println();
    // postorder(root);
    nthlevel(root, 1);
    System.out.println();
    nthlevel(root, 2);
    System.out.println();
    nthlevel(root, 3);
    System.out.println();
    nthlevel(root, 4);
    
}
}
