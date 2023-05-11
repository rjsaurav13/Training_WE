
class Node{
	int item;
	Node left,right;
	public int data;
	public Node(int key) {
		item=key;
		left=right=null;
	}
}

public class BinaryTree {
	Node root;
	public BinaryTree() {
		root=null;
	}
	void postOrder(Node node) {
		if(node==null) {
			return;
		}
		
	}
	public static void main(String[] args) {
		
	}
}
