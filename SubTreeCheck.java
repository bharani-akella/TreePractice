import java.util.Stack;

public class SubTreeCheck {
Node root1;
Node root2;
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
SubTreeCheck obj=new SubTreeCheck();
obj.root1=obj.insert(obj.root1,4);
obj.root1=obj.insert(obj.root1,2);
obj.root1=obj.insert(obj.root1,6);
obj.root1=obj.insert(obj.root1,1);
obj.root1=obj.insert(obj.root1,3);
obj.root1=obj.insert(obj.root1,5);
obj.root1=obj.insert(obj.root1,7);

obj.root2=obj.insert(obj.root2,4);
obj.root2=obj.insert(obj.root2,2);
obj.root2=obj.insert(obj.root2,6);
//obj.root2=obj.insert(obj.root2,1);
//obj.root2=obj.insert(obj.root2,3);
//obj.root2=obj.insert(obj.root2,5);
//obj.root2=obj.insert(obj.root2,7);


boolean result=obj.subTree(obj.root1, obj.root2);

System.out.println(result);

	}
	
	
	public Node insert(Node root, int key) {
		if(root==null){
			return new Node(key);
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
		if(root==null){
			return;
		}
		
		inOrder(root.left);
		System.out.print(root.data+"->");
		inOrder(root.right);
	}
	
	public boolean identical(Node root1,Node root2){
		if(root1==null && root2==null){
			return true;
		}
		
		if(root1!=null && root2!=null){
			if((root1.data==root2.data)&&(identical(root1.left,root2.left))&&identical(root1.right,root2.right)){
				return true;
			}
		}
		return false;
	}
	
	public boolean subTree(Node M,Node S){
		if(S==null)return true;
		if(M==null)return false;
		if(identical(M, S))return true;
		
		return (subTree(M.left, S)||subTree(M.right, S));
		
	}
		
}
