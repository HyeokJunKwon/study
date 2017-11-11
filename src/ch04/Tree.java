package ch04;

public class Tree {
    LinkedList node;
    Tree left;
    Tree right;
    
    Tree(LinkedList node, Tree left, Tree right) {
        this.node = node;
        this.left = left;
        this.right = right;
    }
    
	void inOrderTraversal(Tree node) {
		if (node != null) {
			inOrderTraversal(node.left);
			System.out.println(node.getData());
			inOrderTraversal(node.right);
		}
	}
    
    int getData() {
    	return node.data;
    }

    public static void main(String[] args) {
    	
    	LinkedList l2 = new LinkedList(2, null);
    	Tree node2 = new Tree(l2,null, null);
    	LinkedList l6 = new LinkedList(6,null);
    	Tree node6 = new Tree(l6,null, null);
    	LinkedList l20 = new LinkedList(20, null);
    	Tree node20 = new Tree(l20,null, null);
    	LinkedList l4 = new LinkedList(4,null);
    	Tree node4 = new Tree(l4,node2, node6);
    	LinkedList l10 = new LinkedList(10,null);
    	Tree node10 = new Tree(l10,null, node20);
        LinkedList l8 = new LinkedList(8,null);
        Tree node8 = new Tree(l8,node4, node10);
        
        /*
        LinkedList l2 = new LinkedList(2, null);
        Tree node2 = new Tree(l2,null, null);
        LinkedList l12 = new LinkedList(12,null);
        Tree node12 = new Tree(l12,null, null);
        LinkedList l20 = new LinkedList(20, null);
        Tree node20 = new Tree(l20,null, null);
        LinkedList l4 = new LinkedList(4,null);
        Tree node4 = new Tree(l4,node2, node12);
        LinkedList l10 = new LinkedList(10,null);
        Tree node10 = new Tree(l10,null, node20);
        LinkedList l8 = new LinkedList(8,null);
        Tree node8 = new Tree(l8,node4, node10);
        */
        
        node8.inOrderTraversal(node8);
    }
}

class LinkedList {
    int data;
    LinkedList next;
    LinkedList(int data, LinkedList next) { 
        this.data = data;
        this.next = next;
    }
}

