package edu.sdsu.tree;


import edu.sdsu.node.Node;
import edu.sdsu.node.NullNode;

public class BinarySearchTree <E extends  Comparable<E>>{
   Node root;
   public BinarySearchTree(){
      this.root = null;
   }
   public void add(E val){
      this.root = recursiveInsert(val, this.root);
   }

   private Node recursiveInsert(E value, Node node){
      if(node == null){
         node = new Node(value);
         return node;
      } else if (node.getValue().compareTo(value) > 0){
         node.setLeft( recursiveInsert(value, node.getLeft()) );
      } else {
         node.setRight(recursiveInsert(value, node.getRight()));
      }
      return node;
   }
   public void inorder(){
      inorderRec(this.root);
   }
   private void inorderRec(Node root){
      if (root != null) {
         inorderRec(root.getLeft());
         System.out.println(root.getValue());
         inorderRec(root.getRight());
      }
   }
}
