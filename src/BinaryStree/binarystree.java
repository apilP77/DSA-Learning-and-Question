package BinaryStree;

class binarystree{
    static class Node{
        int data;
        Node left;
        Node right;
        Node (int data)
        {
            this.data=data;
        }
    }
    public static Node insert(Node root, int val)
    {
        if(root==null)
        {
            root = new Node(val);
            return root;
        }
        if(root.data>val)
        {
            root.left = insert(root.left,val);
        }else{
            root.right = insert(root.right,val);
        }
        return root;
    }
    public static void display(Node root)
    {
        if(root==null)
        {
            return;
        }
        display(root.left);
        System.out.print(root.data+" ");
        display(root.right);
    }
    public static void search(Node root , int val)
    {
        if(root==null)
        {
            System.out.println("Didnot Found");
            return;
        }
        if(root.data==val)
        {
            System.out.println("Found");
            System.out.println(root.data);
            return;
        }
        if(root.data>val)
        {
            search(root.left,val);
        }else {
            search(root.right,val);
        }
    }
    public static Node delete(Node root , int val)
    {
        if(root== null)
        {
            return root;
        }
        if(root.data>val)
        {
            root.left=delete(root.left,val);
        }else {
            root.right=delete(root.right,val);
        }
        if(root.data==val)
        {
            if(root.left==null && root.right==null){
                return null;
            }else if((root.left == null) )
            {
                return root.right;
            } else if (root.right==null) {
                return root.left;
            }else{
                Node is = inordersucessor(root.right);
                root.data=is.data;
                root.right=delete(root.right,is.data);
            }
        }
        return root;
    }
    public static Node inordersucessor(Node root)
    {
        while(root.left!=null)
        {
            root=root.left;
        }
        return root;
    }
    public static void main(String[] args) {
        int value[] ={5,1,3,4,2,7};
        Node root=null;
        for (int i = 0; i < value.length; i++) {
            root = insert(root, value[i]);
        }
        display(root);
        System.out.println();
        search( root , 100 );
        delete(root,4);
        display(root);
    }
}