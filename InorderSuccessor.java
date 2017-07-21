package interview;

public class InorderSuccessor {
Node root;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
             InorderSuccessor obj=new InorderSuccessor();
          obj.insert( 10);
          obj.insert( 20);
          obj.insert( 5);
          obj.insert( 67);
          obj.insert(40);
          
          
             obj.inOrder(obj.root);
              Node successor=obj.inOrderSuccessor(obj.root, 100);
              if(successor!=null){
            	  System.out.println("\nSuccessor of 10 is "+successor.data);
                    
              }else{
            	  System.out.println("\nSuccessor is not present");
              }
              
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

	public Node inOrderSuccessor(Node root,int key){
		Node current=search(root,key);
		if(current==null)return null;
		
		if(current.right!=null){
		      return min(current.right);	
		}else{
			Node ancestor=root;
			Node successor=null;
			while(ancestor!=current){
				if(key<ancestor.data){
					successor=ancestor;
					ancestor=ancestor.left;
				}else if(key>ancestor.data){
					ancestor=ancestor.right;
				}
			}
			return successor;
		}
		
	}
	
	public Node search(Node root,int key){
		if(root==null)return root;
		if(key==root.data){
			return root;
		}
		if(key<root.data){
			return search(root.left,key);
		}
		if(key>root.data){
			return search(root.right,key);
		}
		return root;
	}
	
	public Node min(Node root){
		Node minV=root;
		while(root.left!=null){
			minV=root.left;
			root=root.left;
		}
		return minV;
	}
	
}
