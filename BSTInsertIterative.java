package interview;
import java.util.LinkedList;
import java.util.Queue;

public class BSTInsertIterative {
Node root;

public static void main(String[] args) {
	// TODO Auto-generated method stub
         BSTInsertIterative bst=new BSTInsertIterative();
         bst.insert(10);
         bst.insert(5);
         bst.insert(20);
         bst.insert(0);
         bst.insert(8);
         bst.insert(60);
         System.out.println("InOrder");
         bst.inorder(bst.root);     
         System.out.println("\nPostOrder");
         bst.postorder(bst.root);
         System.out.println("\nPreOrder");
         bst.preorder(bst.root);
         System.out.println("\nLevelOrder");
         bst.levelOrder(bst.root);
}


public void insert(int key){
Node n1=new Node(key);
	Node parent=root;
	Node child=root;
if(root==null){
	root=n1;
	parent=root;
	child=root;
	return;
}

while(child!=null){
	parent=child;
	if(key<child.data){
		child=child.left;
	}else{
		child=child.right;
	}
}

if(key<parent.data){
	parent.left=n1;
}else{
	parent.right=n1;
}

}

public void preorder(Node root){
	if(root==null)return;
	System.out.print(root.data+" ");
	preorder(root.left);
	preorder(root.right);
}

public void inorder(Node root){
	if(root==null)return;
	inorder(root.left);
	System.out.print(root.data+" ");
	inorder(root.right);
}

public void postorder(Node root){
	if(root==null)return;
	postorder(root.left);
	postorder(root.right);
	System.out.print(root.data+" ");
}

public void levelOrder(Node root){
	if(root==null)return;
	Queue<Node> q=new LinkedList<Node>();
	q.add(root);
	Node temp;
	while(!q.isEmpty()){
		temp=q.poll();
		System.out.print(temp.data+" ");
		if(temp.left!=null){
			q.add(temp.left);
		}
		if(temp.right!=null){
			q.add(temp.right);
		}
	}
}

}
