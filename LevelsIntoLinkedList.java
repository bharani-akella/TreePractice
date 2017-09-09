import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class LevelsIntoLinkedList {
Node root;
	public static void main(String[] args) {
		LevelsIntoLinkedList obj=new LevelsIntoLinkedList();
		
		obj.insert(50);
		obj.insert(40);
		obj.insert(60);
		obj.insert(10);
		obj.insert(55);
		obj.insert(12);
		obj.insert(75);
		obj.insert(41);
		obj.insert(80);
		obj.levelTraverse(obj.root);
        obj.createLinkedList(obj.root);
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
	
	public void createLinkedList(Node root){
		Queue<Node> q=new LinkedList<Node>();
		LinkedList<LinkedList<Integer>> llfinal=new LinkedList<LinkedList<Integer>>();
		
		q.add(root);
	
		while(true){
			int count=q.size();
			LinkedList<Integer> ll=new LinkedList<Integer>();
			if(count<=0){
				break;
			}
			while(count>0){
				Node temp=q.poll();
			ll.add(temp.data);
				if(temp.left!=null){
					q.add(temp.left);
				}
				if(temp.right!=null){
					q.add(temp.right);
				}
				count--;
			}
			llfinal.add(ll);
			
		}
		System.out.println(llfinal);
	}

}
