import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class LowestCommonAncestor {
Node root;
	public static void main(String[] args) {
		LowestCommonAncestor obj=new LowestCommonAncestor();
		
		obj.insert(50);
		obj.insert(40);
		obj.insert(60);
		obj.insert(10);
		obj.insert(55);
		obj.insert(12);
		obj.insert(75);
		obj.insert(41);
		obj.insert(80);
		//obj.levelTraverse(obj.root);
       Node my_ancestor= obj.commonAncestor(obj.root, 75, 60);
       System.out.println(my_ancestor.data);
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
	
	
	public Node search(Node root,int key){
		if(root==null || root.data==key){
			return root;
		}
		if(key<root.data){
			return search(root.left,key);
		}
		
		return search(root.right,key);
		
	}
	
		public Node commonAncestor(Node ancestor,int key1,int key2){
			if((ancestor.data>key1 && ancestor.data<key2)||(ancestor.data<key1 && ancestor.data>key2)){
				return ancestor;
			}
			if((ancestor.data>key1 && ancestor.data>key2)){
				return commonAncestor(ancestor.left, key1, key2);
			}
			else
			if((ancestor.data<key1 && ancestor.data<key2)){
				return commonAncestor(ancestor.right, key1, key2);
			}
			return ancestor;
			
		}
	
	
}
