package ctcr_codes;

class TreeNode{
	
	TreeNode left,right;
	int data;
	
	public TreeNode(){
		left = null;
		right = null;
		data=0;
	}
	public TreeNode(int n){
		left = null;
		right = null;
		 data = n;
		 
	}
	public void setLeft(TreeNode n){
		left = n;
	}
	public void setRight(TreeNode n){
		right = n;
	}
	public TreeNode getLeft(){
		return left;
	}
	
	public TreeNode getRight(){
		return right;
	}
	
	public void setData(int n){
		data = n;
	}
	public int getData(){
		return data;
	}
}

class BinaryTreeImpl{
	
	private TreeNode root;
	
	public BinaryTreeImpl(){
		root = null;
	}
	public boolean isEmpty(){
		return root==null;
	}
	public void insert(int data){
		root = insert(root,data);
	}
	
	private TreeNode insert(TreeNode node, int data){
		if(node ==null){
			node = new TreeNode(data);
		}
		else{
			if(node.getRight()==null){
				node.right=insert(node.right,data);
			}
			else{
				node.left=insert(node.left,data);
			}
		}
		return node;
		
	}
	
	public int countNodes(){
		return countNodes(root);
	}
	
	private int countNodes(TreeNode r){
		if(r==null){
			return 0;
		}
		else{
			int l=1;
			l=l+countNodes(r.getLeft());
			l=l+countNodes(r.getRight());
			return l;
		}
	}
	
	
	
}

public class BinaryTree {

}
