// 이진 탐색 트리

package com.javalec.tree;

import java.util.Scanner;

public class BinarySearchTree {

	public static int getHeight(Node root) {
		return 1;

		// * 이곳에 코딩 *

	}

	public static Node insert(Node root, int data) {

		if (root == null) {
			return new Node(data);
		} else {
			Node cur;
			if (data <= root.data) {
				cur = insert(root.left, data);
				root.left = cur;
			} else {
				cur = insert(root.right, data);
				root.right = cur;
			}
			return root;
		}
	}

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		Node root = null;

		while (T-- > 0) {

			int data = sc.nextInt();

			root = insert(root, data);

		}

		int height = getHeight(root);

		System.out.println(height);

		sc.close();

	}

}
