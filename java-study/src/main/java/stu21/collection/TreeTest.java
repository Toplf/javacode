package stu21.collection;

class Tree {
	
	private class Node {
		private Object value;
		private Node left;
		private Node right;
	}
	
	private Node root;
	private int size;
	
	public void add(Object val) {
		Node newNode = new Node();
		newNode.value = val;
		if (root == null) {
			root = newNode;
		} else {
			insert(root, newNode);
		}
		size++;
	}

	private void insert(Node node, Node newNode) {
		if (((Comparable)newNode.value).compareTo(node.value) < 0) {
			if (node.left == null) {
				node.left = newNode;
			} else {
				insert(node.left, newNode);
			}
		} else if (((Comparable)newNode.value).compareTo(node.value) > 0) {
			if (node.right == null) {
				node.right = newNode;
			} else {
				insert(node.right, newNode);
			}
		}
	}
	
	public void travel() {
		access(root);
	}

	private void access(Node node) {
		if (node == null) {
			return;
		}
		access(node.left);
		System.out.println(node.value);
		access(node.right);
	}
}

public class TreeTest {
	
	public static void main(String[] args) {
		Tree tree = new Tree();
		
		tree.add("yy");
		tree.add("cc");
		tree.add("dd");
		tree.add("aa");
		tree.add("ee");
		tree.add("f1");
		tree.add("f2");
		tree.add("f3");
		tree.add("f4");
		tree.add("f5");
		
		tree.travel();
	}
}
