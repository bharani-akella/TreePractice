import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class SumofAllNodes {
Node root;
	public static void main(String[] args) {
		SumofAllNodes obj=new SumofAllNodes();
		
		obj.insert(1);
		obj.insert(2);
		//obj.insert(3);
		//obj.insert(4);
		obj.insert(5);
		//obj.insert(6);
		
		int mysum=obj.sum(obj.root, 0);
		System.out.println(mysum);
      
	}
	
	public void insert(int key){
	root=insert_rec(root,key);	
	}

	public Node insert_rec(Node root, int key) {
		if(root==null){
			return new Node(key);
		}
		else if(key<root.data){
			root.left=insert_rec(root.left, key);
		}
		else if(key>root.data){
			root.right=insert_rec(root.right, key);
		}
		
		return root;
	}
		
	public void levelTraverse(Node root){
		Queue<Node> q=new LinkedList<Node>();
		q.add(root);
		while(true){
			int count=q.size();
			if(count<=0){
				break;
			}
			while(count>0){
				Node temp=q.poll();
				System.out.print(temp.data+"->");
				if(temp.left!=null){
					q.add(temp.left);
				}
				if(temp.right!=null){
					q.add(temp.right);
				}
				count--;
			}
			System.out.println("");
		}
		
	}
	
	public int sum(Node root,int result){
		if(root==null)return 0;
		result=root.data;
		result=result+sum(root.left,result)+sum(root.right,result);
		return result;
	}
	
	
}
