package edu.sdsu.tree;

import edu.sdsu.node.Node;
import edu.sdsu.node.NullNode;


public class BinarySearchTree <E extends Comparable<E>> {
   Node root;
   public BinarySearchTree(){
      this.root = NullNode.getInstance();
   }
   public void add(E val){
      this.root = recursiveInsert(val, this.root);
   }

   /*Strategy content*/
   private Node recursiveInsert(E value, Node node){
      if(node.isNull()){
         node = new Node(value);
         return node;
      } else if (node.getValue().compareTo(value) > 0){
         node.setLeft(  recursiveInsert(value, node.getLeft()) );
      } else {
         node.setRight(recursiveInsert(value, node.getRight()));
      }
      return node;
   }

   public BSTIterator createIterator(){
      return new BSTIterator(this.root);
   }
}
