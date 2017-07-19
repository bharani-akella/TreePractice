package interview;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
public class MirrorTree {
Node root;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    MirrorTree obj=new MirrorTree();
    obj.root=new Node(10);
    Node one=new Node(20);
    Node two=new Node(30);
    Node three=new Node(40);
    Node four=new Node(50);
    Node five=new Node(60);
    Node six=new Node(70);
    
        obj.root.left=one;
        obj.root.right=two;
        one.left=three;
        one.right=four;
        two.left=five;
        two.right=six;
        
        System.out.println("Initial Tree Inorder Traversal->");
        obj.inOrder(obj.root);
        System.out.println("");
        System.out.println("Mirror Tree Inorder Traversal-->");
        
     obj.root= obj.swap(obj.root);  
      obj.inOrder(obj.root);
      	}
	
	public Node swap(Node root){
		if(root==null)return root;
		
		Node left=swap(root.left);
		Node right=swap(root.right);
		
		root.left=right;
		root.right=left;
		
		return root;
		
}
	
	public void inOrder(Node root){
		if(root==null)return;
		inOrder(root.left);
		System.out.print(root.data+" ");
		inOrder(root.right);
	}
	

	
}
