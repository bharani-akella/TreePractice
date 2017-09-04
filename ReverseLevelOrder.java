import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseLevelOrder {
Node root;
	public static void main(String[] args) {
		ReverseLevelOrder tree=new ReverseLevelOrder();
		tree.root=new Node(10);
		
		Node one=new Node(20);
		Node two=new Node(30);
		Node three=new Node(40);
		Node four=new Node(50);
		Node five=new Node(60);
		Node six=new Node(70);
		
		tree.root.left=one;
		tree.root.right=two;
		
		one.left=three;
		one.right=four;
		
		two.left=five;
		two.right=six;
		
		tree.levelOrder(tree.root);
		
		
	}
	
	public void inOrder(Node root){
		if(root==null){return;}
		
		inOrder(root.left);
		System.out.print(root.data+"->");
		inOrder(root.right);
	}
	
	public void postOrder(Node root){
		if(root==null){return;}
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.data+"->");
	}
	
	public void preOrder(Node root){
		if(root==null){return;}
		System.out.print(root.data+"->");
		preOrder(root.left);
		preOrder(root.right);
	}
	
	public void levelOrder(Node root){
		Queue<Node> q=new LinkedList<Node>();
		Stack<Node> s=new Stack<Node>();
		
		q.add(root);
		
		while(!q.isEmpty()){
			Node temp=q.poll();
			s.push(temp);
			if(temp.left!=null){
				q.add(temp.left);
			}
			if(temp.right!=null){
				q.add(temp.right);
			}
		}
		
		while(!s.isEmpty()){
			System.out.print(s.pop().data+"->");
		}
		
		
	}

}
