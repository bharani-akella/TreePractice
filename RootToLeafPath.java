import java.util.Stack;

public class RootToLeafPath {
Node root;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
RootToLeafPath obj=new RootToLeafPath();
obj.insert(4);
obj.insert(2);
obj.insert(6);
obj.insert(1);
obj.insert(3);
obj.insert(5);
obj.insert(7);

Stack<Integer> s=new Stack<Integer>();



obj.inOrder(obj.root,s);

	}
	
	public void insert(int key){
		root=insert_rec(root,key);
	}

	public Node insert_rec(Node root, int key) {
		if(root==null){
			return new Node(key);
		} 
		if(key<root.data){
			root.left=insert_rec(root.left, key);
		}
		
		if(key>root.data){
			root.right=insert_rec(root.right, key);
		}
		
		return root;
	}
	
	public void inOrder(Node root,Stack<Integer> s){
		if(root==null){
			return;
		}
		s.add(root.data);
		inOrder(root.left,s);
		if(root.left==null && root.right==null){
			for(int i=0;i<s.size();i++){
				System.out.print(s.get(i)+"->");
			}
		}
	System.out.println("");
		inOrder(root.right,s);
		s.pop();
		
	}
	

}
