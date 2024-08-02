package mycodes;

import java.util.Scanner;

class node{
	int data;
	node left;
	node right;
	node(int data){
		this.data=data;
	}
}
public class trees {
	static Scanner sc=null;
	public static node create() {
		System.out.println("Enter the data");
		sc=new Scanner(System.in);
		int k=sc.nextInt();
		if(k==-1) return null;
		node obj=new node(k);
		System.out.println("Enter the left child of "+k);
		obj.left=create();
		System.out.println("Enter the right child of "+k);
		obj.right=create();
		return obj;
		
		
	}
	public static void inorder(node root) {
		if(root==null) return;
		inorder(root.left);
		System.out.println(root.data);
		inorder(root.right);
		
	} 
	public static void preorder(node root) {
		if(root==null ) return;
		
		System.out.println(root.data);
		preorder(root.left);
		preorder(root.right);
		
		
	}
	public static void postorder(node root) {
		if(root==null ) return;
		postorder(root.left);
		postorder(root.right);
		System.out.println(root.data);
	}
	public static void main(String ar[]) {
		node root=create();
		System.out.println("INORDER TRAVERSAL");
		inorder(root);
		System.out.println("PREORDER TRAVERSAL");
		preorder(root);
		System.out.println("POSTORDER TRAVERSAL");
		postorder(root);
	}


	

}
