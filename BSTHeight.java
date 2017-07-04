package interview;
import java.util.Queue;
import java.util.LinkedList;
public class BSTHeight {
Node root;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BSTHeight bst=new BSTHeight();
		bst.insert(25);
		bst.insert(15);
		bst.insert(30);
		bst.insert(10);
		bst.insert(18);
		bst.insert(40);
		bst.insert(20);
		bst.insert(24);
		System.out.println("\nLevel Order Traversal is");
		bst.levelorder(bst.root);
		System.out.println("\nHeight of tree is ");
		System.out.println(bst.height(bst.root));
    	
	}

	public int height(Node root){
		if(root==null)return -1;
		int left_height=height(root.left);
		int right_height=height(root.right);
		return Math.max(left_height, right_height)+1;
	}
	
	public void insert(int key){
		root=insert_recursive(key, root);
	}
	
	
	public Node insert_recursive(int key,Node root) {
		// TODO Auto-generated method stub
		if(root==null){
			root=new Node(key);
			return root;
		}
		
		if(key<root.data){
			root.left=insert_recursive(key, root.left);
		}else if(key>root.data){
			root.right=insert_recursive(key, root.right);
		}
		
		return root;
		
	}
	
	public void levelorder(Node root)
	{if(root==null){
		System.out.println("Tree is empty");
		return;
	}
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
