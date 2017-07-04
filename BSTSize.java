package interview;
import java.util.Queue;
import java.util.LinkedList;
public class BSTSize {
Node root;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BSTSize bst=new BSTSize();
		bst.insert(13);
		bst.insert(7);
		bst.insert(1);
		bst.insert(15);
		bst.insert(40);
		bst.insert(25);
		
		System.out.println("\nSize of tree is ");
		System.out.println(bst.size());
    	
	}

	public void insert(int key){
		root=insert_recursive(key, root);
	}
	
	public int size(){
		
		return sizeRecursive(root);
	}
	
	public int sizeRecursive(Node root){
		if(root==null)return 0;
		
		return 1+sizeRecursive(root.left)+sizeRecursive(root.right);
		
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
