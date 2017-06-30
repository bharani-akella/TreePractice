package interview;

public class InitialTreeTest {
Node root;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        InitialTreeTest t=new InitialTreeTest();   
		t.root=new Node('A');
        Node lchild=new Node('B');
        Node rchild=new Node('C');
        t.root.left=lchild;
        t.root.right=rchild;
        System.out.println("Preorder traversal->");
        t.preorder(t.root);
        System.out.println("\nInorder traversal->");
        t.inorder(t.root);
        System.out.println("\nPostorder traversal->");
        t.postorder(t.root);
	}

	public void preorder(Node root){
		if(root==null)return;
		System.out.print(root.data+" ");
		preorder(root.left);
		preorder(root.right);
	}
	
	public void inorder(Node root){
		if(root==null)return;
		preorder(root.left);
		System.out.print(root.data+" ");
		preorder(root.right);
	}
	
	public void postorder(Node root){
		if(root==null)return;
		preorder(root.left);
		preorder(root.right);
		System.out.print(root.data+" ");
	}
	
}
