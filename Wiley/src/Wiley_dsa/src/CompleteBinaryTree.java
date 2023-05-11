public class CompleteBinaryTree {
	Node root;
	
	public CompleteBinaryTree() {
		// TODO Auto-generated constructor stub
		root = null;
	}
	
	int countNumOfNodes(Node node) {
		if(node == null) return 0;
		return (1+countNumOfNodes(node.left) + countNumOfNodes(node.right));
	}
	
	boolean checkComplete(Node node, int index, int numberOfNodes) {
		if(node == null) {
			return true;
		}
		if(index>=numberOfNodes) {
			return false;
		}
		return ((checkComplete(node.left,2*index+1,numberOfNodes) && checkComplete(node.right,2*index+1,numberOfNodes)));
	}
	public static void main(String[] args) {
		CompleteBinaryTree tree = new CompleteBinaryTree();
		
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		tree.root.right.left = new Node(6);
		System.out.println(tree.checkComplete(tree.root, 0, tree.countNumOfNodes(tree.root)));
	}
}