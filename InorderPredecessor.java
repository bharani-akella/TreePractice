package interview;

public class InorderPredecessor {
Node root;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
             InorderPredecessor obj=new InorderPredecessor();
          obj.insert( 10);
          obj.insert( 20);
          obj.insert( 5);
          obj.insert( 67);
          obj.insert(40);
          
          
             obj.inOrderTraversal(obj.root);
              Node predecessor=obj.inOrderPredecessor(obj.root, 40);
              if(predecessor!=null){
            	  System.out.println("\nPredecessor of 40 is "+predecessor.data);
                    
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
	
	public void inOrderTraversal(Node root){
		if(root==null)return;
		inOrderTraversal(root.left);
		System.out.print(root.data+" ");
		inOrderTraversal(root.right);
		
	}

	public Node inOrderPredecessor(Node root,int key){
		Node current=search(root,key);
		if(current==null)return null;
		
		if(current.left!=null){
		      return max(current.left);	
		}else{
			Node ancestor=root;
			Node predecessor=null;
			while(ancestor!=current){
				if(key>ancestor.data){
					predecessor=ancestor;
					ancestor=ancestor.right;
				}else if(key<ancestor.data){
					ancestor=ancestor.left;
				}
			}
			return predecessor;
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
	
	public Node max(Node root){
		Node maxV=root;
		while(root.right!=null){
			maxV=root.right;
			root=root.right;
		}
		return maxV;
	}
	
}
