package BinaryTree;


import java.util.LinkedList;
import java.util.Queue;

public class adding{
    static class Node{
        int data;
        Node Left;
        Node Right;
        Node(int data)
        {
            this.data=data;
            this.Left=null;
            this.Right=null;
        }
        public static class BinaryTree{

            static int idx =-1;
            public static Node buildtree(int node[]){
                idx++;
                if(node[idx]==-1)
                {
                    return null;
                }

                Node newNode = new Node(node[idx]);
                newNode.Left = buildtree(node);
                newNode.Right = buildtree(node);

                return newNode;
            }
        }

    }
    public static void preorder (Node root)
    {
        if(root==null)
        {
          return ;
        }
        System.out.print(root.data+" ");
        preorder(root.Left);
        preorder(root.Right);

    }
    public static void inorder (Node root)
    {
        if(root==null)
        {
            return;
        }
        inorder(root.Left);
        System.out.print(root.data+" ");
        inorder(root.Right);

    }    public static void postorder (Node root)
    {
        if(root==null)
        {
            return;
        }
        postorder(root.Left);
        postorder(root.Right);
        System.out.print(root.data+" ");
    }
    public static void levelorder (Node root)
    {
        if(root==null)
        {
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty())
        {
            Node currNode = q.remove();
            if(currNode==null) {
                System.out.println();
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            }else {
                System.out.print(currNode.data+" ");
                if (currNode.Left != null)
                    q.add(currNode.Left);
                if (currNode.Right != null)
                    q.add(currNode.Right);
            }
        }
    }
    public static void main(String[] args) {
        int node[] ={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Node.BinaryTree tree = new Node.BinaryTree();
        Node root = tree.buildtree(node);
        System.out.println(root.data);
        System.out.println("The Pre Order :");
        preorder(root);
        System.out.println();
        System.out.println("The InOrder ");
        inorder(root);
        System.out.println();
        System.out.println("The Post Order");
        postorder(root);
        System.out.println("Level Order :");
        levelorder(root);
    }
}