import java.util.*;
public class bfs {
    public static class Node{
        int data;
        Node left;  // null
        Node right;  // null

        public Node(int data){
            this.data = data;
        }
    }
    public static void bfsprint(Node root){  // Iterative approach to print
        Queue<Node> q = new LinkedList<>();  // Make a queue
        if(root!= null) q.add(root);         // check if root null toh nhi hai
        while(q.size()>0){                   // checks until the queue is empty
            
            Node temp = q.peek();
            if(temp.left!=null) q.add(temp.left);
            if(temp.right!= null) q.add(temp.right);
            System.out.print(temp.data + " ");
            q.remove();
        }
      
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
        bfsprint(root);
    }
}
