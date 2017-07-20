package interview;

public class BSTMax {
Node root;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
             BSTMax obj=new BSTMax();
          obj.insert( 10);
          obj.insert( 20);
          obj.insert( 5);
          obj.insert( 67);
          obj.insert(40);
          
          
             obj.inOrder(obj.root);
         Node result=obj.max(obj.root); 
         System.out.println("\nMaximum value is "+result.data);
             
	}
	
	
	public void insert(int key){
		root=insert(root,key);
	}
	
	public Node insert(Node root,int key){
		if(root==null){
			Node n1=new Node(key);
			return n1;
		}
		if(key<root.data){
			root.left=insert(root.left, key);	
		}
		if(key>root.data){
			root.right=insert(root.right, key);	
		}
	return root;	
	}
	
	public void inOrder(Node root){
		if(root==null)return;
		inOrder(root.left);
		System.out.print(root.data+" ");
		inOrder(root.right);
		
	}

	public Node max(Node root){
		if(root==null)return root;
		if(root.right==null){
			return root;
		}
		return max(root.right);
	}
	
}
