package interview;
import java.util.Stack;
import java.util.LinkedList;
public class BSTZigZagLevelOrder {
Node root;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BSTZigZagLevelOrder bst=new BSTZigZagLevelOrder();
		bst.insert(50);
		bst.insert(25);
		bst.insert(75);
		bst.insert(20);
		bst.insert(30);
		bst.insert(60);
		bst.insert(100);
		bst.insert(40);
		bst.insert(70);
		bst.insert(120);
		//bst.insert(40);
		
		bst.zigzag(bst.root);
	}

	public void zigzag(Node node){
		Stack<Node> s1=new Stack<Node>();
		Stack<Node> s2=new Stack<Node>();
		Node temp;
		s1.push(node);
	    while(!s1.isEmpty()|| !s2.isEmpty()){
	    	while(!s1.isEmpty()){
	    		temp=s1.peek();
		    	s1.pop();
		    	System.out.print(temp.data+" ");
		    	if(temp.right!=null){
		    		s2.push(temp.right);
		    	}
		    	if(temp.left!=null){
		    		s2.push(temp.left);
		    	}
		 
	    	}
	    	
	    	while(!s2.isEmpty()){
	    		temp=s2.peek();
	    		s2.pop();
	    		System.out.print(temp.data+" ");
	    		if(temp.left!=null){
	    			s1.push(temp.left);
	    		}
	    		if(temp.right!=null){
	    			s1.push(temp.right);
	    		}
	    	}
	    	   }
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
	
		
	
}
