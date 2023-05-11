class Height{
	int height = 0;
}

public class BalancedTree {
	
	Node root;
	
	boolean checkHeightBalance(Node root, Height height) {
		
		if(root == null) {
			height.height = 0;
			return true;
		}
		
		Height leftHeight = new Height(), rightHeight = new Height();
		
		boolean l = checkHeightBalance(root.left, leftHeight);
		boolean r = checkHeightBalance(root.right, rightHeight);
		
		int lh = leftHeight.height, rh = rightHeight.height;
		
		height.height = (lh > rh ? lh : rh) + 1;
		
		if(lh-rh >= 2 || rh-lh >= 2) {
			return false;
		}
		else return l && r;
		
	}
	
	public static void main(String[] args) {
		
		Height height = new Height();
		
		BalancedTree tree = new BalancedTree();
		
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		
		if(tree.checkHeightBalance(tree.root, height)) {
			System.out.println("Balanced tree");
		}
		else {
			System.out.println("Not balanced tree");
		}
		
	}

}