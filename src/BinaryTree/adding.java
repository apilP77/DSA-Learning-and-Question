package BinaryTree;


import java.util.LinkedList;
import java.util.Queue;

import static java.lang.Math.max;

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
    public static int countNode(Node root)
    {
        if(root==null)
        {
            return 0;
        }
        int leftnode= countNode(root.Left);
        int rightnode= countNode(root.Right);
        return leftnode+rightnode+1;
    }
    public static int sumofNode (Node root)
    {
        if(root==null)
        {
            return 0;
        }
        int leftnode= sumofNode(root.Left);
        int rightnode= sumofNode(root.Right);
        return leftnode+rightnode+root.data;
    }
    public static int height(Node root)
    {
        if(root==null)
        {
            return 0;
        }
        int leftnode = height(root.Left);
        int rightnode = height(root.Right);
        return max(leftnode+1,rightnode+1);
    }
    public static int diameter(Node root)
    {
        if(root == null)
        {
            return 0;
        }
        int dia1 = diameter(root.Left);
        int dia2 = diameter(root.Right);
        int dia3 = height(root.Left)+height(root.Right)+1;

        return max(dia1,max(dia2,dia3));
    }
    static class treeinfo
    {
        int ht;
        int dia;

        treeinfo(int ht , int dia)
        {
            this.ht=ht;
            this.dia=dia;
        }
    }
    public static treeinfo diameter2(Node root)
    {
        if(root==null)
        {
            return new treeinfo(0,0);
        }
        treeinfo left = diameter2(root.Left);
        treeinfo right = diameter2(root.Right);

        int myheigh = max(left.ht, right.ht)+1;

        int dia1 = left.ht;
        int dia2 = right.ht;
        int dia3 = left.ht+ right.ht+1;

        int mydia = Math.max(dia1,max(dia2,dia3));

        treeinfo myinfo = new treeinfo(myheigh,mydia);
        return myinfo;
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
        System.out.println("Total number of Nodes: ");
        System.out.println(countNode(root));
        System.out.println("The sum of Nodes: ");
        System.out.println(sumofNode(root));
        System.out.println("The height of Nodes :");
        System.out.println(height(root));
        System.out.println("The diameter: ");
        System.out.println(diameter(root));
        System.out.println(diameter2(root).dia);
    }
}