package edu.sdsu.tree;

import edu.sdsu.node.Node;

public class BinarySearchTree {
   Node root;
   public BinarySearchTree(){
      this.root = null;
   }

   public BinarySearchTree(int value){
      this.root = new Node(value);
   }
   public void add(int val){
      this.root = recursiveInsert(val, this.root);
   }

   /**
    * Convert this to boolean later on
    * @param value
    */
   private Node recursiveInsert(int value, Node node){
      if(node == null){
         node = new Node(value);
         return node;
      } else if (node.getVal() > value) {
         node.setLeft( recursiveInsert(value, node.getLeft()) );
      } else {
         node.setRight(recursiveInsert(value, node.getRight()));
      }
      return node;
   }
   public void inorder(){
      inorderRec(this.root);
   }
   private void inorderRec(Node root)
   {
      if (root != null) {
         inorderRec(root.getLeft());
         System.out.println(root.getVal());
         inorderRec(root.getRight());
      }
   }
}
