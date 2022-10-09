package edu.sdsu.node;

public class Node {
   private int val;
   private Node left;
   private Node right;
   public Node(int value){
      this.val = value;
      this.left = null;
      this.right = null;
   }

   public int getVal() {
      return val;
   }

   public void setVal(int val) {
      this.val = val;
   }

   public Node getLeft() {
      return left;
   }

   public void setLeft(Node left) {
      this.left = left;
   }

   public Node getRight() {
      return right;
   }

   public void setRight(Node right) {
      this.right = right;
   }
}
