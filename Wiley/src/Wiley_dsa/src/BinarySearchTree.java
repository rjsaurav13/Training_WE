public class BinarySearchTree {
	Node root;
	public BinarySearchTree() {
		root = null;
	}
	boolean search(Node root, int x) {
		if(root == null) return false;
		if(root.data == x) {
			return true;
		} else if (root.data>x) {
			return search(root.left,x);
		} else if(root.data<x) {
			return search(root.right,x);
		}
		return false;
	}
	
	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		bst.root = new Node(8);
		bst.root.left = new Node(3);
		bst.root.right = new Node(10);
		bst.root.left.left = new Node(1);
		bst.root.left.right = new Node(5);
		bst.root.right.left = new Node(9);
		System.out.println(bst.search(bst.root, 9));
	}
}