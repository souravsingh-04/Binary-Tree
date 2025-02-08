public class binarytree {
    public static class Node{
        int data;
        Node left;  // null
        Node right;  // null

        public Node(int data){
            this.data = data;
        }
    }
    public static void display(Node root){
        if(root == null){  // base case for recursion
            return;  
        }
        System.out.print(root.data+ "-> ");    // first , it print root data
        if(root.left !=null) System.out.print(root.left.data+ " ");  //  then, root ke left wla data
        if(root.right !=null) System.out.print(root.right.data+ " ");  // then, root ke right wla data
        System.out.println();
        display(root.left);  // now , it will start for left (taking root.left as ROOT node)
        display(root.right); // now , it will start for right (taking root.right as ROOT node)

    }
    public static int size(Node root){
        if(root == null){
            return 0;    // base case , if the node is leaf node
        }
        return 1+ size(root.left) +  size(root.right);  // +1, because (root node) + left subtree + right subtree
    }
    public static int sum(Node root){   // calculate the sum of all nodes
        if(root == null){
            return 0;
        }
        return root.data + sum(root.left) + sum(root.right);
    }
    public static int height(Node root){  // to find the height of the binary tree along its edge
        if(root == null) return 0;
        if(root.left == null && root.right == null){
            return 0;
        }
        return 1 + (Math.max(height(root.left),height(root.right)));
    }
    public static int max(Node root){
        if(root == null){
            return Integer.MIN_VALUE;
        }
        int a = root.data;
        int b = max(root.left);
        int c = max(root.right);
        return Math.max(a,Math.max(b, c));
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
        Node e = new Node(6); // e
        b.right = e;
        display(root);
        System.out.println(size(root));
        System.out.println("Sum of all the nodes is: "+ sum(root));
        System.out.println("Maximum value is: "+ max(root));
        System.out.println("Height of the tree is: "+ height(root));
    }
}
