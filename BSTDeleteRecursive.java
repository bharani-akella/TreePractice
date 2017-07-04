package interview;
import java.util.Queue;
import java.util.LinkedList;
public class BSTDeleteRecursive {
Node root;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BSTDeleteRecursive bst=new BSTDeleteRecursive();
		bst.insert(13);
		bst.insert(7);
		bst.insert(1);
		bst.insert(15);
		bst.insert(40);
		bst.insert(25);
		System.out.println("Inorder Traversal->");
		bst.inorder(bst.root);
        bst.delete(25);
    	System.out.println("\nInorder Traversal->");
    	bst.inorder(bst.root);
    	bst.delete(1);
    	System.out.println("\nInorder Traversal->");
    	bst.inorder(bst.root);
    	
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
	
	public void delete(int key){
		root=delete_Recursive(key,root);
	}
	
	public Node delete_Recursive(int key, Node root) {
		
		if(root==null){
			return root;
		}
		
		if(key<root.data){
			root.left=delete_Recursive(key, root.left);
		}else if(key>root.data){
			root.right=delete_Recursive(key, root.right);
		}
		else{
			
			if(root.left==null){
				return root.right;
			}else if(root.right==null){
				return root.left;
			}
			
			root.data=minRight(root.right);
			root.right=delete_Recursive(root.data, root.right);
		}
		
		return root;
	}

	public int minRight(Node root) {
		// TODO Auto-generated method stub
		int minV=root.data;
		while(root.left!=null){
			minV=root.left.data;
			root=root.left;
		}
		return minV;
	}

	public void inorder(Node root){
		if(root==null)return;
		
		inorder(root.left);
		System.out.print(root.data+" ");
		inorder(root.right);
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
