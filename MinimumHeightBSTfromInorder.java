
public class MinimumHeightBSTfromInorder {
Node root;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
MinimumHeightBSTfromInorder obj=new MinimumHeightBSTfromInorder();
		int a[]={1,2,3,4,5,6,7};
		obj.root=obj.bstConstruct(a, 0, a.length-1);
        obj.inOrder(obj.root);
	}
	
	public Node bstConstruct(int a[],int l,int r){
		if(r<l)return null;
		
		int mid=(l+r)/2;
		Node root=new Node(a[mid]);
		root.left=bstConstruct(a, l, mid-1);
		root.right=bstConstruct(a, mid+1, r);
		return root;
		
	}
	
	public void inOrder(Node root){
		if(root==null)return;
		inOrder(root.left);
		System.out.print(root.data+"->");
        inOrder(root.right);
	}

}
