package interview;
import java.util.Queue;
import java.util.LinkedList;
public class LevelOrderLevelByLevel {
Node root;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
            
            LevelOrderLevelByLevel lo=new LevelOrderLevelByLevel();
            lo.root=new Node('a');
            Node one=new Node('b');
            Node two=new Node('c');
            Node three=new Node('d');
            Node four=new Node('e');
            Node five=new Node('f');
            Node six=new Node('g');
            
            lo.root.left=one;
            lo.root.right=two;
            one.left=three;
            one.right=four;
            two.left=five;
            two.right=six;
            lo.levelOrder(lo.root);
	}
	
	public void levelOrder(Node root){
		if(root==null)return;
		Queue<Node> q=new LinkedList<Node>(); 
		q.add(root);
		Node temp;
		
		while(true){
			int nodeCount=q.size();
			if(nodeCount==0)break;
			while(nodeCount>0){
				temp=q.poll();
				System.out.print(temp.data+" ");
				if(temp.left!=null){
					q.add(temp.left);
				}
				if(temp.right!=null){
					q.add(temp.right);
				}
				nodeCount--;
			}
			System.out.println(" ");
		}	
		}
		

}
