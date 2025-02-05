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
        
    }
}
