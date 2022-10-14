package edu.sdsu.node;

import java.util.function.Consumer;

public class Node<E extends Comparable <E>> implements INode{
   private E value;
   private Node left;
   private Node right;
   public Node(){
      super();
   }
   public Node(E value){
      this.value = value;
      this.left = NullNode.getInstance();
      this.right = NullNode.getInstance();
   }

   public boolean isNull(){
      return false;
   }
   public E getValue() {
      return value;
   }

   public void setValue(E value) {
      this.value = value;
   }

   @Override
   public Node getLeft() {
      return this.left;
   }
   @Override
   public Node getRight() {
      return this.right;
   }

   public void setLeft(Node left) {
      this.left = left;
   }
   public void setRight(Node right) {
      this.right = right;
   }

}
