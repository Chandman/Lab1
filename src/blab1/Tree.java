package blab1;

public class Tree {
	
	int root;
	Tree lchild = null, rchild = null;
	public Tree(int root) {
		this.root = root;
	}
	public void addLeftChild(Tree lchild) {
		this.lchild = lchild;
	}
	public void addRightChild(Tree rchild) {
		this.rchild = rchild;
	}
	public void removeRightChild() {
		rchild = null;
	}
	public void removeLeftChild() {
		lchild = null;
	}
	public Tree getRightChild() {
		return rchild;
	}
	public Tree getLeftChild() {
		return lchild;
	}
	public int getroot() {
		return root;
	}
	
}
