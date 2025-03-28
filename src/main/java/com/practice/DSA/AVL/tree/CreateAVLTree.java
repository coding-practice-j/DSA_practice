package com.practice.DSA.AVL.tree;

public class CreateAVLTree {

	public static void main(String[] args) {
		AVLNode root = new AVLNode();

		root = null;

		root = insert(root, 10);
		root = insert(root, 20);
		root = insert(root, 30);
		root = insert(root, 25);
		root = insert(root, 28);
		root = insert(root, 27);
		root = insert(root, 5);
		
		inorder(root);							//  		25
												//		10		  28
		// Delete								//	 5	   20  27	 30
	    root = delete(root, 10);
	    System.out.println("After deletion :" + root.data);
	    
	    inorder(root);

	}

	private static AVLNode InPre(AVLNode p) {
	    while (p != null && p.right != null){
	        p = p.right;
	    }
	    return p;
	}
	 
	private static AVLNode InSucc(AVLNode p) {
	    while (p != null && p.left != null){
	        p = p.left;
	    }
	    return p;
	}
	
	private static AVLNode delete(AVLNode root, int key) {
		if(root == null) {
			return null;
		}
		if(key < root.data) {
			root.left = delete(root.left, key);
		}else if(key > root.data) {
			root.right = delete(root.right, key);
		}else {
			AVLNode q = new AVLNode();
			if(nodeHeight(root.left) > nodeHeight(root.right)) {
				q = InPre(root.left);
				root.data = q.data;
				root.left = delete(root.left, key);
			}else {
				q = InSucc(root);
				root.data = q.data;
				root.right = delete(root.right, key);
			}
		}
		
		root.height = nodeHeight(root);
		
		 // Balance Factor and Rotation
	    if (balanceFactor(root) == 2 && balanceFactor(root.left) == 1) {  // L1 Rotation
	        return LLRotation(root);
	    } else if (balanceFactor(root) == 2 && balanceFactor(root.left) == -1){  // L-1 Rotation
	        return LRRotation(root);
	    } else if (balanceFactor(root) == -2 && balanceFactor(root.right) == -1){  // R-1 Rotation
	        return RRRotation(root);
	    } else if (balanceFactor(root) == -2 && balanceFactor(root.right) == 1){  // R1 Rotation
	        return RLRotation(root);
	    } else if (balanceFactor(root) == 2 && balanceFactor(root.left) == 0){  // L0 Rotation
	        return LLRotation(root);
	    } else if (balanceFactor(root) == -2 && balanceFactor(root.right) == 0){  // R0 Rotation
	        return RRRotation(root);
	    }
		
		return root;
	}

	private static AVLNode insert(AVLNode root, int key) {

		if (root == null) {
			root = new AVLNode();
			root.data = key;
			root.height = 1;
			root.left = null;
			root.right = null;
		} else {
			if (key < root.data) {
				root.left = insert(root.left, key);
			} else {
				root.right = insert(root.right, key);
			}

			// Update height
			root.height = nodeHeight(root);

			// Balance Factor & Rotation
			if (balanceFactor(root) == 2 && balanceFactor(root.left) == 1) {
				return LLRotation(root);
			} else if (balanceFactor(root) == 2 && balanceFactor(root.left) == -1) {
				return LRRotation(root);
			} else if (balanceFactor(root) == -2 && balanceFactor(root.right) == -1) {
				return RRRotation(root);
			} else if (balanceFactor(root) == -2 && balanceFactor(root.right) == 1) {
				return RLRotation(root);
			}
		}
		return root;
	}

	private static AVLNode RLRotation(AVLNode root) {
		AVLNode pr = root.right;
		AVLNode prl = pr.left;
		
		pr.left = prl.right;
		root.right = prl.left;
		
		//Making prl as root element
		prl.right = pr;
		prl.left = root;
		
		root.height = nodeHeight(root);
		pr.height = nodeHeight(pr);
		prl.height = nodeHeight(prl);
		
		return prl;
	}

	private static AVLNode RRRotation(AVLNode root) {
		AVLNode pr = root.right;
		AVLNode prl = pr.left;
		
		pr.left = root;
		root.right = prl;
		
		root.height = nodeHeight(root);
		pr.height = nodeHeight(pr);
		
		return pr;
	}

	private static AVLNode LRRotation(AVLNode root) {
		AVLNode pl = root.left;
		AVLNode plr = pl.right;
		
		pl.right = plr.left;
		root.left = plr.right;
		
		plr.right = root;
		plr.left = pl;
		
		root.height = nodeHeight(root);
		pl.height = nodeHeight(pl);
		plr.height = nodeHeight(plr);
		
		return plr;
	}

	private static AVLNode LLRotation(AVLNode root) {
		AVLNode pl = root.left;
		AVLNode plr = pl.right;
		
		pl.right = root;
		root.left = plr;
		
		root.height = nodeHeight(root);
		pl.height = nodeHeight(pl);
		
		return pl;
	}

	private static int balanceFactor(AVLNode root) {
		int hl;
		int hr;
		hl = (root != null && root.left != null) ? root.left.height : 0;
		hr = (root != null && root.right != null) ? root.right.height : 0;
		return hl - hr;
	}

	private static int nodeHeight(AVLNode root) {
		int hl;
		int hr;
		hl = (root != null && root.left != null) ? root.left.height : 0;
		hr = (root != null && root.right != null) ? root.right.height : 0;
		return hl > hr ? hl + 1 : hr + 1;
	}
	
	private static void inorder(AVLNode root) {
		if(root != null) {
			inorder(root.left);
			System.out.println(root.data + ":" + root.height);
			inorder(root.right);
		}
		
	}

}
