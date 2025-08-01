class Node{
    int data,ht;
    Node left,right;
    Node(int d){
        data=d;
        ht=0;
        left=null;
        right=null;
    }
}
class BST{
    Node root;
    BST(int val){
        root=new Node(val);
    }
    public void insert(int v){
         root=helper(root,v);
    }
    public int height(Node n){
        if(n==null) return -1;
        return n.ht;
    }  
    public Node helper(Node n,int v){
        if(n==null) return new Node(v);
        if(v>n.data)
        n.right=helper(n.right,v);
        else if(v<n.data)
        n.left=helper(n.left,v);
        else
        return n;
        
        n.ht=Math.max(height(n.left),height(n.right))+1;
        int balancefact=height(n.left)-height(n.right);
        
        //LL bf pos key<node val
        if(balancefact>1 && v<n.left.data)
                return rightRotate(n);
        //LR
        if(balancefact>1 && v>n.left.data)
            {n.left=leftRotate(n.left);
            return rightRotate(n);}
        //RR
        if(balancefact<-1 && v>n.right.data)
                return leftRotate(n);
        //RL
        if(balancefact<-1 && v<n.right.data)
               { n.right=rightRotate(n.right);
                return leftRotate(n);}
        return n;
    }
    public Node leftRotate(Node x){
        Node y=x.right;
        Node s1=y.left;
        y.left=x;
        x.right=s1;
        x.ht = Math.max(height(x.left),height(x.right)) + 1;
        y.ht = Math.max(height(y.left),height(y.right)) + 1;
        return y;
    }
    public Node rightRotate(Node z){
        Node y=z.left;
        Node s2=y.right;
        y.right=z;
        z.left=s2;
        z.ht = Math.max(height(z.left),height(z.right)) + 1;
        y.ht = Math.max(height(y.left),height(y.right)) + 1;
        return y;
    }
    
    public void inOrder(Node n){
        if(n!=null){
        inOrder(n.left);
        System.out.print(n.data+" ");
        inOrder(n.right);
    }
    }
}
public class Main
{
	public static void main(String[] args) {
	    BST tree=new BST(63);
	    tree.insert(9);
	    tree.insert(19);
	    tree.insert(2);
	   
	    tree.inOrder(tree.root);
	}
}