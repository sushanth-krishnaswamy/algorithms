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
	
	public boolean search(int val){
		return search(root, val);
	}
	
	private boolean search(TreeNode r, int val){
		if(r.getData()==val){
			return true;
		}
		if(r.getLeft()!=null){
			if(search(r.getLeft(),val)){
				return true;
			}
		}
		if(r.getRight()!=null){
			if(search(r.getRight(),val)){
				return true;
			}
		}
		return false;
	}
	
	public void inorder(){
		inorder(root);
	}
	
	private void inorder(TreeNode r){
		if(r!=null){
			inorder(r.getLeft());
			System.out.println(r.getData()+" ");
			inorder(r.getRight());
		}
	}
	
	public void preorder(){
		preorder(root);
	}
	
	private void preorder(TreeNode r){
		if(r!=null){
			System.out.println(r.getData()+" ");
			preorder(r.getLeft());
			preorder(r.getRight());
		}
	}
	
	public void postorder(){
		postorder(root);
	}
	
	private void postorder(TreeNode r){
		if(r!=null){
			postorder(r.getLeft());
			postorder(r.getRight());
			System.out.println(r.getData()+" ");
		}
	}
	
}

public class BinaryTree {

	public static void main(String[] args){
		BinaryTreeImpl bt = new BinaryTreeImpl();
		
		System.out.println("testing binary tree\n");
		
		/*do{
			
		}*/
	}
}
