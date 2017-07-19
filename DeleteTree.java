package interview;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
public class DeleteTree {
Node root;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    DeleteTree obj=new DeleteTree();
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
        
      obj.deleteTree(obj.root);  
      	}
	
	public void deleteTree(Node root){
		if(root==null)return ;
		
deleteTree(root.left);
deleteTree(root.right);

System.out.println("The deleted node is "+root.data);
root=null;
	
}
	

	
}
