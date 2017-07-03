package interview;
import java.util.Queue;
import java.util.LinkedList;
public class BSTInsertRecursive {
Node root;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BSTInsertRecursive bst=new BSTInsertRecursive();
		bst.insert(13);
		bst.insert(7);
		bst.insert(1);
		bst.insert(15);
		bst.insert(40);
		bst.insert(25);
		System.out.println("Inorder Traversal->");
		bst.inorder(bst.root);

		System.out.println("\nPreOrder Traversal->");
		bst.preorder(bst.root);

		System.out.println("\nPostorder Traversal->");
		bst.postorder(bst.root);
		
		System.out.println("\nLevelorder Traversal->");
		bst.levelorder(bst.root);
		
	}

	public void insert(int key){
		insert_recursive(key, this.root);
	}

	public void insert_recursive(int key,Node root) {
		// TODO Auto-generated method stub
		if(this.root==null){
			this.root=new Node(key);
			return;
		}
		
		if(key<root.data){
			if(root.left==null){
				root.left=new Node(key);
				return;
			}
			insert_recursive(key, root.left);
		}else{
			if(root.right==null){
				root.right=new Node(key);
				return;
			}
			insert_recursive(key, root.right);
		}
	}
	
	public void inorder(Node root){
		if(root==null)return;
		
		inorder(root.left);
		System.out.print(root.data+" ");
		inorder(root.right);
	}
	
	public void preorder(Node root){
		if(root==null)return;
		System.out.print(root.data+" ");
		preorder(root.left);
		preorder(root.right);
	}
	
	public void postorder(Node root){
		if(root==null)return;
		postorder(root.left);
		postorder(root.right);
		System.out.print(root.data+" ");
	}
	
	public void levelorder(Node root)
	{
		Queue<Node> q=new LinkedList<Node>();
		q.add(root);
		Node temp;
		while(!q.isEmpty()){
			temp=q.poll();
			System.out.print(temp.data+" ");
			if(temp.left!=null){
				q.add(temp.left);
			}
			if(temp.right!=null){
				q.add(temp.right);
			}
		}
	}
	
	
}
