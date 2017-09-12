import java.util.Stack;

public class BinaryTreeToDLL {
Node root;
Node head;
static Node prev; 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
BinaryTreeToDLL obj=new BinaryTreeToDLL();
obj.insert(4);
obj.insert(2);
obj.insert(6);
obj.insert(1);
obj.insert(3);
obj.insert(5);
obj.insert(7);

obj.convert(obj.root);

obj.traverse();

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
	
	
		public void convert(Node root){
			if(root==null)return;
			
			convert(root.left);
			if(prev==null){
				head=root;
			}else{
				root.left=prev;
				prev.right=root;
			}
			prev=root;
			convert(root.right);
		}
		
		public void traverse(){
			Node temp=head;
			while(temp!=null){
				System.out.print(temp.data+"->");
				temp=temp.right;
			}
		}

}
