package interview;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
public class InorderIterative {
Node root;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    InorderIterative obj=new InorderIterative();
    obj.root=new Node(10);
    Node one=new Node(20);
    Node two=new Node(30);
    Node three=new Node(40);
    Node four=new Node(50);
    Node five=new Node(60);
    
        obj.root.left=one;
        obj.root.right=two;
        one.left=three;
        one.right=four;
        two.left=five;
        obj.inOrder(obj.root);
	}
	
public void inOrder(Node root){
	Stack<Node> s=new Stack<Node>();
	while(true){
		if(root!=null){
			s.push(root);
			root=root.left;
		}else{
			if(s.isEmpty())break;
			root=s.pop();
			System.out.print(root.data+" ");
			root=root.right;
		}
	}
}	
	
}
	

